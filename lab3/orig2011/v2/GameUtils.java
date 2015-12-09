package orig2011.v2;


import orig2011.v0.GameTile;
import orig2011.v0.Position;

public class GameUtils {

	/**
	 * Set the tile on a specified position in the gameboard.
	 *
	 * @param pos
	 *            The position in the gameboard matrix.
	 * @param tile
	 *            The type of tile to paint in specified position
	 */
	protected void setGameboardState(final Position pos, final GameTile tile) {
		setGameboardState(pos.getX(), pos.getY(), tile);
	}

	/**
	 * Set the tile on a specified position in the gameboard.
	 *
	 * @param x
	 *            Coordinate in the gameboard matrix.
	 * @param y
	 *            Coordinate in the gameboard matrix.
	 * @param tile
	 *            The type of tile to paint in specified position
	 */
	protected void setGameboardState(final int x, final int y,
	                                 final GameTile tile) {
		this.gameboardState[x][y] = tile;
	}

	public GameTile getGameboardState(final Position pos) {
		return getGameboardState(pos.getX(), pos.getY());
	}


}
