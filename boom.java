import java.awt.*;
import java.awt.image.BufferedImage;

public class boom {
    static void boom_nugget(Graphics g , BufferedImage buffer) {
        Color c = new Color(14, 12, 12);
        
        

        DrawALGO.drawQuadraticBezierCurve(g, 215, 330, 205, 320, 215, 300);
        DrawALGO.drawQuadraticBezierCurve(g, 215, 300, 200, 270, 215, 260);
        DrawALGO.drawQuadraticBezierCurve(g, 215, 260, 200, 230, 215, 220);
        DrawALGO.drawQuadraticBezierCurve(g, 215, 330, 220, 360, 260, 350);
        DrawALGO.drawQuadraticBezierCurve(g, 260, 350, 275, 360, 305, 350);
        DrawALGO.drawQuadraticBezierCurve(g, 305, 350, 335, 363, 355, 350);
        DrawALGO.drawQuadraticBezierCurve(g, 355, 350, 368, 333, 358, 320);
        DrawALGO.drawQuadraticBezierCurve(g, 358, 320, 373, 300, 361, 280);
        DrawALGO.drawQuadraticBezierCurve(g, 361, 280, 373, 260, 361, 240);
        DrawALGO.drawQuadraticBezierCurve(g, 361, 240, 375, 225, 361, 200);
        DrawALGO.drawQuadraticBezierCurve(g, 361, 200, 364, 175, 330, 170);
        DrawALGO.drawQuadraticBezierCurve(g, 330, 170, 305, 160, 285, 170);
        DrawALGO.drawQuadraticBezierCurve(g, 285, 170, 265, 160, 240, 170);
        DrawALGO.drawQuadraticBezierCurve(g, 240, 170, 200, 170, 216, 200);
        DrawALGO.drawQuadraticBezierCurve(g, 216, 200, 200, 213, 215, 220);

        DrawALGO.drawQuadraticBezierCurve(g, (int) ((270 * 0.6667) + 120 - 50 + 30 - 5 + 3),
                (int) ((240 * 0.6667) + 70), (int) ((285 * 0.6667) + 120 - 50 + 30 - 5 + 3),
                (int) ((265 * 0.6667) + 70), (int) ((305 * 0.6667) + 120 - 50 + 30 - 5 + 3),
                (int) ((240 * 0.6667) + 70));
        DrawALGO.floodFill(buffer, 255 ,218, Color.white, c);
        DrawALGO.drawQuadraticBezierCurve(g, 240, 272, 320, 253, 245, 252);

        DrawALGO.drawQuadraticBezierCurve(g, 330, 275, 265, 253, 335, 252);

        DrawALGO.midpointCircle(g, 255, 218, 13);
        DrawALGO.midpointCircle(g, 320, 218, 13);
        c = new Color(234,167,52);
        DrawALGO.floodFill(buffer, 300 ,300, new Color(14, 12, 12), c);
    }

