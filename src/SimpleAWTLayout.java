import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleAWTLayout {
    SimpleAWTLayout(){
        // Creating main Frame
        Frame frame = new Frame("Awt Practice ");
        frame.setSize(500 , 400);
        frame.setLayout(new BorderLayout(10 , 10));
        frame.setBackground(Color.WHITE);

        // top Panel
        Panel topPanel = new Panel(new BorderLayout());
        topPanel.setBackground(new Color(0 , 51 , 102 ));

        Label title = new Label("Simple Java AWT " ,Label.CENTER);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial" , Font.BOLD , 18));

        topPanel.add(title , BorderLayout.CENTER);
        frame.add(topPanel , BorderLayout.NORTH);

        Panel centerPanel = new Panel(new BorderLayout());
        centerPanel.setBackground(new Color(230 , 230 ,230));

        //Create inner panel for form

        Panel formPanel = new Panel(new GridLayout(3 , 2 , 10 , 10 ));
        formPanel.setBackground(new Color(230 , 230 , 230));
        formPanel.setSize(200 , 200);
        formPanel.setFont(new Font("Arial" , Font.PLAIN , 14));
        Label userLabel = new Label("Useraname:");
        TextField userField = new TextField(15);

        Label passLabel = new Label("Pasword:");
        TextField passField =new TextField(15);
        passField.setEchoChar('*');

        Button loginBtn = new Button("Login");

        loginBtn.setBackground(new Color(0 , 51 , 102 ));
        loginBtn.setForeground(Color.WHITE);

        loginBtn.setFont(new Font("Arial" , Font.BOLD , 12 ));

        formPanel.add(userLabel);
        formPanel.add(userField);
        formPanel.add(passLabel);
        formPanel.add(passField);
        formPanel.add(new Label(""));
        formPanel.add(loginBtn);

        // add small title above the form

        Label loginTitle = new Label("LOGIN PAGE" , Label.CENTER);
        loginTitle.setFont(new Font("Arial" ,Font.BOLD , 14));
        centerPanel.add(loginTitle, BorderLayout.NORTH);
        centerPanel.add(formPanel , BorderLayout.CENTER);

        Panel leftPanel = new Panel();
        leftPanel.setBackground(new Color(173, 200, 224));
        Panel rightPanel = new Panel();
        rightPanel.setBackground(new Color(173, 200, 224));
        Panel bottomPanel = new Panel();
        bottomPanel.setBackground(new Color(100, 149, 237));

        frame.add(centerPanel, BorderLayout.CENTER);

        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(rightPanel, BorderLayout.EAST);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == loginBtn){
                    frame.dispose();
                    new MultiPanelExample();
                }
            }
        });









        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
        frame.setVisible(true);
    }

    public static void main(String[] args) {
     new SimpleAWTLayout();

    }
}
