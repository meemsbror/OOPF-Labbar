package geometri;

import java.awt.*;
import java.util.Objects;


public class Point extends Line {


    /**
     * @param x the x coordinate
     * @param y the y coordinate
     * @param c the color of the point
     */
    public Point(int x, int y, Color c) throws IllegalPositionException {
        super(x, y, x, y, c);
    }

    /**
     * @param f a geometrical form
     * @param c the color of the point
     */
    public Point(AbstractGeometricalForm f, Color c) {
        super(f, f, c);
    }

}
