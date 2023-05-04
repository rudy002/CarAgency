package Graphics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FlagsFrame extends JFrame implements ActionListener {

        private JButton[] flagButtons;
        private String[] flagNames = {"Israel", "UnitedState", "Germany", "Greece", "Somalia", "JollyRoger"};
        private ImageIcon[] flagImages;

        public FlagsFrame() {
            super("Flags");
            setSize(600, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            getContentPane().add(panel);
            panel.setLayout(new GridLayout(2, 4));


            // Load the flag images
            flagImages = new ImageIcon[6];
            for (int i = 0; i < 6; i++) {
                flagImages[i] = new ImageIcon("images/Flags/" + flagNames[i] + ".png");
            }

            // Create the buttons
            flagButtons = new JButton[6];
            for (int i = 0; i < 6; i++) {
                flagButtons[i] = new JButton(flagImages[i]);
                flagButtons[i].setActionCommand(flagNames[i]);
                flagButtons[i].addActionListener(this);
            }

            // Create the layout
            for (int i = 0; i < 6; i++) {
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
            if (source == flagButtons[0]){} //Israel
            if (source == flagButtons[1]){} //UnitedState
            if (source == flagButtons[2]){} //Germany
            if (source == flagButtons[3]){} //Greece
            if (source == flagButtons[4]){} //Somalia
            if (source == flagButtons[5]){} //JollyRoger

            }


        public static void main(String[] args) {
            new FlagsFrame();
        }
    }

