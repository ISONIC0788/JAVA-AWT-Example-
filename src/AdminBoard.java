import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdminBoard {
    AdminBoard(){
        Frame frame = new Frame("Admin Example");
        //main Menu

        // creating menu bar

        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");
        Menu helpMenu = new Menu("Help");
        Menu SearchMenu = new Menu("Search");

        // file menu items

        MenuItem fileOpen = new MenuItem("Open");
        MenuItem fileRecent = new MenuItem("Recent");
        MenuItem fileRead = new MenuItem("Read");

        Menu Exprotmenu = new Menu("Export");
        MenuItem exportCvs = new MenuItem("Export Cvs");
        MenuItem exportTxt = new MenuItem("Export txt ");

        Exprotmenu.add(exportCvs);
        Exprotmenu.add(exportTxt);


        //Header panel

        Panel headerPanel = new Panel();
        headerPanel.setBackground(Color.red);
        headerPanel.add(new Label("Header panel" ));

        Panel footerPanel = new Panel();
        footerPanel.setBackground(Color.GREEN);
        footerPanel.add(new Label("Footer Panel"));

        Panel leftPanel = new Panel();
        leftPanel.setBackground(Color.MAGENTA);
        leftPanel.add(new Label("Left Footer"));

        Panel rightPanel = new Panel();
        rightPanel.setBackground(Color.BLUE);
        rightPanel.add(new Label("Right items"));

        Panel centerPanel = new Panel(new FlowLayout(FlowLayout.CENTER , 20 , 10));
        TextField inputOne = new TextField(15);
        inputOne.setBounds(50 , 50 , 150 , 30 );
        Label username = new Label("UserName");
        username.setBounds(50 , 190 , 150 , 30 );

        TextField inputTwo = new TextField(15);
        inputTwo.setBounds(50 , 100 , 150 , 30 );
        Label password  = new Label("UserName");
        username.setBounds(50 , 250 , 150 , 30 );

        Button btn1 = new Button("Click here");
        btn1.setBounds(50 , 150 , 150 , 30);

        centerPanel.add(username);
        centerPanel.add(inputOne);
        centerPanel.add(password);
        centerPanel.add(inputTwo);
        centerPanel.add(btn1);





        fileMenu.add(fileOpen);
        fileMenu.add(fileRecent);
        fileMenu.add(fileRead);
        fileMenu.add(Exprotmenu);

        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        menuBar.add(SearchMenu);

        exportTxt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new  AWTExample();
            }
        });


        frame.setMenuBar(menuBar);

        frame.setLayout( new BorderLayout());

        frame.add(headerPanel , BorderLayout.NORTH);
        frame.add(footerPanel , BorderLayout.SOUTH);
        frame.add(leftPanel , BorderLayout.WEST);
        frame.add(rightPanel , BorderLayout.EAST);
        frame.add(centerPanel , BorderLayout.CENTER);



        frame.setVisible(true);
        frame.setSize(500 , 400);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
       new  AdminBoard();
    }
}
