package geometri;

import java.awt.*;
import java.util.Objects;

public class Square extends Rectangle {

    /**
     *Creates a Square at the specified position with the specified width and height.
     * @param x the x coordinate.
     * @param y the y coordinate.
     * @param side  the side.
     * @param c the color of the Square.
     * @throws IllegalPositionException
     */
    public Square(int x, int y, int side, Color c) throws IllegalPositionException{
        super(x,y,side,side,c);
    }

    /**
     * Creates a Square at the position of another geometrical form.
     * @param f a geometrical form
     * @param side the side.
     * @param c the color of the Square.
     */
    public Square(GeometricalForm f, int side, Color c){
        super(f,side,side,c);
    }
}