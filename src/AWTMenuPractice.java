import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTMenuPractice {
    AWTMenuPractice(){
        Frame frame = new Frame("AWT MENU Practice");

        // Menu Bar

        MenuBar menuBar = new MenuBar();

        // Menus

        Menu pagesMenu = new Menu("Pages");
        Menu editMenu = new Menu("Edit");
        Menu helpMenu = new Menu("Help");

        // Submenu items under"Page"

        MenuItem loginItems = new MenuItem("Login");
        MenuItem studentItem = new Menu("Student");

        // add submenu
        pagesMenu.add(loginItems);
        pagesMenu.add(studentItem);

        // add menu to menu bar

        menuBar.add(pagesMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        frame.setMenuBar(menuBar);

        // Header Panel

        Panel headerPanel = new Panel(new BorderLayout());
        Label title = new Label("SIMPLE JAVA AWT LAYOUT ",Label.CENTER);
        title.setFont(new Font("Arial",  Font.BOLD , 16));
        title.setForeground(Color.WHITE);
        headerPanel.setBackground(new Color(0 , 32 , 96 ));
        headerPanel.add(title,BorderLayout.CENTER);


        // formPanel
        Panel formPanel = new Panel(new GridLayout(3, 2 , 10, 10));
        formPanel.setBackground(new Color(235, 236 , 230));

        Label lblUser = new Label("Username:");
        lblUser.setFont(new Font("Arial" , Font.BOLD , 12));









        frame.setLayout(new BorderLayout(10 , 10));
        frame.add(headerPanel ,BorderLayout.NORTH);
        frame.setSize(500 , 400 );
        frame.setVisible(true);

        // Window closing event
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }

    public static void main(String[] args) {
        new AWTMenuPractice();
    }
}
