package geometri;
import java.awt.*;

    /**
     * An interface for geometrical objects.
    */
    public interface GeometricalForm extends Comparable<GeometricalForm> {
        public void fill(Graphics g);
        public Color getColor();
        public int getArea();

	    /**
	     * Get the height of the surrounding rectangle of this form.
	     * @return the x coordinate.
	     */
        public int getHeight();

	    /**
	     * Get the perimeter of this form rounded to closest integer.
	     * @return the computed perimeter.
	     */
        public int getPerimeter();
        public int getWidth();

	    /**
	     * Get the x coordinate of the position of this form.
	     * @return the x coordinate.
	     */
        public int getX();

	    /**
	     * Get the y coordinate of the position of this form.
	     * @return the y coordinate.
	     */
        public int getY();

	    /**
	     * Move the form the given distances. Check if the new coordinates are legal and if they are, set the position
	     * to the new coordinates. Otherwise an IllegalPositionException is thrown. Origo is (0,0) and only positive
	     * coordinates are legal.
	     * @param dx move the form dx points to the right.
	     * @param dy move the form dy points down.
	     * @throws IllegalPositionException
	     */
        public void move(int dx, int dy) throws IllegalPositionException;

	    /**
	     * Place the form on given coordinates. Check if the coordinates are legal. Origo is (0,0) and only positive
	     * coordinates are legal. If they are legal, update the position with the new coordinates. Otherwise an
	     * IllegalPositionException is thrown.
	     * @param x the x position to be moved to.
	     * @param y the x position to be moved to.
	     * @throws IllegalPositionException
	     */
        public void place(int x, int y) throws IllegalPositionException;

	    /**
	     * Indicates whether some other object is "equal to" this one, sharing all attributes except for position.
	     * @param o object to compare.
	     * @return returns true if the objects are the same.
	     */
	    @Override
	    public boolean equals(Object o);

	    /**
	     * Returns a hash code value for the object.
	     * @return a hash code value for this object.
	     */
	    @Override
	    public int hashCode();
    }