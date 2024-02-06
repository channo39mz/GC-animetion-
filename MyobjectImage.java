import java.awt.*;
import java.awt.image.BufferedImage;

public class MyobjectImage {
    public int i = -20;
    static void baby_chick(Graphics g , BufferedImage buffer){
        Graphics2D g2 = (Graphics2D) g;
        int i = -40;
        int j = -50;
        DrawALGO.my_Bezier_Curve(g, 284+i, 268+j, 227+i, 275+j, 170+i, 420+j, 318+i, 428+j);
        DrawALGO.my_Bezier_Curve(g, 318+i, 428+j, 461+i, 409+j, 402+i, 271+j, 333+i, 265+j);
        DrawALGO.my_Bezier_Curve(g, 285+i, 267+j, 264+i, 252+j, 280+i, 243+j, 298+i, 253+j);
        DrawALGO.my_Bezier_Curve(g, 299+i, 253+j, 287+i, 223+j, 310+i, 235+j, 317+i, 248+j);
        DrawALGO.my_Bezier_Curve(g, 317+i, 248+j, 323+i, 216+j, 339+i, 249+j, 333+i, 264+j);

        Color c = new Color(116,59,25);
        
        DrawALGO.midpointCircle(g,277+i, 320+j, 5);
        DrawALGO.midpointCircle(g,350+i, 320+j, 5);
        
        DrawALGO.floodFill(buffer, 276+i, 318+j, Color.white, c);
        DrawALGO.midpointCircle(g,276+i, 318+j, 12);
        DrawALGO.midpointCircle(g,350+i, 317+j, 12);

        //DrawALGO.floodFill(buffer, 277+i, 320+j, new Color(116,59,25), Color.white);
        //DrawALGO.plot(g2, 276+i, 318+j);

        DrawALGO.my_Bezier_Curve(g, 294+i, 354+j, 300+i, 346+j, 319+i, 348+j, 333+i, 353+j);
        DrawALGO.my_Bezier_Curve(g, 294+i, 354+j, 294+i, 357+j, 318+i, 374+j, 333+i, 353+j);
        DrawALGO.bresenhamLine(g, 294+i, 354+j, 333+i, 353+j);
        c = new Color(255,212,81);
        DrawALGO.floodFill(buffer, 311+i ,376+j, new Color(116,59,25), c);
        c = new Color(244,162,86);
        DrawALGO.floodFill(buffer, 290+i ,351+j, new Color(116,59,25), c);
        DrawALGO.floodFill(buffer, 290+i ,361+j, new Color(116,59,25), c);
        c = new Color(116,59,25);
       
      
    }
    private static int scaleCoordinate(int original, double scaleFactor) {
        return (int) (original * scaleFactor);
    }

    static void background(Graphics g){
        int[] arrx = {0, 0, 54};
        int[] arry = {82, 185, 98};
        DrawALGO.mydrawpoly(g,arrx,arry);
        arrx = new int[] {0, 54, 98, 72,0};
        arry = new int[] {82 ,98, 60, 0,0};
        DrawALGO.mydrawpoly(g,arrx,arry);
        arrx = new int[] {72,198,242,98};
        arry = new int[] {0,0,68,60};
        DrawALGO.mydrawpoly(g,arrx,arry);
        arrx = new int[] {198,242,341,343};
        arry = new int[] {0,68,68,0};
        DrawALGO.mydrawpoly(g,arrx,arry);
        arrx = new int[] {343,341,471,549,510};
        arry = new int[] {0,68,134,59,0};
        DrawALGO.mydrawpoly(g,arrx,arry);
        DrawALGO.bresenhamLine(g, 471, 134, 600, 189);
        DrawALGO.bresenhamLine(g, 471, 134, 510, 308);
        DrawALGO.bresenhamLine(g, 600, 311, 510, 308);
        DrawALGO.bresenhamLine(g, 510, 308, 483, 363);
        DrawALGO.bresenhamLine(g, 483, 363, 522, 423);
        DrawALGO.bresenhamLine(g, 522, 423, 600, 430);
        DrawALGO.bresenhamLine(g, 569, 426, 538, 486);
        DrawALGO.bresenhamLine(g, 538, 486, 495, 546);
        DrawALGO.bresenhamLine(g, 495, 546, 495, 600);
        DrawALGO.bresenhamLine(g, 495, 546, 285, 543);
        DrawALGO.bresenhamLine(g, 285, 543, 365, 600);
        DrawALGO.bresenhamLine(g, 285, 543, 107, 520);
        DrawALGO.bresenhamLine(g, 107, 520, 63, 600);
        DrawALGO.bresenhamLine(g, 107, 520, 63, 506);
        DrawALGO.bresenhamLine(g, 63, 506, 0, 501);
        DrawALGO.bresenhamLine(g, 63, 506, 80, 424);
        DrawALGO.bresenhamLine(g, 80, 424, 37, 370);
        DrawALGO.bresenhamLine(g, 37, 370, 0, 397);
        DrawALGO.bresenhamLine(g, 37, 370, 45, 315);
        DrawALGO.bresenhamLine(g,45, 315,  0,  291);
    }
}
