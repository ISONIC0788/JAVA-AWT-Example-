import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MultiPanelExample {
    MultiPanelExample(){
        Frame frame = new Frame("Multiple Panel Example");

        // Top panel

        Panel topPanel = new Panel();
        topPanel.setBackground(Color.CYAN);
        topPanel.add(new Label("Top panel"));
        topPanel.add(new Button("A"));


        // Bottom panel Layout

        Panel bottomPanel = new Panel( );
        bottomPanel.setBackground(Color.DARK_GRAY);
        bottomPanel.add(new Label("Footer lout "));
//        bottomPanel.setLayout();

        // Lelft panel Layout

        Panel leftPanel = new Panel();
        leftPanel.setBackground(Color.GREEN);
        leftPanel.add(new Label("lEFT Layout "));

        Panel rightPanel = new Panel();
        rightPanel.setBackground(Color.ORANGE);
        rightPanel.add(new Label("lEFT Layout "));

        Panel center = new Panel();
        center.setBackground(Color.MAGENTA);
        center.add(new Label(" CENTER"));







        frame.setLayout(new BorderLayout());
        frame.add(topPanel , BorderLayout.NORTH);
        frame.add(bottomPanel , BorderLayout.SOUTH);
        frame.add(leftPanel , BorderLayout.EAST);
        frame.add(rightPanel , BorderLayout.WEST);
        frame.add(center , BorderLayout.CENTER );

        frame.setSize(300 , 200);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();

            }
        });





    }
    public static void main(String[] args) {
      new MultiPanelExample();
    }
}
