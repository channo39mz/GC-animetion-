import java.awt.*;
import java.awt.image.BufferedImage;

public class paint {
    static void colorpent(BufferedImage buffer){
        Color c = new Color(255,212,81);
        DrawALGO.floodFill(buffer, 311 ,376, Color.WHITE, c);
        
    }
}
