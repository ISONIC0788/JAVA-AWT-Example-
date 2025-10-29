import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaAWTControls {
    JavaAWTControls(){
        Frame f = new Frame();
        Label L = new Label("JAVA AWT UI Element ");
        Label L2 = new Label("");
        Button b = new Button("Click Me");
        Button bfile = new Button("Open File");
        final  FileDialog fileDialog = new FileDialog(f, "Select File");
        bfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileDialog.setVisible(true);
                L2.setText("File Selected "+fileDialog.getDirectory()+fileDialog.getFile());
            }
        });

        L.setForeground(Color.blue);

        L.setBounds(30 , 70 , 170 , 30 );
        b.setBounds(30 , 100 , 80 , 30 );
        L2.setBounds(120 , 150 , 350 , 30);
        bfile.setBounds(30 , 150 , 80 ,30);

        f.add(L);
        f.add(b);
        f.add(L2);
        f.add(bfile);

        f.setSize(390, 300);
        f.setTitle("Java AWT Controls");
        f.setLayout(null);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

    }
    // main method

    public static void main(String[] args) {
     JavaAWTControls jc = new JavaAWTControls();
    }
}
