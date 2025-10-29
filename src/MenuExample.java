import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExample {
       MenuExample(){
           Frame frame = new Frame("AWT Menu Example ");

           // creating menu bar
           MenuBar menuBar = new MenuBar();

           // create menu
           Menu fileMenu = new Menu("File");
           Menu editMenu = new Menu("Edit");
           Menu helpMenu = new Menu("Help");

           MenuItem newItem = new MenuItem("New");
           MenuItem openItem = new MenuItem("Open");
           MenuItem saveItem = new MenuItem("save");
           MenuItem exitItem = new MenuItem("Exit");

           // add items to file menu

           fileMenu.add(newItem);
           fileMenu.add(openItem);
           fileMenu.add(saveItem);
           fileMenu.addSeparator();
           fileMenu.add(exitItem);

           // add menu to menu bar

           menuBar.add(fileMenu);
           menuBar.add(editMenu);
           menuBar.add(helpMenu);


           frame.setMenuBar(menuBar);

           exitItem.addActionListener( new ActionListener(){
               @Override
               public  void  actionPerformed(ActionEvent e){
                  frame.dispose();
               }
           });

           frame.setSize(400 , 300);
           frame.setLayout(new FlowLayout());
           frame.setVisible(true);



       }

    public static void main(String[] args) {
   new MenuExample();
    }
}
