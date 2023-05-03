package Graphics;

import javax.swing.*;
import java.awt.*;

public class MenuFrame extends JFrame {

    //constructor
    public MenuFrame() {
        super("Menu user");
        this.setSize(800, 600);



        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setBackground(Color.darkGray);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
