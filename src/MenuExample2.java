import java.awt.*;

public class MenuExample2 {
    MenuExample2(){
        Frame frame = new Frame("Menu Example ");
        MenuBar menuBar = new MenuBar();

        Menu menuFile = new Menu("File");
        Menu menuEdit = new Menu("Edit");
        Menu menuHelp = new Menu("Help");

        // MENUT ITEMS

        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");

        menuFile.add(newItem);
        menuFile.add(openItem);
        menuFile.add(saveItem);
        menuFile.add(exitItem);

        MenuItem openNew = new MenuItem("New");
        MenuItem openRec = new MenuItem("Recent");

//        openItem.addNotify();

        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        menuBar.add(menuHelp);

        frame.setMenuBar(menuBar);

        frame.setSize(400 ,500);
        frame.setLayout( new FlowLayout());
        frame.setVisible(true);





    }


    public static void main(String[] args) {
        new MenuExample2();
    }
}
