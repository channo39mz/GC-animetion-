import java.awt.*;
import java.util.LinkedList;
import java.awt.image.BufferedImage;
import java.util.Queue;

public class DrawALGO {
    static void bresenhamLine(Graphics g ,int x1 , int y1 , int x2 , int y2){
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;

        boolean isSwap = false;

        if (dy > dx) {
            int temp = dx;
            dx = dy;
            dy = temp;
            isSwap = true;
        }

        int D = 2 * dy - dx;
        int x = x1;
        int y = y1;

        for (int i = 1; i <= dx; i++) {
            plot(g, x, y);

            if (D >= 0) {
                if (isSwap) x += sx;
                else y += sy;

                D -= 2 * dx;
            }

            if (isSwap) y += sy;
            else x += sx;

            D += 2 * dy;
        }
    }

    static void mydrawpoly(Graphics g , int[] arrx , int[] arry){
        Polygon poly = new Polygon();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(2));
        for(int i = 0; i < arrx.length; i++){
            poly.addPoint(arrx[i], arry[i]);
        }
        g2d.drawPolygon(poly);
    }

    static void drawQuadraticBezierCurve(Graphics g, int x0, int y0, int x1, int y1, int x2, int y2) {
        for (double t = 0; t <= 1; t += 0.01) {
            double u = 1 - t;
            double x = (u * u * x0) + (2 * u * t * x1) + (t * t * x2);
            double y = (u * u * y0) + (2 * u * t * y1) + (t * t * y2);
            plot(g, (int) x, (int) y);
        }
    }

    static void my_Bezier_Curve(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double t;
    
        for (t = 0.0; t <= 1.0; t += 0.001) {
            double xt = Math.pow(1 - t, 3) * x1 + 3 * t * Math.pow(1 - t, 2) * x2 + 3 * Math.pow(t, 2) * (1 - t) * x3 + Math.pow(t, 3) * x4;
            double yt = Math.pow(1 - t, 3) * y1 + 3 * t * Math.pow(1 - t, 2) * y2 + 3 * Math.pow(t, 2) * (1 - t) * y3 + Math.pow(t, 3) * y4;
            plot(g, (int) xt, (int) yt);
        }
    }

    static BufferedImage floodFill(BufferedImage m, int x, int y, Color targetColor, Color replacementColor) {
        Queue<NodeCoordinate> q = new LinkedList<>();
        coloredPlot(m.getGraphics(), x, y, replacementColor);
        q.add(new NodeCoordinate(x, y));
        while (!q.isEmpty()) {
            NodeCoordinate cur = q.poll();
            try {
                // South
                if (m.getRGB(cur.getX(), cur.getY() + 1) == targetColor.getRGB()) {
                    coloredPlot(m.getGraphics(), cur.getX(), cur.getY() + 1, replacementColor);
                    q.add(new NodeCoordinate(cur.getX(), cur.getY() + 1));
                }
                // North
                if (m.getRGB(cur.getX(), cur.getY() - 1) == targetColor.getRGB()) {
                    coloredPlot(m.getGraphics(), cur.getX(), cur.getY() - 1, replacementColor);
                    q.add(new NodeCoordinate(cur.getX(), cur.getY() - 1));
                }
                // West
                if (m.getRGB(cur.getX() - 1, cur.getY()) == targetColor.getRGB()) {
                    coloredPlot(m.getGraphics(), cur.getX() - 1, cur.getY(), replacementColor);
                    q.add(new NodeCoordinate(cur.getX() - 1, cur.getY()));
                }
                // East
                if (m.getRGB(cur.getX() + 1, cur.getY()) == targetColor.getRGB()) {
                    coloredPlot(m.getGraphics(), cur.getX() + 1, cur.getY(), replacementColor);
                    q.add(new NodeCoordinate(cur.getX() + 1, cur.getY()));
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }
        }
        return m;
    }

    static void coloredPlot(Graphics g, int x, int y, Color c) {
        g.setColor(c);
        g.fillRect(x, y, 1, 1);
        g.setColor(Color.BLACK);
    }

    static class NodeCoordinate {
        private int x;
        private int y;

        NodeCoordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    static void plot(Graphics g, int x, int y) {
        g.fillRect(x, y, 2, 2);
    }

    static public void midpointCircle(Graphics g, int centerX, int centerY, int radius) {
        int x = 0;
        int y = radius;
        int Dx = 2 * x;
        int Dy = 2 * y;
        int D = 1 - radius;
    
        while (x <= y) {
            // Plot points in all octants
            plot(g, centerX + x, centerY + y);
            plot(g, centerX - x, centerY + y);
            plot(g, centerX + x, centerY - y);
            plot(g, centerX - x, centerY - y);
            plot(g, centerX + y, centerY + x);
            plot(g, centerX - y, centerY + x);
            plot(g, centerX + y, centerY - x);
            plot(g, centerX - y, centerY - x);
    
            x = x + 1;
            Dx = Dx + 2;
            D = D + Dx + 1;
    
            if (D >= 0) {
                y = y - 1;
                Dy = Dy - 2;
                D = D - Dy;
            }
        }
    }

    static public void midpointEllipse(Graphics g, int centerX, int centerY, int a, int b) {
        int a2 = a * a;
        int b2 = b * b;
        int twoA2 = 2 * a2;
        int twoB2 = 2 * b2;
    
        // REGION 1
        int x = 0;
        int y = b;
        int D = Math.round(b2 - a2 * b + a2 / 4);
        int Dx = 0;
        int Dy = twoA2 * y;
    
        while (Dx <= Dy) {
            // Plot points in 4 quadrants
            plot(g, centerX + x, centerY + y);
            plot(g, centerX - x, centerY + y);
            plot(g, centerX + x, centerY - y);
            plot(g, centerX - x, centerY - y);
    
            x = x + 1;
            Dx = Dx + twoB2;
            D = D + Dx + b2;
    
            if (D >= 0) {
                y = y - 1;
                Dy = Dy - twoA2;
                D = D - Dy;
            }
        }
    
        // REGION 2
        x = a;
        y = 0;
        D = Math.round(a2 - b2 * a + b2 / 4);
        Dx = twoB2 * x;
        Dy = 0;
    
        while (Dx >= Dy) {
            // Plot points in 4 quadrants
            plot(g, centerX + x, centerY + y);
            plot(g, centerX - x, centerY + y);
            plot(g, centerX + x, centerY - y);
            plot(g, centerX - x, centerY - y);
    
            y = y + 1;
            Dy = Dy + twoA2;
            D = D + Dy + a2;
    
            if (D >= 0) {
                x = x - 1;
                Dx = Dx - twoB2;
                D = D - Dx;
            }
        }
    }
}
