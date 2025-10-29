import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PanelExample {
    PanelExample(){
        Frame frame = new Frame("Panel Example");

        // create Panel
        Panel panel = new Panel();
      // add components to panel

        panel.add(new Label("Name:"));
        panel.add(new TextField(15));
        panel.setBackground(Color.MAGENTA);
        panel.add(new Button("Submit"));

        Panel panel1 = new Panel();

        panel1.add(new Label("Name:"));
        panel1.setBackground(Color.GREEN);
        panel1.add(new TextField(15));
        panel1.add(new Button("Submit"));

      // Add panel to frame

        //pana;;e

        Panel bottomPanel = new Panel();
        bottomPanel.add(new Label("Bottom panel "));
        bottomPanel.setBackground(Color.red);



//      frame.add(panel);
//      frame.add(panel1);

      frame.setSize(300, 150);
      frame.setVisible(true);
//      frame.setLayout(new FlowLayout());

        frame.setLayout( new BorderLayout());

        frame.add(panel , BorderLayout.CENTER);
        frame.add(panel1 , BorderLayout.WEST);
        frame.add(bottomPanel , BorderLayout.SOUTH);

      frame.addWindowListener(new WindowAdapter() {
          @Override
          public void windowClosing(WindowEvent e) {
              frame.dispose();
          }
      });




    }
    public static void main(String[] args) {
      new PanelExample();
    }
}
