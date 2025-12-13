package Lab8_MultiThreads.TextBannerApp;

import javax.swing.*;
import java.awt.*;

public class TextBannerApp extends JFrame {
    Thread th;
    JLabel Label = new JLabel();

    public TextBannerApp() {
        this.setTitle("Text Banner Frame Application");
        this.setLayout(null);
        Label.setText("In a relationship with Java :)");
        // Set the initial size and position of the label
        Label.setBounds(0, 100, 300, 50); // (x, y, width, height)
        Label.setFont(new Font("Arial", Font.BOLD, 15));
        this.add(Label);

        th = new Thread(() -> {
            while (true) {
                int x = Label.getX();
                int y = Label.getY();

                x += 5; // Move right

                // Check if the text has gone off the right side of the screen
                if (x > this.getWidth()) {
                    // We set it to negative width so it slides in smoothly from the edge
                    x = -Label.getWidth();
                }

                Label.setLocation(x, y);

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        th.start();
    }

    public static void main(String[] args) {
        TextBannerApp app = new TextBannerApp();
        app.setBounds(50, 50, 600, 400);

        // Ensure the application closes when the X is clicked
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}