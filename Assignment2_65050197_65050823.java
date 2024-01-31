import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

class AllGraphics extends JPanel implements Runnable {
    BufferedImage img = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
    private int currentSize = 100;  // Initial size of the image

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
        int initialSize = 50;  // Initial size of the image
        int finalSize = 300;   // Final size of the image
        long duration = 3000;  // Duration of the resizing in milliseconds
        long startTime = System.currentTimeMillis();

        while (System.currentTimeMillis() - startTime < duration) {
            currentSize = initialSize + (int)((System.currentTimeMillis() - startTime) * (finalSize - initialSize) / duration);
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Get Graphics2D from BufferedImage
        Graphics2D g2 = img.createGraphics();

        // Clear the image
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, img.getWidth(), img.getHeight());
        g2.setColor(Color.black);
        // Draw using MyobjectImage.baby_chick
        MyobjectImage.baby_chick(g2);
        paint.colorpent(img);;
        // Release the resources of Graphics2D
        g2.dispose();

        // Draw the BufferedImage to the JPanel
        g.drawImage(img, 0, 0, this);
    }
}
