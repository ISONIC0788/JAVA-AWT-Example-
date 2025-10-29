import javax.swing.*;
import java.awt.*;

public class GraphicsEx2 extends JPanel {
     public void  paintComponent(Graphics g){
         g.drawLine(3 , 3 , 303 ,303 );
         g.drawRect(3 , 3  , 303 , 303 );
         g.drawOval(100 ,100 , 100 , 100);
         g.drawRoundRect(50 , 50 ,200 , 300 , 50 , 50 );

     }

    public static void main(String[] args) {
        GraphicsEx2 gp = new GraphicsEx2();
        JFrame frame = new JFrame();
        frame.add(gp);
        frame.setSize(400, 400 );
        frame.setTitle("GRAPHICS EXAMPLE 2 ");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
