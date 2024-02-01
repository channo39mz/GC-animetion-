import java.awt.*;

public class MyobjectImage {
    public int i = -20;
    static void baby_chick(Graphics g, int size){
        Graphics2D g2 = (Graphics2D) g;
        
        DrawALGO.my_Bezier_Curve(g, 284, 268, 227, 275, 170, 420, 318, 428);
        DrawALGO.my_Bezier_Curve(g, 318, 428, 461, 409, 402, 271, 333, 265);
        DrawALGO.my_Bezier_Curve(g, 285, 267, 264, 252, 280, 243, 298, 253);
        DrawALGO.my_Bezier_Curve(g, 299, 253, 287, 223, 310, 235, 317, 248);
        DrawALGO.my_Bezier_Curve(g, 317, 248, 323, 216, 339, 249, 333, 264);
        g.drawOval(266, 308, 25, 25);
        g.drawOval(275, 315, 10, 10);
        g.drawOval(340, 307, 25, 25);
        g.drawOval(345, 314, 10, 10);
        DrawALGO.my_Bezier_Curve(g, 294, 354, 300, 346, 319, 348, 333, 353);
        DrawALGO.my_Bezier_Curve(g, 294, 354, 294, 357, 318, 374, 333, 353);
        DrawALGO.bresenhamLine(g, 294, 354, 333, 353);
        
    }
    static void baby_chick(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        int i = -40;
        int j = -50;
        DrawALGO.my_Bezier_Curve(g, 284+i, 268+j, 227+i, 275+j, 170+i, 420+j, 318+i, 428+j);
        DrawALGO.my_Bezier_Curve(g, 318+i, 428+j, 461+i, 409+j, 402+i, 271+j, 333+i, 265+j);
        DrawALGO.my_Bezier_Curve(g, 285+i, 267+j, 264+i, 252+j, 280+i, 243+j, 298+i, 253+j);
        DrawALGO.my_Bezier_Curve(g, 299+i, 253+j, 287+i, 223+j, 310+i, 235+j, 317+i, 248+j);
        DrawALGO.my_Bezier_Curve(g, 317+i, 248+j, 323+i, 216+j, 339+i, 249+j, 333+i, 264+j);
        g.drawOval(266+i, 308+j, 25, 25);
        g.drawOval(275+i, 315+j, 10, 10);
        g.drawOval(340+i, 307+j, 25, 25);
        g.drawOval(345+i, 314+j, 10, 10);
        DrawALGO.my_Bezier_Curve(g, 294+i, 354+j, 300+i, 346+j, 319+i, 348+j, 333+i, 353+j);
        DrawALGO.my_Bezier_Curve(g, 294+i, 354+j, 294+i, 357+j, 318+i, 374+j, 333+i, 353+j);
        DrawALGO.bresenhamLine(g, 294+i, 354+j, 333+i, 353+j);
        
    }
    private static int scaleCoordinate(int original, double scaleFactor) {
        return (int) (original * scaleFactor);
    }
}
