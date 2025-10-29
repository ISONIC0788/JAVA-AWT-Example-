import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTExample2 {
    AWTExample2(){
        Frame f = new Frame();
        Label l = new Label("Employee id");
        l.setBounds(50 , 50 , 100 , 30);

        Button b = new Button("Click here");
        b.setBounds(50 , 100 , 80 , 30);

        TextField t = new TextField();
        t.setBounds(50 , 150 , 100 , 30);

        f.add(l);
        f.add(b);
        f.add(t);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        f.setTitle("EMPLOYE");
        f.setSize(300 , 300);
        f.setLayout(null);
        f.setVisible(true);



    }
    public static void main(String[] args) {
       AWTExample2 j = new AWTExample2();
    }
}
