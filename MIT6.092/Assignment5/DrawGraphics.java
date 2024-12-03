import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class DrawGraphics {
    BouncingBox box;
    ArrayList<BouncingBox> Boxes=new ArrayList<BouncingBox>(6);
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Boxes.add(new BouncingBox(20, 50, Color.BLUE));
        Boxes.add(new BouncingBox(60, 90, Color.RED));
        Boxes.add(new BouncingBox(90, 150, Color.ORANGE));
        Random random = new Random();
        for(int i=0;i<=2;i++){
            box=Boxes.get(i);
            box.setMovementVector(random.nextInt(4),random.nextInt(3));
        }
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        for(int i=0;i<=2;i++){
            Boxes.get(i).draw(surface);  
        }    
        
        surface.drawRect(20, 200, 50, 35);
        surface.drawArc(30,100,50,50,0,290);
        int[] xPoints = {180, 200, 250, 230};
        int[] yPoints = {40, 60, 70, 80};
        surface.drawPolygon(xPoints, yPoints, 4);
    }
} 