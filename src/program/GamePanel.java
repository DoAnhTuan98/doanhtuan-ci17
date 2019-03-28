package program;

import tklibs.SpriteUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GamePanel  extends JPanel {
    BufferedImage backgroundImage;
    BufferedImage playerImage;
    int playerX;
    int playerY;
    int backgroupX;
    int backgroundY;

    public GamePanel(){
        backgroundImage = SpriteUtils.loadImage("assets/images/background/0.png");
        //1 dat vi tri khoi tao  background
        backgroupX = 0;
        backgroundY = 600 - 3109;
        playerImage = SpriteUtils.loadImage("assets/images/players/straight/0.png");
        playerX = 300;
        playerY = 300;
    }

    @Override
    public void paint(Graphics g) { // ve
        g.drawImage(backgroundImage,backgroupX,backgroundY,null);
//        System.out.println(backgroundImage.getHeight());  lay kich thuoc anh
//        System.out.println(backgroundImage.getWidth());
        g.drawImage(playerImage,playerX,playerY,null);
    }

    public void runAll(){
        // background.run()
        backgroundY += 10;
        if(backgroundY >= 0){
            backgroundY =0;
        }
        // player.run()
        if(GameWindow.isUpPress){
            playerY--;
            if(playerY <= 0){
                playerY =0;
            }
        }
        if(GameWindow.isDownPress){
            playerY++;
            if(playerY > 600-85){
                playerY = 600-85;
            }
        }
        if(GameWindow.isRightPress){
            playerX++;
            if(playerX >= 384-32){
                playerX = 384-32;
            }
        }
        if(GameWindow.isLeftPress){
            playerX--;
            if(playerX <= 0){
                playerX = 0;
            }
        }
    }

    public void gameLoop(){
        long lastTime  = 0;
        while(true){
            long currentTime = System.currentTimeMillis();
            if(currentTime - lastTime >= 1000/60) {
//                System.out.println(currentTime);
                this.repaint(); // render anh
                this.runAll(); // chay logic
                lastTime = currentTime;
            }
        }
    }
}
