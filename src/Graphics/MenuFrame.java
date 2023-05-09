package Graphics;
import abstractClass.Vehicle;

import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.exit;

public class MenuFrame extends JFrame implements ActionListener {

    //data members
    private ImageIcon iconAddVehicle = new ImageIcon("images/Icons/addVehicle.png");
    private ImageIcon iconBuyVehicle = new ImageIcon("images/Icons/buyVehicle.png");
    private ImageIcon iconTakeVehicle = new ImageIcon("images/Icons/takeVehicleForTest.png");
    private ImageIcon iconResetDistance = new ImageIcon("images/Icons/resetDistance.png");
    private ImageIcon iconChangeFlag = new ImageIcon("images/Icons/changeFlag.png");
    private ImageIcon iconExit = new ImageIcon("images/Icons/exit.png");


    private JButton addVehicleButton = new JButton("Add Vehicle");
    private JButton buyVehicleButton = new JButton("Buy Vehicle");
    private JButton takeVehicleButton = new JButton("Take vehicle for test");
    private JButton resetDistanceButton = new JButton("Reset Distance");
    private JButton changeFlagButton = new JButton("Change flag");
    private JButton exitButton = new JButton("Exit");




    //constructor
    public MenuFrame() {
        super("Menu user");
        this.setSize(800, 600);

        JPanel panel = new JPanel(new GridLayout(6, 1));
        getContentPane().add(panel);
        panel.setBackground(Color.darkGray);

        //take image from imageIcon and change size
        Image imageAddVehicle = iconAddVehicle.getImage();
        imageAddVehicle = imageAddVehicle.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        Image imageBuyVehicle = iconBuyVehicle.getImage();
        imageBuyVehicle = imageBuyVehicle.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        Image imageTakeVehicle = iconTakeVehicle.getImage();
        imageTakeVehicle = imageTakeVehicle.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        Image imageResetDistance = iconResetDistance.getImage();
        imageResetDistance = imageResetDistance.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        Image imageChangeFlag = iconChangeFlag.getImage();
        imageChangeFlag = imageChangeFlag.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        Image imageExit = iconExit.getImage();
        imageExit = imageExit.getScaledInstance(50, 50, Image.SCALE_SMOOTH);

        //comeback to imageIcon
        this.iconAddVehicle = new ImageIcon(imageAddVehicle);
        this.iconBuyVehicle = new ImageIcon(imageBuyVehicle);
        this.iconTakeVehicle = new ImageIcon(imageTakeVehicle);
        this.iconResetDistance = new ImageIcon(imageResetDistance);
        this.iconChangeFlag = new ImageIcon(imageChangeFlag);
        this.iconExit = new ImageIcon(imageExit);

        //set icon to buttons
        addVehicleButton.setIcon(iconAddVehicle);
        buyVehicleButton.setIcon(iconBuyVehicle);
        takeVehicleButton.setIcon(iconTakeVehicle);
        resetDistanceButton.setIcon(iconResetDistance);
        changeFlagButton.setIcon(iconChangeFlag);
        exitButton.setIcon(iconExit);


        //adding buttons to panel
        panel.add(addVehicleButton);
        panel.add(buyVehicleButton);
        panel.add(takeVehicleButton);
        panel.add(resetDistanceButton);
        panel.add(changeFlagButton);
        panel.add(exitButton);

        //change size and font of buttons
        addVehicleButton.setFont(new Font("Arial", Font.BOLD, 20));
        buyVehicleButton.setFont(new Font("Arial", Font.BOLD, 20));
        takeVehicleButton.setFont(new Font("Arial", Font.BOLD, 20));
        resetDistanceButton.setFont(new Font("Arial", Font.BOLD, 20));
        changeFlagButton.setFont(new Font("Arial", Font.BOLD, 20));
        exitButton.setFont(new Font("Arial", Font.BOLD, 20));

        //action listeners of buttons
        addVehicleButton.addActionListener(this);
        buyVehicleButton.addActionListener(this);
        takeVehicleButton.addActionListener(this);
        resetDistanceButton.addActionListener(this);
        changeFlagButton.addActionListener(this);
        exitButton.addActionListener(this);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    //methods
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == addVehicleButton) {
            frameCars frameCars = new frameCars();
            this.dispose();
        }
        if (source == buyVehicleButton) {
            AllVehicles allVehicles = new AllVehicles();
            for(Object vehicle : frameCars.vehicleList ){
                System.out.println(vehicle.toString());
            }
            //this.dispose();
        }
        if (source == takeVehicleButton) {
            takeVehicleForTest vehicleTest = new takeVehicleForTest();
            }
            //this.dispose();
        if (source == resetDistanceButton) {
            for (Vehicle i: frameCars.vehicleList) {
                i.setTotalDistance(0);
            }
            JOptionPane.showMessageDialog(null, "Distance reseted");

        }
        if (source == changeFlagButton) {
            FlagsFrame flagsFrame = new FlagsFrame();
            this.dispose();
        }
        if (source == exitButton) {
            exit(0);
        }
    }

}
