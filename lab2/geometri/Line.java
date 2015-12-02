package geometri;

import java.awt.*;

public class Line extends AbstractGeometricalForm  {

    private boolean lineStartTop;

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
		super(boxPosition(x1, x2), boxPosition(y1, y2), boxSides(x1, x2), boxSides(y1, y2), c);

        lineStartTop = ((x1 < x2 && y1 < y2) || (x1 > x2 && y1 > y2));
	}

	/**
	 * Creates a line at the position of a specified GeometricalForm.
	 * @param f1 the GeometricalForm used for getting the starting position.
	 * @param f2 the GeometricalForm used for getting the end position.
	 * @param c the color1.
	 */
	public Line(GeometricalForm f1, GeometricalForm f2, Color c) {
        super(f1, boxSides(f1.getX(), f2.getX()), boxSides(f1.getY(), f2.getY()), c);

        lineStartTop = (f1.getX() < f2.getX() && f1.getY() < f2.getY()) || (f1.getX() > f2.getX() && f1.getY() > f2.getY());

		try {
			place(boxPosition(f1.getX(), f2.getX()), boxPosition(f1.getY(), f2.getY()));
		} catch (IllegalPositionException e) {
			//Kommer inte hända eftersom f1 och f2 redan har testats i konstruktorn som tar in koordinater.
		}
	}

    private static int boxPosition(int pos1, int pos2) {
        if (pos1 < pos2) {
            return pos1;
        }
        return pos2;
    }

    private static int boxSides(int side1, int side2) {
        if (side1 - side2 < 0) {
            return side2 - side1;
        }
        return side1 - side2;
    }

	public int getPerimeter(){
		return getLength() * 2;
	}

	public int getArea() {
		return 0;
	}

	public void fill(Graphics g){
        g.setColor(getColor());
        if(lineStartTop){
            g.drawLine(getX(),getY(),getX()+getWidth(),getY()+getHeight());
        }else{
            g.drawLine(getX(),getY()+getHeight(),getX()+getWidth(),getY());
        }
	}

    private int getLength(){
	    return Math.round(Math.round(Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2))));
    }
}
