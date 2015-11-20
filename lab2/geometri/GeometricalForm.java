package geometri;
import java.awt.*;

    /**
     * An interface for geometrical objects.
    */
    public interface GeometricalForm extends Comparable<GeometricalForm> {

        /**
         * Fill the forms area at the forms position with the forms color.
         * @param g - A graphic pen to draw with.
         */
        public void fill(Graphics g);

        /**
         * Get the colour of this form.
         * @return the color of this form.
         */
        public Color getColor();

        /**
         * Get the area of this form rounded to closest integer.
         * @return the computed area.
         */
        public int getArea();


        /**
         * The method compareTo compares the area of the forms to decide if the given geometrical form is less or greater than this object. If they have the same area, the perimeter decides.
         * @param f - The geometrical form to compare with.
         * @return An integer smaller than 0 if this form is smaller than the form given as argument, 0 if the sizes are equal, and a positive integer otherwise.
         */
        public int compareTo(GeometricalForm f);

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

        /**
         * Get the width of the surrounding rectangle of this form.
         * @return the width
         */
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