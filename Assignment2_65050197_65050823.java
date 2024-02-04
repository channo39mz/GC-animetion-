import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import javax.swing.*;

class AllGraphics extends JPanel implements Runnable {
    BufferedImage img = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
    private volatile double currentSize = 50;  // Initial size of the image
    
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
        long startTime = System.currentTimeMillis();

        while (System.currentTimeMillis() - startTime < duration) {
            currentSize = initialSize + (((System.currentTimeMillis() - startTime) * (finalSize - initialSize) / duration));
            //System.out.println(currentSize);
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void paintComponent(Graphics g) {
        AffineTransform transform = new AffineTransform();
        transform = AffineTransform.getTranslateInstance(300, 300);
        double scailing = currentSize/100 + 0.5;
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
        
        MyobjectImage.baby_chick(g2 , img);

        DrawALGO.floodFill(img, 1, 1, Color.white, new Color(230 ,180 ,193));
        g2.dispose();

        g.drawImage(img, 0, 0, this);
    }
}
