package orig2011.v5;


import java.awt.*;

/**
 * A game tile combined of two other tiles.
 * 
 * Whenever the object paints itself, the bottom tile is painted first,
 * then the top tile is painted on top.
 */
public class CompositeTile implements orig2011.v3.GameTile {
	private final orig2011.v3.GameTile bottomTile;
	private final orig2011.v3.GameTile topTile;

	public CompositeTile(final orig2011.v3.GameTile bottom, final orig2011.v3.GameTile top) {
		this.bottomTile = bottom;
		this.topTile = top;
	}

	public orig2011.v3.GameTile getTop() {
		return this.topTile;
	}

	public GameTile getBottom() {
		return this.bottomTile;
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
	@Override
	public void draw(final Graphics g, final int x, final int y,
				final Dimension d) {
		this.bottomTile.draw(g, x, y, d);
		this.topTile.draw(g, x, y, d);
	}
}
