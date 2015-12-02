package geometri;

import java.awt.*;
import java.util.Objects;


public class Point extends Line {


    /**
     * Creates a point at the specified position.
     * @param x the x coordinate
     * @param y the y coordinate
     * @param c the color of the point
     */
    public Point(int x, int y, Color c) throws IllegalPositionException {
        super(x, y, x, y, c);
    }

    /**
     * Creates a point at the specified position.
     * @param f a geometrical form
     * @param c the color of the point
     */
    public Point(GeometricalForm f, Color c){
        super(f, f, c);
    }
}
