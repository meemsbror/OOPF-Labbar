package geometri;

import java.awt.*;

public class Circle implements GeometricalForm{
	
	private int x,y,diameter;
	private Color color;


	/**
	 * Creates a circle.
	 * @param x the x position.
	 * @param y the y position.
	 * @param d the diameter.
	 * @param c the color.
	 */
	public Circle(int x, int y, int d,Color c){
	}

	/**
	 * Creates a circle at the position of the specified GeometricalForm.
	 * @param f the GeometricalForm used for getting the position.
	 * @param d the diameter.
	 * @param c the color.
	 */
	public Circle(GeometricalForm f, int d, Color c){
	}

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
