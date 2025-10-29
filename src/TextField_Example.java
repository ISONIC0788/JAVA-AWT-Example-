import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.nio.file.WatchEvent;

public class TextField_Example {
    public static void main(String[] args) {
        Frame f = new Frame("TextFieled Example");

        Button b = new Button("Submit");

        b.setBounds(160 ,  100 , 100 , 30 );

        // created text fieled

        TextField t1 = new TextField();

        t1.setBounds(160 , 50  , 200 , 20  );


        Label l1 = new Label("Name");
        Label l2 = new Label(" ");

        l1.setBounds(40 ,  55 , 100 , 14 );
        l2.setBounds(150 , 170 , 400 , 14 );


        f.add(b);
        f.add(t1);
        f.add(l1);
        f.add(l2);
        // add action listener

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               l2.setText("Name is:" + t1.getText());
            }
        });



        f.setLayout(null);
        f.setSize(300 , 400);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void  windowClosing(WindowEvent e){
//                f.dispose();
                System.exit(0);
            }
        });


    }
}
