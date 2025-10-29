import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceExample {
    public static void main(String[] args) {
        Frame f = new Frame("Choice Example");

        Label label = new Label("Select your fovorite language:");
        label.setBounds(50 , 50  , 200 , 30);

        Choice choice = new Choice();

        choice.add("Java");
        choice.add("Python");
        choice.add("Javascript ");
        choice.add("c++");
        choice.add("Kotlin");

        choice.setBounds(50, 100 , 150 , 30);

        Label result = new Label("");
        result.setBounds(50 , 150 , 250 , 30);
        choice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                result.setText("You seleected "+ choice.getSelectedItem());
            }
        });

        f.add(label);
        f.add(choice);
        f.add(result);

        f.setSize(400 , 250);
        f.setLayout(null);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });
    }
}
