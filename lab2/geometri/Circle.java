package geometri;

import java.awt.*;

public class Circle extends Oval {

	/**
	 * Creates a circle.
	 * @param x the x position.
	 * @param y the y position.
	 * @param d the diameter.
	 * @param c the color.
	 */
	public Circle(int x, int y, int d,Color c)throws IllegalPositionException{
		super(x,y,d,d,c);
	}

	/**
	 * Creates a circle at the position of the specified GeometricalForm.
	 * @param f the GeometricalForm used for getting the position.
	 * @param d the diameter.
	 * @param c the color.
	 */
	public Circle(GeometricalForm f, int d, Color c) throws IllegalPositionException{
		super(f,d,d,c);
	}

	@Override
	public int getPerimeter(){
		return(Math.round(Math.round(Math.PI* Math.pow((getHeight() / 2), 2) )));
	}

}
