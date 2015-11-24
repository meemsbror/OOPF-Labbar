package geometri;

import java.awt.*;
import java.util.Objects;

public class Rectangle extends AbstractGeometricalForm {



    /**
     *Creates a Square at the specified position with the specified width and height.
     * @param x the x coordinate
     * @param y the y coordinate
     * @param width the width
     * @param height the height
     * @param c the color of the Rectangle
     */
    public Rectangle(int x, int y, int width, int height, Color c){

	    super(x, y, width, height, c);

    }

    /**
     *Creates a Rectangle at the position of another geometrical form.
     * @param f a geometrical form
     * @param width the width
     * @param height the height
     * @param c the color of the Square.
     */
    public Rectangle(GeometricalForm f,int width,int height, Color c){

            this(f.getX(), f.getY(), width, height, c);



    }


	public int getArea() {
		return getHeight() * getWidth();
	}

}
