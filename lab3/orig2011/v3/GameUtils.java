package orig2011.v3;

import orig2011.v0.Position;

public class GameUtils {
    /**
     * Set the tile on a specified position in the gameboard.
     *
     * @param pos
     *              The position in the gameboard matrix.
     * @param tile
     *              The type of tile to paint in specified position
     * @param gameBoardState
     *              The gameBoard to be changed
     */
    public static void setGameboardState(final Position pos, final GameTile tile,final GameTile[][] gameBoardState){
        setGameboardState(pos.getX(), pos.getY(), tile,gameBoardState);

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
     * @param gameBoardState
     *            The gameBoard to be changed
     */
    public static void setGameboardState(final int x,final int y,final GameTile tile, final GameTile[][] gameBoardState){
        gameBoardState[x][y]=tile;
    }

    /**
     * Returns the GameTile in logical position (x,y) of the gameboard.
     *
     * @param pos
     *            The position in the gameBoard matrix.
     * @param gameBoardState
     *            The gameBoard
     */
    public static GameTile getGameboardState(final Position pos, final GameTile [][] gameBoardState){
        return getGameboardState(pos.getX(),pos.getY(),gameBoardState);
    }

    /**
     * Returns the GameTile in logical position (x,y) of the gameboard.
     *
     * @param x
     *            Coordinate in the gameboard matrix.
     * @param y
     *            Coordinate in the gameboard matrix.
     * @param gameBoardState
     *            The gameBoard
     */
    public static GameTile getGameboardState(final int x, final int y, final GameTile [][] gameBoardState){
        return gameBoardState[x][y];
    }
}
