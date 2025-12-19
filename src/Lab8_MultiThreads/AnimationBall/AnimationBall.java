package Lab8_MultiThreads.AnimationBall;

import javax.swing.*;
import java.awt.*;

public class AnimationBall extends JFrame {
    JLabel ball = new JLabel();

    // 1. PUT YOUR IMAGE PATH HERE
    // Note: On Windows use double backslashes "\\"
    String imagePath = "/home/hashim/IdeaProjects/JavaCourseITI/src/Lab8_MultiThreads/AnimationBall/cat.png";

    // Ball settings
    int ballSize = 50;
    int x = 50;
    int y = 50;
    int speedX = 5;
    int speedY = 5;

    public AnimationBall() {
        this.setTitle("Crying Cat");
        this.setLayout(null);

        ImageIcon icon = new ImageIcon(imagePath);
        // scales the image
        Image scaledImg = icon.getImage().getScaledInstance(ballSize, ballSize, Image.SCALE_SMOOTH);
        ball.setIcon(new ImageIcon(scaledImg));

        // Set position and add to window
        ball.setBounds(x, y, ballSize, ballSize);
        this.add(ball);

        Thread th = new Thread(() -> {
            while (true) {
                int rightWall = this.getContentPane().getWidth() - ballSize;
                int bottomWall = this.getContentPane().getHeight() - ballSize;

                x += speedX;
                y += speedY;

                // Bounce Logic
                if (x <= 0 || x >= rightWall) {
                    speedX = -speedX;
                }
                if (y <= 0 || y >= bottomWall) {
                    speedY = -speedY;
                }

                ball.setLocation(x, y);

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
