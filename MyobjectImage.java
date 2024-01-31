import java.awt.*;

public class MyobjectImage {
    static void baby_chick(Graphics g){
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
}
