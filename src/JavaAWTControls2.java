import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaAWTControls2 {
    JavaAWTControls2(){
        Frame frame = new Frame("AWT CONTOL");
        Button bfile = new Button("Open File");
        bfile.setBounds(30 , 50 , 150 , 30);

        Label fileTxt = new Label("");
        fileTxt.setBounds(30 , 100 , 250 , 30);

        final  FileDialog fileDialog = new FileDialog(frame , "Select File ");

        bfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileDialog.setVisible(true);
                fileTxt.setText("File selectect"+fileDialog.getDirectory()+fileDialog.getFile());

            }
        });

        frame.add(bfile);
        frame.add(fileTxt);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
        });
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setSize(400 , 500);



    }

    public static void main(String[] args) {
        JavaAWTControls2 jc = new JavaAWTControls2();
    }
}
