package geometri;

import java.awt.*;
import java.util.Objects;

public class Point extends AbstractGeometricalForm {

    private int x,y;
    private Color color;

    /**
     *
     * @param x the x coordinate
     * @param y the y coordinate
     * @param c the color of the point
     */
    public Point(int x, int y,Color c)throws IllegalPositionException{
    }

    /**
     *
     * @param f a geometrical form
     * @param c the color of the point
     */
    public Point(GeometricalForm f, Color c){
    }

	public int getArea() {
		return 0;
	}

}
