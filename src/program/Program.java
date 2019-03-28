package program;


import org.ietf.jgss.GSSManager;

import javax.swing.*;
import java.awt.*;

/**
 * Created by huynq on 7/4/17.
 */
public class Program {
    public static void main(String[] args) {
        GameWindow window = new GameWindow();



        GamePanel panel = new GamePanel();
        window.add(panel);
        panel.setBackground(Color.CYAN);

        window.setVisible(true);

        panel.gameLoop();
    }

}