package program;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameWindow extends JFrame {
    public  static boolean isUpPress;
    public  static boolean isRightPress;
    public  static boolean isDownPress;
    public  static boolean isLeftPress;

    public GameWindow (){
        this.setTitle("Game Touhou");
        this.setSize(800,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        //key

        this.addKeyListener(new KeyAdapter() {


            @Override
            public void keyPressed(KeyEvent e) {
                // ham duoc goi khi giu  phim
//                e.getKeyCode(); lay ma code cua tung phim bam
//                e.getKeyChar(); lay chu ma minh vua bam
                if(e.getKeyCode() ==  KeyEvent.VK_W){
                    isUpPress = true;
                }
                if(e.getKeyCode() ==  KeyEvent.VK_D){
                    isRightPress = true;
                }
                if(e.getKeyCode() ==  KeyEvent.VK_S){
                    isDownPress = true;
                }
                if(e.getKeyCode() ==  KeyEvent.VK_A){
                    isLeftPress = true;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // ham duoc goi khi nha phim
                if(e.getKeyCode() == KeyEvent.VK_W){
                    isUpPress = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_D){
                    isRightPress = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_S){
                    isDownPress = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_A){
                    isLeftPress = false;
                }
            }
        });
        //mouse
    }
}
