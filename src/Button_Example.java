import java.awt.*;
import java.awt.event.*;

public class Button_Example {
    public static void main(String[] args) {
        // creating new frame
        Frame frame =  new Frame("Example");

        //creating button
        Button button = new Button("Click here");

        // setting button position in the frame

        button.setBounds(80 , 100 , 64 , 30);

        // adding button in frame

        frame.add(button);
        // allow to display
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hellow worlds ");
            }
        });

        frame.setLayout(null);
        frame.setSize(400 , 500 );
        frame.setVisible(true);

        // allow to close

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //frame.dispose();
                System.exit(0);
            }
        });





    }
}
