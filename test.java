import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class test extends JPanel {
    public static void main(String[] args) {
        test m = new test();

        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("First Swing");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public void paintComponent(Graphics g) {
        BufferedImage buffer = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = buffer.createGraphics();

        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, 600, 600);
        g2.setColor(Color.BLACK);
        
        //MyobjectImage.baby_chick(g2);
        paint.colorpent(buffer);
        g.drawImage(buffer, 0, 0, null);
    }
}
