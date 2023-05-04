package Graphics;

import RegularClasses.*;
import abstractClass.Vehicle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameForEachVehicleDetails extends JFrame implements ActionListener {

    //data members
    private JTextField modelNameField;
    private String modelName;
    private JTextField maxSpeedField;
    private JTextField AverageFuelConsumptionField;
    private JTextField AverageLifeTimeField;

    private ImageIcon image1, image2, image3;

    private JRadioButton radio1, radio2, radio3, validateButton;
    JLabel imageLabel;
    String vehicleType;

    private JComboBox<Double> comboBoxSpeed;
    private JComboBox<Double> comboBoxFuel;
    private JComboBox<Double> comboBoxLifeTime;
    private JComboBox<Integer> comboBoxPassengers;

    private JButton confirmButton;


    String path;

    //constructor
    public FrameForEachVehicleDetails (String vehicleType) {
        this.vehicleType = vehicleType;
        setTitle(vehicleType + " Details"); //title frame
        setSize(1000, 10000); //size frame
        setLocationRelativeTo(null); //center the frame
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        //images
        image1 = new ImageIcon("images/" + vehicleType + "Images/" + vehicleType + "1.png");
        image2 = new ImageIcon("images/" + vehicleType + "Images/" + vehicleType + "2.png");
        image3 = new ImageIcon("images/" + vehicleType + "Images/" + vehicleType + "3.png");

        //take image from imageIcon
        Image image1 = this.image1.getImage();
        Image image2 = this.image2.getImage();
        Image image3 = this.image3.getImage();

        //resize the image
        Image newImage1 = image1.getScaledInstance(800, 600, Image.SCALE_SMOOTH);
        Image newImage2 = image2.getScaledInstance(800, 600, Image.SCALE_SMOOTH);
        Image newImage3 = image3.getScaledInstance(800, 600, Image.SCALE_SMOOTH);

        //put back the image to imageIcon
        this.image1 = new ImageIcon(newImage1);
        this.image2 = new ImageIcon(newImage2);
        this.image3 = new ImageIcon(newImage3);

        //create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        getContentPane().add(panel);
        panel.setBackground(Color.DARK_GRAY);



        //Radio Buttons for images
        ButtonGroup group = new ButtonGroup();
        radio1 = new JRadioButton(vehicleType + "1", true);
        group.add(radio1);
        radio1.addActionListener( this);
        radio2 = new JRadioButton(vehicleType + "2");
        group.add(radio2);
        radio2.addActionListener( this);
        radio3 = new JRadioButton(vehicleType + "3");
        group.add(radio3);
        radio3.addActionListener( this);

        panel.add(radio1);
        panel.add(radio2);
        panel.add(radio3);

        //image label
        imageLabel = new JLabel();
        panel.add(imageLabel);
        imageLabel.setPreferredSize(new Dimension(800, 500));

        confirmButton = new JButton("Confirm All");
        confirmButton.addActionListener(this);
        panel.add(confirmButton);



        switch (vehicleType) {
            case "Jeep": {

                //add text fields for model
                panel.add(panelModel());
                //combobox for max speed
                panel.add(panelMaxSpeed(1000));
                //combobox for fuel consumption
                panel.add(panelMaxFuel(100));
                //combobox for lifetime
                panel.add(panelLifeTime(100));
                break;
            }
            case "Frigate": {
                //add text fields for model
                panel.add(panelModel());
                //combobox MaxSpeed
                panel.add(panelMaxSpeed(1000));
                //combo box for Maximum passengers
                panel.add(panelMaxPassenger(50000));
                break;
            }
            case "GamePlane": {

                break;
            }
            case "SpyPlane": {

                break;
            }
            case "Bicycle": {
                break;
            }
            case "Cruise": {
                break;
            }
            case "Amphibious": {
                break;
            }
        }
    }


    public JPanel panelModel(){
        JPanel panelModel = new JPanel();
        modelNameField = new JTextField("Enter Model Name", 25);
        panelModel.add(modelNameField);
        modelNameField.addActionListener(this);
        validateButton = new JRadioButton("Confirm");
        panelModel.add(validateButton);
        validateButton.addActionListener(this);
        return panelModel;

    }

    public JPanel panelMaxSpeed(int limit){
        JPanel panelMaxSpeed = new JPanel();
        JLabel maxSpeedLabel = new JLabel("Enter Max Speed");
        panelMaxSpeed.add(maxSpeedLabel);
        comboBoxSpeed = new JComboBox<Double>();
        for (double i = 5; i <= limit; i += 5) {
            comboBoxSpeed.addItem(i-1);
        }
        panelMaxSpeed.add(comboBoxSpeed);
        return panelMaxSpeed;
    }

    public JPanel panelMaxFuel(int limit){
        JPanel panelMaxFuel = new JPanel();
        JLabel maxFuelLabel = new JLabel("Enter Max Fuel");
        panelMaxFuel.add(maxFuelLabel);
        comboBoxFuel = new JComboBox<Double>();
        for (double i = 1; i <= limit; i++) {
            comboBoxFuel.addItem(i);
        }
        panelMaxFuel.add(comboBoxFuel);
        return panelMaxFuel;
    }

    public JPanel panelLifeTime(int limit){
        JPanel panelLifeTime = new JPanel();
        JLabel lifeTimeLabel = new JLabel("Enter Life Time");
        panelLifeTime.add(lifeTimeLabel);
        comboBoxLifeTime = new JComboBox<Double>();
        for (double i = 1; i <= limit; i++) {
            comboBoxLifeTime.addItem(i);
        }
        panelLifeTime.add(comboBoxLifeTime);
        return panelLifeTime;
    }

    public JPanel panelMaxPassenger(int limit){
        JPanel panelMaxPassenger = new JPanel();
        JLabel MaxPassengerLabel = new JLabel("Enter Max passenger");
        panelMaxPassenger.add(MaxPassengerLabel);
        comboBoxPassengers = new JComboBox<Integer>();
        for (int i = 1; i <= limit; i++) {
            comboBoxPassengers.addItem(i);
        }
        panelMaxPassenger.add(comboBoxPassengers);
        return panelMaxPassenger;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == radio1){
            imageLabel.setIcon(image1);
            path = "images/" + vehicleType + "Images/" + vehicleType + "1.png";
            System.out.println(path);
        }
        if (source == radio2){
            imageLabel.setIcon(image2);
            path = "images/" + vehicleType + "Images/" + vehicleType + "2.png";
            System.out.println(path);
        }
        if (source == radio3){
            imageLabel.setIcon(image3);
            path = "images/" + vehicleType + "Images/" + vehicleType + "3.png";
            System.out.println(path);
        }
        if (source == validateButton){
            modelName = modelNameField.getText();
            System.out.println("Model Name: " + modelName);
        }
        if (source == comboBoxSpeed){
            double selectValue = (double) comboBoxSpeed.getSelectedItem();
        }
        if(source == confirmButton){
            frameCars.vehicleList.add(new Jeep(modelName, (Double)comboBoxSpeed.getSelectedItem(), (Double) comboBoxFuel.getSelectedItem(), (Double) comboBoxLifeTime.getSelectedItem()));


            //essaie de fonctionnement de la liste
            for(Vehicle vehicle : frameCars.vehicleList){
                System.out.println(vehicle.toString());
            }
        }


    }


}




