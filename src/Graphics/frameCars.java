package Graphics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class frameCars extends JFrame implements ActionListener {

    public static void main(String[] args) {
        frameCars frame = new frameCars();
    }



    //data members

    //all Jbuttons
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

//        //all Jbuttons
//        JButton buttonJeep = new JButton();
//        JButton buttonFrigate = new JButton();
//        JButton buttonGamePlane = new JButton();
//        JButton buttonSpyPlane = new JButton();
//        JButton buttonBicycle = new JButton();
//        JButton buttonCruise = new JButton();
//        JButton buttonAmphibious = new JButton();
//        JButton buttonMenu = new JButton();


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
    }


}


