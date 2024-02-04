import java.awt.*;
import java.awt.image.BufferedImage;

public class paint {
    static void colorpent(BufferedImage buffer){
        Color c = new Color(255,212,81);
        DrawALGO.floodFill(buffer, 311 ,376, Color.WHITE, c);
        
    }
    public static void colorpent(BufferedImage buffer, double scaleFactor) {
        Color c = new Color(255,212,81);
        int centerX = (int)(311 * scaleFactor / 2);
        int centerY = (int)(376 * scaleFactor / 2);
        System.out.println("x = " + centerX +" , y = " + centerY);
        DrawALGO.floodFill(buffer, centerX, centerY, Color.WHITE, c);
    }
}
