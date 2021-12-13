package SimulationModel;

import Shapes.Scene;
import Shapes.Shape;
import Shapes.Sprite;

import java.util.ArrayList;

/**
 * This is a class
 * Created 2021-10-18
 *
 * @author Magnus Silverdal
 */
public class SimulationModel {
    Scene scene;
    Varelsen c;
    Food m;
    public SimulationModel() {
        c = new Varelsen(0,0);
        m = new Food(20, 20);
    }
    public void update() {
        c.update();
        m.update();
    }

    public ArrayList<Shape> getShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(c.getShape());
        shapes.add(m.getShape());
        return shapes;
    }

    public ArrayList<Sprite> getSprites() {
        ArrayList<Sprite> sprites = new ArrayList<>();
        sprites.add(c.getSprite());
        sprites.add(m.getSprite());
        return sprites;
    }
}
