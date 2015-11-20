package geometri;

import java.awt.*;
import java.util.Objects;

public class Circle implements GeometricalForm{
	
	private int x,y,diameter;
	private Color color;
	
	public Circle(int x, int y, int d,Color c){
	}

	public Circle(GeometricalForm f, int d, Color c){
	}

	@Override
	public int compareTo(GeometricalForm g) {
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

	/**
	 *
	 * @param x
	 * @param y
	 * @throws IllegalPositionException
	 */
    public void place(int x, int y) throws IllegalPositionException{
	}

	/**
	 * Indicates whether some other object is "equal to" this one, sharing all attributes except for position.
	 * @param o object to compare.
	 * @return
	 */
	@Override
	public boolean equals(Object o){
		return false;
	}

	/**
	 * Returns a hash code value for the object.
	 * @return a hash code value for this object.
	 */
	@Override
	public int hashCode(){
		return 0;
	}
}
