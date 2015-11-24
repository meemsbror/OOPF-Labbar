package geometri;

import java.awt.*;

public class Oval extends AbstractGeometricalForm {

	private int x,y,width, height;
	private Color color;

	/**
	 * Creates an oval.
	 * @param x the x position.
	 * @param y the y position.
	 * @param width the width.
	 * @param height the height.
	 * @param c the color.
	 * @throws IllegalPositionException
	 */
	public Oval(int x, int y, int width, int height, Color c) throws IllegalPositionException{}

	/**
	 * Creates an oval at the position of a specified GeometricalForm.
	 * @param f the GeometricalForm used for getting the position.
	 * @param width the width.
	 * @param height the height.
	 * @param c the color.
	 */
	public Oval(GeometricalForm f, int width, int height, Color c){}

	public int getArea() {
		return Math.round(Math.round(getWidth() * getHeight() * Math.PI));
	}

}
