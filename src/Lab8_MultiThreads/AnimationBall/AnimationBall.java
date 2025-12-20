package Lab8_MultiThreads.AnimationBall;

import javax.swing.*;
import java.awt.*;

public class AnimationBall extends JFrame {
    JLabel img = new JLabel();

    String imagePath = "/home/hashim/IdeaProjects/JavaCourseITI/src/Lab8_MultiThreads/AnimationBall/cat.png";

    int imgSize = 50;
    int x = 50;
    int y = 50;
    int speedX = 3;
    int speedY = 3;

    public AnimationBall() {
        this.setTitle("Crying Cat");
        this.setLayout(null);

        ImageIcon icon = new ImageIcon(imagePath);
        // scales the image
        Image scaledImg = icon.getImage().getScaledInstance(imgSize, imgSize, Image.SCALE_SMOOTH);
        img.setIcon(new ImageIcon(scaledImg));

        // Set position
        img.setBounds(x, y, imgSize, imgSize);
        this.add(img);

        Thread th = new Thread(() -> {
            while (true) {
                int rightWall = this.getContentPane().getWidth() - imgSize;
                int bottomWall = this.getContentPane().getHeight() - imgSize;

                x += speedX;
                y += speedY;

                // Bounce Logic
                if (x <= 0 || x >= rightWall) {
                    speedX = -speedX;
                }
                if (y <= 0 || y >= bottomWall) {
                    speedY = -speedY;
                }

                img.setLocation(x, y);

                try {
                    Thread.sleep(30);
                } catch (Exception e) {}
            }
        });

        th.start();
    }

    public static void main(String[] args) {
        AnimationBall app = new AnimationBall();
        app.setBounds(200, 200, 600, 400);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }

}
