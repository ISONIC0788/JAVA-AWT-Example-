import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListExample {
    public static void main(String[] args) {
        Frame f =new Frame("Awt list example ");

        Label label = new Label("Select your favorite programing language ");
        label.setBounds(50 , 50 , 300 , 30);

        List list = new List(5 , true);

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScipt");
        list.add("Kotlin");
        list.add("Php");

        list.setBounds(50 , 100 , 300 , 100 );

        // add button to show you selected

        Button btn = new Button("Show selected ");

        btn.setBounds(50 , 250 ,  150 , 30);

        Label result = new Label("");
        result.setBounds(50 , 300 , 150 , 30);



        f.add(label);
        f.add(list);
        f.add(btn);
        f.add(result);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] select = list.getSelectedItems();
                StringBuilder sb = new StringBuilder("You selected:");
                for (String s : select){
                    sb.append(s).append(" ");
                }
                result.setText(sb.toString());

            }
        });

        // allow to closing

        f.addWindowListener(new WindowAdapter() {
            public  void  windowClosing(WindowEvent e){
                f.dispose();
            }
        });


        f.setLayout(null);
        f.setSize(400 , 500);
        f.setVisible(true);
    }
}
