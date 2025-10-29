import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class checkBox_Example {
    public  checkBox_Example(){
        Frame frame = new Frame("Simple check box example");
        Checkbox checkbox = new Checkbox("Enable Feature  ");

        checkbox.setBounds(50 , 50 , 150 , 30 );

        checkbox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (checkbox.getState()){
                    System.out.println("Feature enabled ");
                }else {
                     System.out.println("Feature disabled");
                }
            }
        });

        frame.add(checkbox);

        frame.addWindowListener(new WindowAdapter() {
            public void  windowClosing(WindowEvent e){
                frame.dispose();
            }
        });

        frame.setLayout(null);
        frame.setSize(400 , 500);
        frame.setVisible(true);


    }
    public static void main(String[] args) {
       new checkBox_Example();
    }
}
