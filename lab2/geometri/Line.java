package geometri;

import java.awt.*;

public class Line implements GeometricalForm {

	private int x1, y1, x2, y2;
	private Color color;

	/**
	 * Creates a line.
	 * @param x1 the starting x position.
	 * @param y1 the starting y position.
	 * @param x2 the end x position.
	 * @param y2 the end y position.
	 * @param c the color.
	 * @throws IllegalPositionException
	 */
	public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException{}

	/**
	 * Creates a line at the position of a specified GeometricalForm.
	 * @param f1 the GeometricalForm used for getting the starting position.
	 * @param f2 the GeometricalForm used for getting the end position.
	 * @param c the color1.
	 */
	public Line(GeometricalForm f1, GeometricalForm f2, Color c){}

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
