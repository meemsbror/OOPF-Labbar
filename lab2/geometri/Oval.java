package geometri;

import java.awt.*;

public class Oval implements GeometricalForm{

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

	@Override
	public int compareTo(GeometricalForm f) {
			return 0;
	}
	public void fill(Graphics g){
	}
	public Color getColor(){
		return Color.red;
	}
	public int getArea(){
		return 0;
	}
	public int getHeight(){
		return 0;
	}
	public int getPerimeter(){
		return 0;
	}
	public int getWidth(){
		return 0;
	}
	public int getX(){
		return 0;
	}
	public int getY(){
		return 0;
	}
	public void move(int dx, int dy) throws IllegalPositionException{
	}
	public void place(int x, int y) throws IllegalPositionException{
	}


	@Override
	public boolean equals(Object o){
		return false;
	}

	@Override
	public int hashCode(){
		return 0;
	}

}
