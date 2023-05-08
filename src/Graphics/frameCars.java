package Graphics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//import my packages
import RegularClasses.*;
import abstractClass.*;
import RegularClasses.*;

public class frameCars extends JFrame implements ActionListener {

    //data members
    static ArrayList<Vehicle> vehicleList; //np modifier (only for package gui)

    public static void main(String[] args) {

        vehicleList = new ArrayList<Vehicle>(); //create new array list
        //create new object
        frameCars frame = new frameCars();



    }



    //data members

    //all Buttons
    private final JButton buttonJeep = new JButton();
    private final JButton buttonFrigate = new JButton();
    private final JButton buttonGamePlane = new JButton();
    private final JButton buttonSpyPlane = new JButton();
    private final JButton buttonBicycle = new JButton();
    private final JButton buttonCruise = new JButton();
    private final JButton buttonAmphibious = new JButton();
    private final JButton buttonMenu = new JButton();







    //constructor
    public frameCars() {
        super("Car Agency");
        this.setSize(800, 600);


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 4));
        getContentPane().add(panel);

        //all images icons
        ImageIcon iconJeep = new ImageIcon("images/Icons/jeep.png");
        ImageIcon iconFrigate = new ImageIcon("images/Icons/frigate.png");
        ImageIcon iconGamePlane = new ImageIcon("images/Icons/gamePlane.png");
        ImageIcon iconSpyPlane = new ImageIcon("images/Icons/spyPlane.png");
        ImageIcon iconBicycle = new ImageIcon("images/Icons/bicycle.png");
        ImageIcon iconCruise = new ImageIcon("images/Icons/cruiseShip.png");
        ImageIcon iconAmphibious = new ImageIcon("images/Icons/amphibious.png");
        ImageIcon iconMenu = new ImageIcon("images/Icons/menu.png");

        //all labels buttons
        JLabel labelJeep = new JLabel("Jeep");
        JLabel labelFrigate = new JLabel("Frigate");
        JLabel labelGamePlane = new JLabel("Game Plane");
        JLabel labelSpyPlane = new JLabel("Spy Plane");
        JLabel labelBicycle = new JLabel("Bicycle");
        JLabel labelCruise = new JLabel("Cruise");
        JLabel labelAmphibious = new JLabel("Amphibious");
        JLabel labelMenu = new JLabel("Menu");



        //add all panels
        panel.add(newPanel(iconJeep, labelJeep, buttonJeep));
        panel.add(newPanel(iconFrigate, labelFrigate, buttonFrigate));
        panel.add(newPanel(iconGamePlane, labelGamePlane, buttonGamePlane));
        panel.add(newPanel(iconSpyPlane, labelSpyPlane, buttonSpyPlane));
        panel.add(newPanel(iconBicycle, labelBicycle, buttonBicycle));
        panel.add(newPanel(iconCruise, labelCruise, buttonCruise));
        panel.add(newPanel(iconAmphibious, labelAmphibious, buttonAmphibious));
        panel.add(newPanel(iconMenu, labelMenu, buttonMenu));

        //action listeners
        buttonMenu.addActionListener(this);
        buttonJeep.addActionListener(this);
        buttonFrigate.addActionListener(this);
        buttonGamePlane.addActionListener(this);
        buttonSpyPlane.addActionListener(this);
        buttonBicycle.addActionListener(this);
        buttonCruise.addActionListener(this);
        buttonAmphibious.addActionListener(this);




        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public JPanel newPanel(ImageIcon icon, JLabel label, JButton button){
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        button.setIcon(icon);
        button.setPreferredSize(new Dimension(500, 500));
        label.setForeground(Color.WHITE);
        panel.add(button);
        panel.add(label);
        return panel;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonMenu) {
            // Open new frame for menu
            this.dispose(); // Close current frame
            MenuFrame menuFrame = new MenuFrame();
        }
        if (e.getSource() == buttonJeep) {
            // Open new frame for menu
            FrameForEachVehicleDetails detailsForJeep = new FrameForEachVehicleDetails("Jeep");
            this.dispose(); // Close current frame
        }
        if (e.getSource() == buttonFrigate) {
            // Open new frame for menu
            FrameForEachVehicleDetails detailsForFrigate = new FrameForEachVehicleDetails("Frigate");
            this.dispose(); // Close current frame
        }
        if (e.getSource() == buttonGamePlane) {
            // Open new frame for menu
            FrameForEachVehicleDetails detailsForGamePlane = new FrameForEachVehicleDetails("GamePlane");
            this.dispose(); // Close current frame
        }
        if (e.getSource() == buttonSpyPlane) {
            // Open new frame for menu
            FrameForEachVehicleDetails detailsForSpyPlane = new FrameForEachVehicleDetails("SpyPlane");
            this.dispose(); // Close current frame
        }
        if (e.getSource() == buttonBicycle) {
            // Open new frame for menu
            FrameForEachVehicleDetails detailsForBicycle = new FrameForEachVehicleDetails("Bicycle");
            this.dispose(); // Close current frame
        }
        if (e.getSource() == buttonCruise) {
            // Open new frame for menu
            FrameForEachVehicleDetails detailsForCruise = new FrameForEachVehicleDetails("CruiseShip");
            this.dispose(); // Close current frame
        }
if (e.getSource() == buttonAmphibious) {
            // Open new frame for menu
            FrameForEachVehicleDetails detailsForAmphibious = new FrameForEachVehicleDetails("Amphibious");
            this.dispose(); // Close current frame
        }

    }


}

