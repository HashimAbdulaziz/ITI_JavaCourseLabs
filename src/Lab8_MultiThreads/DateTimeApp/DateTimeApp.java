package Lab8_MultiThreads.DateTimeApp;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class DateTimeApp extends JFrame {
    Thread th;
    Date d = new Date();
    JLabel timeLabel = new JLabel();

    public DateTimeApp(){
        this.setTitle("Date & Time Frame Application");
        timeLabel.setHorizontalAlignment(JLabel.CENTER);
        timeLabel.setText(d.toString());
        this.add(timeLabel, BorderLayout.CENTER);

        th = new Thread(() -> {
            while(true){
                d = new Date();
                timeLabel.setText(d.toString());
                try {
                    Thread.sleep(1000); // you’ll need to catch an exception
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        th.start();
    }

    public static void main(String[] args) {
        DateTimeApp app = new DateTimeApp();
        app.setBounds(50, 50, 600, 400);
        app.setVisible(true);
    }

} // End of class