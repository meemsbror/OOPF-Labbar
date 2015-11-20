package geometri;
import java.awt.*;

    /**
     * An interface for geometrical objects.
    */
    public interface GeometricalForm extends Comparable<GeometricalForm> {
        public void fill(Graphics g);
        public Color getColor();
        public int getArea();
        public int getHeight();
        public int getPerimeter();
        public int getWidth();
        public int getX();
        public int getY();
        public void move(int dx, int dy) throws IllegalPositionException;
        public void place(int x, int y) throws IllegalPositionException;

	    /**
	     * Indicates whether some other object is "equal to" this one, sharing all attributes except for position.
	     * @param o object to compare.
	     * @return
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