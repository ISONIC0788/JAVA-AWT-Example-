import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleForm {
    SimpleForm() {
        Frame frame = new Frame("Simple Form");

        // ===== Header Panel =====
        Panel headerPanel = new Panel(new BorderLayout());
        Label headerLabel = new Label("Login Form", Label.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 13));
        headerLabel.setForeground(new Color(0, 52, 102));
        headerPanel.add(headerLabel, BorderLayout.CENTER);

        // ===== Body Panel =====
        Panel bodyPanel = new Panel(new GridLayout(5, 1, 5, 5)); // 5 rows, 1 column
        Label label1 = new Label("Username");
        label1.setFont(new Font("Arial", Font.BOLD, 10));

        TextField userName = new TextField(15);

        Label label2 = new Label("Password");
        label2.setForeground(Color.BLUE);
        label2.setFont(new Font("Arial", Font.BOLD, 10));

        TextField userPassword = new TextField(15);
        userPassword.setEchoChar('#');

        Button btn1 = new Button("Login");
        btn1.setFont(new Font("Arial", Font.BOLD, 10));

        // Add components to body panel
        bodyPanel.add(label1);
        bodyPanel.add(userName);
        bodyPanel.add(label2);
        bodyPanel.add(userPassword);
        bodyPanel.add(btn1);

        // ===== Frame Layout =====
        frame.setLayout(new BorderLayout());
        frame.add(headerPanel, BorderLayout.NORTH);
        frame.add(bodyPanel, BorderLayout.CENTER);

        // ===== Frame Settings =====
        frame.setSize(400, 300);
        frame.setVisible(true);

        // Close Window
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new SimpleForm();
    }
}
