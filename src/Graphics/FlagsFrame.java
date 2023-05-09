package Graphics;
import RegularClasses.Amphibious;
import abstractClass.MarineVehicle;
import abstractClass.Vehicle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FlagsFrame extends JFrame implements ActionListener {

        private JButton[] flagButtons;
        private String[] flagNames = {"Israel", "UnitedState", "Germany", "Greece", "Somalia", "JollyRoger", "Italia"};
        private ImageIcon[] flagImages;

        public FlagsFrame() {
            super("Flags");
            setSize(1400, 1000);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            getContentPane().add(panel);
            panel.setLayout(new GridLayout(2, 4));


            // Load the flag images
            flagImages = new ImageIcon[7];
            for (int i = 0; i < 7; i++) {
                flagImages[i] = new ImageIcon("images/Flags/" + flagNames[i] + ".png");
            }

            // Create the buttons
            flagButtons = new JButton[7];
            for (int i = 0; i < 7; i++) {
                flagButtons[i] = new JButton(flagImages[i]);
                flagButtons[i].setActionCommand(flagNames[i]);
                flagButtons[i].addActionListener(this);
            }

            // Create the layout
            for (int i = 0; i < 7; i++) {
                panel.add(flagButtons[i]);
            }

            // Add the panel to the frame
            setContentPane(panel);

            setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            // Get the name of the selected flag
            String flagName = e.getActionCommand();
            // Do something with the flagName
            JOptionPane.showMessageDialog(this, "You selected the " + flagName + " flag.");
            if (source == flagButtons[0]){
                changeFlag("Israel");
            } //Israel
            if (source == flagButtons[1]){
                changeFlag("UnitedState");
            } //UnitedState
            if (source == flagButtons[2]){
                changeFlag("Germany");
            } //Germany
            if (source == flagButtons[3]){
                changeFlag("Greece");
            } //Greece
            if (source == flagButtons[4]){
                changeFlag("Somalia");
            } //Somalia
            if (source == flagButtons[5]){
                changeFlag("JollyRoger");
            } //JollyRoger
            if (source == flagButtons[6]){
                changeFlag("Italia");
            } //Italia

            this.dispose();
            MenuFrame frame = new MenuFrame();

        }

            public void changeFlag(String flagName) {
                for (Vehicle i : frameCars.vehicleList) {
                    if (i instanceof MarineVehicle)
                        ((MarineVehicle) i).setFlag(flagName);
                    else if (i instanceof Amphibious)
                        ((Amphibious) i).setFlag(flagName);
                }
            }


    }

