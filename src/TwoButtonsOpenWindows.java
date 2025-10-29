import java.awt.*;
import java.awt.event.*;

public class TwoButtonsOpenWindows {
    TwoButtonsOpenWindows() {
        Frame frame = new Frame("Main Menu");

        Button btnDashboard = new Button("Open Dashboard");
        Button btnProfile = new Button("Open Profile");

        // Button 1 action
        btnDashboard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Frame dash = new Frame("Dashboard");
                dash.add(new Label("Welcome to Dashboard!"));
                dash.setSize(250, 150);
                dash.setLayout(new FlowLayout());
                dash.setVisible(true);

                dash.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        dash.dispose();
                    }
                });
            }
        });

        // Button 2 action
        btnProfile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Frame prof = new Frame("Profile Window");
                prof.add(new Label("This is your Profile Page."));
                prof.setSize(250, 150);
                prof.setLayout(new FlowLayout());
                prof.setVisible(true);

                prof.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        prof.dispose();
                    }
                });
            }
        });

        // Add buttons
        frame.add(btnDashboard);
        frame.add(btnProfile);

        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new TwoButtonsOpenWindows();
    }
}
