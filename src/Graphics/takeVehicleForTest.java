package Graphics;

import abstractClass.Vehicle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

public class takeVehicleForTest {

    private ExecutorService executorService;
    private JFrame frame = new JFrame("Take vehicle for test");
    private ImageIcon imageVehicle;
    private JComboBox<Double> comboBox;
    private JButton OK;

    // Constructor
    public takeVehicleForTest() {
        frame.setBounds(100, 100, 800, 600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(0, 3, 10, 10)); // 3 columns
        frame.getContentPane().setBackground(Color.darkGray);

        comboBox = new JComboBox<>();
        for (Double i = (double) 0; i < 200000; i += 5) {
            comboBox.addItem(i);
        }
        comboBox.setSelectedItem("choose a distance");

        ArrayList<JLabel> labels = new ArrayList<>();
        for (Vehicle vehicle : frameCars.vehicleList) {
            JLabel label = createVehiclePanel(vehicle);
            frame.getContentPane().add(label);
            labels.add(label);
        }

        frame.setVisible(true);
        executorService = Executors.newFixedThreadPool(7); // Thread pool with maximum 7 threads
    }

    // Create panel for a vehicle
    private JLabel createVehiclePanel(Vehicle vehicle) {
        JLabel panel = new JLabel();
        panel.setLayout(new GridLayout(2, 1)); // 2 rows

        // Add image
        JLabel imageLabel = new JLabel();
        imageLabel.setPreferredSize(new Dimension(200, 200));

        imageVehicle = new ImageIcon(vehicle.getPath());
        System.out.println(vehicle.getPath());

        Image image = imageVehicle.getImage();
        image = image.getScaledInstance(250, 300, java.awt.Image.SCALE_SMOOTH);

        this.imageVehicle = new ImageIcon(image);
        imageLabel.setIcon(imageVehicle);
        panel.add(imageLabel);

        // Add details
        JTextArea detailsArea = new JTextArea(vehicle.toString());
        detailsArea.setEditable(false);
        panel.add(detailsArea);

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JPanel panelComboBox = new JPanel(new GridBagLayout());
                JOptionPane.showMessageDialog(null, comboBox, " choose distance ", JOptionPane.QUESTION_MESSAGE);
                panel.add(panelComboBox);
                Double distance = (Double) comboBox.getSelectedItem();
                    if (vehicle.getTotalDistance() + distance < 200000) {
                        if (!TestManager.isVehicleInTest(vehicle)) {
                            try {
                                // Submitting the test task to the thread pool
                                executorService.submit(() -> startTest(vehicle, distance));
                                JOptionPane.showMessageDialog(null, "The vehicle is now being tested.", "Success", JOptionPane.INFORMATION_MESSAGE);
                                frameCars.distanceObserver.updating(-(Vehicle.totalDistanceOfAllVehicle));
                            } catch (RejectedExecutionException ex) {
                                JOptionPane.showMessageDialog(null, "Maximum number of tests reached. Please try again later.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "This vehicle is already being tested.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "You can't travel more than 200000 km", "Error", JOptionPane.ERROR_MESSAGE);
                    }

            }
        });

        return panel;
    }

    // Method to start the test for a vehicle
    private void startTest(Vehicle vehicle, double distance) {
        synchronized (Vehicle.getSharedLock()) {
            try {
                vehicle.TravelDistance(distance);
                TestManager.startTest(vehicle, distance);
            } catch (IllegalStateException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
