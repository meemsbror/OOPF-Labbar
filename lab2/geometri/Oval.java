package geometri;

import java.awt.*;

public class Oval extends AbstractGeometricalForm {

	/**
	 * Creates an oval.
	 * @param x the x position.
	 * @param y the y position.
	 * @param width the width.
	 * @param height the height.
	 * @param c the color.
	 * @throws IllegalPositionException
	 */
	public Oval(int x, int y, int width, int height, Color c) throws IllegalPositionException{
        super(x,y,width,height,c);
	}

	/**
	 * Creates an oval at the position of a specified GeometricalForm.
	 * @param f the GeometricalForm used for getting the position.
	 * @param width the width.
	 * @param height the height.
	 * @param c the color.
	 */
    public Oval(GeometricalForm f, int width, int height, Color c) throws IllegalPositionException{
        super(f,width,height,c);
    }

    /**
     *
     * @return
     */
    public int getPerimeter(){
        return Math.round(Math.round((Math.PI/2.0)*Math.sqrt(2*getHeight()*getHeight()+2*getWidth()+getWidth())));
    }

	public int getArea() {
		return Math.round(Math.round((getWidth() / 2) * (getHeight() / 2) * Math.PI));
	}

    public void fill(Graphics g){
        g.setColor(getColor());
        g.fillOval(getX(),getY(),getWidth(),getHeight());
    }

}
