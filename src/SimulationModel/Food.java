package SimulationModel;

import Shapes.Point;
import Shapes.Shape;
import Shapes.Sprite;

public class Food {
    private int x;
    private int y;

    public Food(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void update() {

    }

    public Shape getShape() {
        return new Point(x,y);
    }

    public Sprite getSprite() {
        return null;
    }
}
