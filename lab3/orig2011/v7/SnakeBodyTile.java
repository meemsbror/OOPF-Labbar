package orig2011.v7;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 * A rectangular tile used to represent the snake's body.
 * Always green with black spots.
 *
 * Whenever the object should paint itself,
 * it is told what size and position that
 * should be used to paint it.
 */
public class SnakeBodyTile extends RectangularTile{

	/**
	 * Creates a rectangular snake body part.
	 */
	public SnakeBodyTile(){
		super(Color.GREEN);
	}


	/**
	 * Draws itself in a given graphics context, position and size.
	 *
	 * @param g
	 *            graphics context to draw on.
	 * @param x
	 *            pixel x coordinate of the tile to be drawn.
	 * @param y
	 *            pixel y coordinate of the tile to be drawn.
	 * @param d
	 *            size of this object in pixels.
	 */
	public void draw(final Graphics g, final int x, final int y,final Dimension d){
		super.draw(g,x,y,d);
		g.setColor(Color.BLACK);
		g.fillOval(x+d.width/3,y+d.height/4,d.width/8,d.height/8);
		g.fillOval(x+d.width/17,y+d.height/2,d.width/5,d.height/5);
		g.fillOval(x+d.width/2,y+d.height/5,d.width/9,d.height/9);
	}
}
