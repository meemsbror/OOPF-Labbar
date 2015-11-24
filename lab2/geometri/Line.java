package geometri;

import java.awt.*;

public class Line extends AbstractGeometricalForm  {

	final private int x2, y2;

	/**
	 * Creates a line.
	 * @param x1 the starting x position.
	 * @param y1 the starting y position.
	 * @param x2 the end x position.
	 * @param y2 the end y position.
	 * @param c the color.
	 * @throws IllegalPositionException
	 */
	public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException{
		super(x1,y1,Math.round(Math.round(Math.sqrt(Math.pow(x1- 2x2,2)+Math.pow(y1-y2,2)))),0,c);

		this.x2=x2;
		this.y2=y2;
	}

	/**
	 * Creates a line at the position of a specified GeometricalForm.
	 * @param f1 the GeometricalForm used for getting the starting position.
	 * @param f2 the GeometricalForm used for getting the end position.
	 * @param c the color1.
	 */
	public Line(GeometricalForm f1, GeometricalForm f2, Color c){
        super(f1,Math.round(Math.round(Math.sqrt(Math.pow(f1.getX()-f1.getY(),2)+Math.pow(f2.getX()-f2.getY(),2))))c);

	}

	public int getPerimeter(){
		return getWidth()*2;
	}


	public int getArea() {
		return 0;
	}

	public void fill(Graphics g){

	}

    private int getLength(int x1,int y1,int x2,int y2){
        return ;
    }

}