    static void boom_chick(Graphics g) {
        // left up
        // First Bezier curve
        DrawALGO.my_Bezier_Curve(g, 105, 79, 105, 75, 115, 55, 130, 60);
        // Second Bezier curve
        DrawALGO.my_Bezier_Curve(g, 110, 77, 90, 85, 90, 100, 102, 110);
        // Third Bezier curve
        DrawALGO.my_Bezier_Curve(g, 102, 110, 95, 100, 100, 150, 140, 120);
        // Fourth Bezier curve
        DrawALGO.my_Bezier_Curve(g, 135, 125, 150, 125, 165, 115, 160, 100);
        // Fifth Bezier curve
        DrawALGO.my_Bezier_Curve(g, 125, 65, 150, 35, 190, 80, 155, 105);

        // right up
        // First Bezier curve
        DrawALGO.my_Bezier_Curve(g, (int) ((405 * 1.2) - 70), (int) (79 * 1.2), (int) ((405 * 1.2) - 70),
                (int) (75 * 1.2), (int) ((415 * 1.2) - 70), (int) (55 * 1.2), (int) ((430 * 1.2) - 70),
                (int) (60 * 1.2));
        // Second Bezier curve
        DrawALGO.my_Bezier_Curve(g, (int) ((410 * 1.2) - 70), (int) (77 * 1.2), (int) ((390 * 1.2) - 70),
                (int) (85 * 1.2), (int) ((390 * 1.2) - 70), (int) (100 * 1.2), (int) ((402 * 1.2) - 70),
                (int) (110 * 1.2));
        // Third Bezier curve
        DrawALGO.my_Bezier_Curve(g, (int) ((402 * 1.2) - 70), (int) (110 * 1.2), (int) ((395 * 1.2) - 70),
                (int) (100 * 1.2), (int) ((400 * 1.2) - 70), (int) (150 * 1.2), (int) ((440 * 1.2) - 70),
                (int) (120 * 1.2));
        // Fourth Bezier curve
        DrawALGO.my_Bezier_Curve(g, (int) ((435 * 1.2) - 70), (int) (125 * 1.2), (int) ((450 * 1.2) - 70),
                (int) (125 * 1.2), (int) ((465 * 1.2) - 70), (int) (115 * 1.2), (int) ((460 * 1.2) - 70),
                (int) (100 * 1.2));
        // Fifth Bezier curve
        DrawALGO.my_Bezier_Curve(g, (int) ((425 * 1.2) - 70), (int) (65 * 1.2), (int) ((450 * 1.2) - 70),
                (int) (35 * 1.2), (int) ((490 * 1.2) - 70), (int) (80 * 1.2), (int) ((455 * 1.2) - 70),
                (int) (105 * 1.2));

        // down right
        // First Bezier curve
        DrawALGO.my_Bezier_Curve(g, (int) ((405 * 1.2) - 70), (int) ((79 * 1.2) + 200), (int) ((405 * 1.2) - 70),
                (int) ((75 * 1.2) + 200), (int) ((415 * 1.2) - 70), (int) ((55 * 1.2) + 200), (int) ((430 * 1.2) - 70),
                (int) ((60 * 1.2) + 200));
        // Second Bezier curve
        DrawALGO.my_Bezier_Curve(g, (int) ((410 * 1.2) - 70), (int) ((77 * 1.2) + 200), (int) ((390 * 1.2) - 70),
                (int) ((85 * 1.2) + 200), (int) ((390 * 1.2) - 70), (int) ((100 * 1.2) + 200), (int) ((402 * 1.2) - 70),
                (int) ((110 * 1.2) + 200));
        // Third Bezier curve
        DrawALGO.my_Bezier_Curve(g, (int) ((402 * 1.2) - 70), (int) ((110 * 1.2) + 200), (int) ((395 * 1.2) - 70),
                (int) ((100 * 1.2) + 200), (int) ((400 * 1.2) - 70), (int) ((150 * 1.2) + 200),
                (int) ((440 * 1.2) - 70), (int) ((120 * 1.2) + 200));
        // Fourth Bezier curve
        DrawALGO.my_Bezier_Curve(g, (int) ((435 * 1.2) - 70), (int) ((125 * 1.2) + 200), (int) ((450 * 1.2) - 70),
                (int) ((125 * 1.2) + 200), (int) ((465 * 1.2) - 70), (int) ((115 * 1.2) + 200),
                (int) ((460 * 1.2) - 70), (int) ((100 * 1.2) + 200));
        // Fifth Bezier curve
        DrawALGO.my_Bezier_Curve(g, (int) ((425 * 1.2) - 70), (int) ((65 * 1.2) + 200), (int) ((450 * 1.2) - 70),
                (int) ((35 * 1.2) + 200), (int) ((490 * 1.2) - 70), (int) ((80 * 1.2) + 200), (int) ((455 * 1.2) - 70),
                (int) ((105 * 1.2) + 200));

        // down
        // First Bezier curve
        DrawALGO.my_Bezier_Curve(g, (int) ((405 * 1.2) - 245), (int) ((79 * 1.2) + 320), (int) ((405 * 1.2) - 245),
                (int) ((75 * 1.2) + 320), (int) ((415 * 1.2) - 245), (int) ((55 * 1.2) + 320),
                (int) ((430 * 1.2) - 245), (int) ((60 * 1.2) + 320));
        // Second Bezier curve
        DrawALGO.my_Bezier_Curve(g, (int) ((410 * 1.2) - 245), (int) ((77 * 1.2) + 320), (int) ((390 * 1.2) - 245),
                (int) ((85 * 1.2) + 320), (int) ((390 * 1.2) - 245), (int) ((100 * 1.2) + 320),
                (int) ((402 * 1.2) - 245), (int) ((110 * 1.2) + 320));
        // Third Bezier curve
        DrawALGO.my_Bezier_Curve(g, (int) ((402 * 1.2) - 245), (int) ((110 * 1.2) + 320), (int) ((395 * 1.2) - 245),
                (int) ((100 * 1.2) + 320), (int) ((400 * 1.2) - 245), (int) ((150 * 1.2) + 320),
                (int) ((440 * 1.2) - 245), (int) ((120 * 1.2) + 320));
        // Fourth Bezier curve
        DrawALGO.my_Bezier_Curve(g, (int) ((435 * 1.2) - 245), (int) ((125 * 1.2) + 320), (int) ((450 * 1.2) - 245),
                (int) ((125 * 1.2) + 320), (int) ((465 * 1.2) - 245), (int) ((115 * 1.2) + 320),
                (int) ((460 * 1.2) - 245), (int) ((100 * 1.2) + 320));
        // Fifth Bezier curve
        DrawALGO.my_Bezier_Curve(g, (int) ((425 * 1.2) - 245), (int) ((65 * 1.2) + 320), (int) ((450 * 1.2) - 245),
                (int) ((35 * 1.2) + 320), (int) ((490 * 1.2) - 245), (int) ((80 * 1.2) + 320),
                (int) ((455 * 1.2) - 245), (int) ((105 * 1.2) + 320));

        // left down
        // First Bezier curve
        DrawALGO.my_Bezier_Curve(g, (int) ((405 * 1.2) - 420), (int) ((79 * 1.2) + 200), (int) ((405 * 1.2) - 420),
                (int) ((75 * 1.2) + 200), (int) ((415 * 1.2) - 420), (int) ((55 * 1.2) + 200),
                (int) ((430 * 1.2) - 420), (int) ((60 * 1.2) + 200));
        // Second Bezier curve
        DrawALGO.my_Bezier_Curve(g, (int) ((410 * 1.2) - 420), (int) ((77 * 1.2) + 200), (int) ((390 * 1.2) - 420),
                (int) ((85 * 1.2) + 200), (int) ((390 * 1.2) - 420), (int) ((100 * 1.2) + 200),
                (int) ((402 * 1.2) - 420), (int) ((110 * 1.2) + 200));
        // Third Bezier curve
        DrawALGO.my_Bezier_Curve(g, (int) ((402 * 1.2) - 420), (int) ((110 * 1.2) + 200), (int) ((395 * 1.2) - 420),
                (int) ((100 * 1.2) + 200), (int) ((400 * 1.2) - 420), (int) ((150 * 1.2) + 200),
                (int) ((440 * 1.2) - 420), (int) ((120 * 1.2) + 200));
        // Fourth Bezier curve
        DrawALGO.my_Bezier_Curve(g, (int) ((435 * 1.2) - 420), (int) ((125 * 1.2) + 200), (int) ((450 * 1.2) - 420),
                (int) ((125 * 1.2) + 200), (int) ((465 * 1.2) - 420), (int) ((115 * 1.2) + 200),
                (int) ((460 * 1.2) - 420), (int) ((100 * 1.2) + 200));
        // Fifth Bezier curve
        DrawALGO.my_Bezier_Curve(g, (int) ((425 * 1.2) - 420), (int) ((65 * 1.2) + 200), (int) ((450 * 1.2) - 420),
                (int) ((35 * 1.2) + 200), (int) ((490 * 1.2) - 420), (int) ((80 * 1.2) + 200),
                (int) ((455 * 1.2) - 420), (int) ((105 * 1.2) + 200));

    }
}
