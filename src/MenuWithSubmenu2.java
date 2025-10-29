import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuWithSubmenu2 {
    MenuWithSubmenu2(){
        Frame frame = new Frame("Menu With Submenu ");
        // creating menubar
        MenuBar menuBar = new MenuBar();
        // creating menu
        Menu menuFile = new Menu("File");
        Menu menuEdit = new Menu("Edit");

        MenuItem  fileOpen = new MenuItem("Open");
        MenuItem  fileNew = new MenuItem("New");
        MenuItem fileSave = new MenuItem("Save");



        Menu submenu = new Menu("Exprort");

        MenuItem subExpCvs = new MenuItem("Eport Cvs");
        MenuItem subExpTxt = new MenuItem("Export txt");

        submenu.add(subExpCvs);
        submenu.add(subExpTxt);

        menuFile.add(fileOpen);
        menuFile.add(fileNew);
        menuFile.add(fileSave);
        menuFile.addSeparator();
        menuFile.add(submenu);

        // adding menu to menubar
        menuBar.add(menuFile);
        menuBar.add(menuEdit);


        frame.setMenuBar(menuBar);
        frame.setSize(300 , 300);
        frame.setVisible(true);
        frame.setLayout(null);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });


    }

    public static void main(String[] args) {
    new MenuWithSubmenu2();
    }
}
