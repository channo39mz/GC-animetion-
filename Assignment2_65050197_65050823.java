package animation;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;


class AllGraphics extends JPanel implements Runnable {
    private int circleX = 0;
    private int circleSpeed = 100; 

    private int squareY = 0; 
    private int squareSpeed = 100;
    private boolean squareVisible = false; 

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

        long startTime = System.nanoTime();
        long lastTime = startTime;
        long currentTime, elapsedTime;

        while (true) {
            currentTime = System.nanoTime();
            elapsedTime = currentTime - lastTime;
            lastTime = currentTime;

            double elapsedTimeSec = (double) elapsedTime / 1_000_000_000.0;

            double elapsedTimeMillis = (double) elapsedTime / 1000000.0;

            // Update logic
            circleX += (int) (circleSpeed * elapsedTimeMillis / 1000.0);

  
            if (circleX > getWidth() - 100) {
                circleX = getWidth() - 100; 
                circleSpeed = -circleSpeed;
            } else if (circleX < 0) {
                circleX = 0; 
                circleSpeed = -circleSpeed; 
            }

            // Display
            repaint();

            try {
                Thread.sleep(10); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (currentTime - startTime >= 3_000_000_000L && !squareVisible) {
                squareVisible = true;
            }

            if (squareVisible) {
                squareY += (int) (squareSpeed * elapsedTimeSec); 

                if (squareY > getHeight() - 100) {
                    squareY = getHeight() - 100; 
                    squareY = -squareSpeed; 
                }
            }else if (squareY < 0) {
                squareY = 0; 
                squareSpeed = -squareSpeed; 
            }

            try {
                Thread.sleep(10); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(circleX, 0, 100, 100);

        if (squareVisible) {
            g.drawRect(0, squareY, 100, 100);
        }
    }
}