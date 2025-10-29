import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class choiceExample2 {
    public static void main(String[] args) {
        // creating frame

        Frame frame =new Frame("Simple Frame ");
        // creating label
        Label lb1 = new Label("Select your choice ");
         lb1.setBounds(50 , 50 , 200 , 30);

         // creating choice
        Choice choice = new Choice();
        // adding item in choice
        choice.add("Sangwa");
        choice.add("Ellissa");
        choice.add("Epa");
        choice.add("Edison");
        choice.add("Meekness");
        choice.add("Jackson ");
        choice.add("Israel ");
        choice.add("Arafati");

        choice.setBounds(50 , 100 , 150 , 30);

        // labale to sett some title

        Label label2 = new Label("");

        label2.setBounds(50 , 150 , 150 , 30 );


        choice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
             label2.setText("you are select "+choice.getSelectedItem());
            }
        });


        frame.add(lb1);
        frame.add(label2);
        frame.add(choice);

        // code to close the componets

        frame.addWindowListener(new WindowAdapter() {
            public void  windowClosing(WindowEvent e ){
//                frame.dispose();
                System.exit(0);
            }
        });

        // setting for owewr frame

        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(400 , 500);


    }
}
