import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import javax.swing.*;

class AllGraphics extends JPanel implements Runnable {
    BufferedImage img = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
    private volatile double currentSize = 50; // Initial size of the image
    private volatile int scaleing = 0; // Flag to indicate if we should scale back and switch to boom_chick
    private volatile boolean drawing = true;
    private volatile boolean havenugget = false;

    public static void main(String[] args) {
        AllGraphics m = new AllGraphics();

        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("Graphics");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        (new Thread(m)).start();
    }

    public void run() {
        int initialSize = 0;
        int finalSize = 201;
        long duration = 3000;
        long endtime = 6000;
        long startTime = System.currentTimeMillis();

        while (System.currentTimeMillis() - startTime < endtime) {
            if (System.currentTimeMillis() - startTime < duration) {
                currentSize = initialSize + (((System.currentTimeMillis() - startTime) * (finalSize - initialSize) / duration));
                
                repaint();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                scaleing = 1;
                break;
            }
        }
        scaleing = 1; // After 3 seconds, enable scaling back and switch drawing method
        drawing = false;
        //drawBoomChick = true;
        while (System.currentTimeMillis() - startTime < endtime) {  
            if(System.currentTimeMillis() - startTime < 6000){
                currentSize = initialSize + (((System.currentTimeMillis() - startTime) * (finalSize - initialSize) / duration)) - 260;
                if(currentSize > 0){
                    havenugget = true;
                }
            }
            else{
                havenugget = true;
                // currentSize = initialSize + (((System.currentTimeMillis() - startTime) * (finalSize - initialSize) / duration)) - 200;
                
            }
            // System.out.println(currentSize);
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // drawBoomChick = true;
        repaint();

    }

    public void paintComponent(Graphics g) {
        AffineTransform transform = new AffineTransform();
        transform = AffineTransform.getTranslateInstance(300, 300);
        double scailing = currentSize / 100 + 0.5;
        if (scaleing == 1) {
            scailing = 1.0; // Set scaling back to 1 after 3 seconds
            scaleing = 0;
        }
        
        transform.scale(scailing, scailing);
        transform.translate(-300, -300);

        super.paintComponent(g);

        // Get Graphics2D from BufferedImage
        Graphics2D g2 = img.createGraphics();

        // Clear the image
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, img.getWidth(), img.getHeight());
        g2.setColor(Color.BLACK);

        g2.setTransform(transform);

        if (!drawing) {
            boom.boom_chick(g2); // Draw boom_chick after 3 seconds
            if(havenugget){
                boom.boom_nugget(g2 ,img);
            }
        } 
        else if (drawing) 
        {
            MyobjectImage.baby_chick(g2, img);
        }

        DrawALGO.floodFill(img, 300, 1, Color.white, new Color(230, 180, 193));
        g2.dispose();

        g.drawImage(img, 0, 0, this);
    }
}
