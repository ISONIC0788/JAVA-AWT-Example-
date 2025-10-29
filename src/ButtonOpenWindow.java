import java.awt.*;
import java.awt.event.*;

public class ButtonOpenWindow {
    ButtonOpenWindow() {
        Frame mainFrame = new Frame("Main Window");

        // Create button
        Button btnOpen = new Button("Open New Window");

        // Add event (ActionListener)
        btnOpen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create a new window when button is clicked
                Frame newFrame = new Frame("Second Window");
                Label label = new Label("Hello! This is another window.");

                newFrame.add(label);
                newFrame.setSize(300, 200);
                newFrame.setLayout(new FlowLayout());
                newFrame.setVisible(true);

                // Close only the new window
                newFrame.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        newFrame.dispose();
                    }
                });
            }
        });

        // Add button to main window
        mainFrame.add(btnOpen);

        mainFrame.setSize(400, 300);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setVisible(true);

        // Close main window
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                mainFrame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new ButtonOpenWindow();
    }
}
