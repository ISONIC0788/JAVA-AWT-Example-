import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuWithSubmenu {
    MenuWithSubmenu(){
        Frame frame = new Frame("AWT menu Example");

        // create menu bar
        MenuBar menuBar = new MenuBar();

        // creating menu
        Menu  menuFile = new Menu("File");
        Menu menuEdit = new Menu("Edit");

        // creating menu items
        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItems = new MenuItem("Save");

        // create submen under file

        Menu submenu = new Menu("Export");

        // add submenu

        MenuItem pdfItem = new MenuItem("As PDF ");
        MenuItem txtItem = new MenuItem("As text File");

        submenu.add(pdfItem);
        submenu.add(txtItem);

        // add items to File menu
        menuFile.add(newItem);
        menuFile.add(openItem);
        menuFile.add(saveItems);
        menuFile.add(submenu);

        menuFile.add(new MenuItem("Exit"));
        menuBar.add(menuEdit);
        menuBar.add(menuFile);

        frame.setMenuBar(menuBar);
        frame.setSize(400 , 300);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }
    public static void main(String[] args) {
      new MenuWithSubmenu();
    }
}
