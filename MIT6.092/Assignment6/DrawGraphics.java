import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<Bouncer> movingob = new ArrayList<Bouncer>();
    ArrayList<StraightMover> movepatten = new ArrayList<StraightMover>();
    ArrayList<Mover> movers= new ArrayList<Mover>();//可以存储实现了接口Mover的对象

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box = new Rectangle(15, 20, Color.RED);
        MyShape oval = new MyShape(20, 20, Color.BLUE);
        movingob.add(new Bouncer(100, 70, box));
        movingob.add(new Bouncer(60, 20, box));
        movingob.add(new Bouncer(10,50, oval));
        // Obviously, you can use random function to set below.
        movingob.get(0).setMovementVector(3,1);
        movingob.get(1).setMovementVector(4, 2);
        movingob.get(2).setMovementVector(3,-2);
        movepatten.add(new StraightMover(150, 70, box));
        movepatten.add(new StraightMover(110, 20, box));
        movepatten.add(new StraightMover(40,50, oval));
        movepatten.get(0).setMovementVector(3,1);
        movepatten.get(1).setMovementVector(4, 2);
        movepatten.get(2).setMovementVector(3,-2);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for(int i=0;i<movingob.size();i++){
            movingob.get(i).draw(surface);
            movepatten.get(i).draw(surface);
        }
    }
}

