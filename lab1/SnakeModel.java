package lab1;

import javax.sound.sampled.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
* Classic Snake Game, when you eat a coin you get bigger, if you hit the edge or eat yourself you loose.
*/
public class SnakeModel extends GameModel {
	public enum Directions {
		EAST(1, 0),
		WEST(-1, 0),
		NORTH(0, -1),
		SOUTH(0, 1),
		NONE(0, 0);

		private final int xDelta;
		private final int yDelta;

		Directions(final int xDelta, final int yDelta) {
			this.xDelta = xDelta;
			this.yDelta = yDelta;
		}

		public int getXDelta() {
			return this.xDelta;
		}

		public int getYDelta() {
			return this.yDelta;
		}
	}

	/*
	 * The following GameTile objects are used only
	 * to describe how to paint the specified item.
	 * 
	 * This means that they should only be used in
	 * conjunction with the get/setGameboardState()
	 * methods.
	 */

	/** Graphical representation of a coin. */
	private static final GameTile COIN_TILE = new RoundTile(new Color(255, 215,
			0),
			new Color(255, 255, 0), 2.0);

	/** Graphical representation of the snakes body */
	private static final GameTile BODY_TILE = new RectangularTile(Color.BLACK);


	/** Graphical representation of the snakes head */
	private static final GameTile HEAD_TILE = new RectangularTile(Color.RED);


	/** Graphical representation of a blank tile. */
	private static final GameTile BLANK_TILE = new GameTile();

	/** . */
	private final ArrayDeque<Position> snakePos = new ArrayDeque<>(100);

	/** The position of the collector. */
	private Position coinPosition;

	/** The direction of the collector. */
	private Directions direction = Directions.NORTH;

	/** The number of coins found. */
	private int score;

	private boolean truckMode; //TODO

	private boolean isReversing;

	/**
	 * Create a new model for the gold game.
	 */
	public SnakeModel() {
		Dimension size = getGameboardSize();

		truckMode = true; //TODO

		playSound();

		// Blank out the whole gameboard
		for (int i = 0; i < size.width; i++) {
			for (int j = 0; j < size.height; j++) {
				setGameboardState(i, j, BLANK_TILE);
			}
		}

		// Insert the collector in the middle of the gameboard.
		this.snakePos.add(new Position(size.width / 2, size.height / 2));
		setGameboardState(this.snakePos.peek(), HEAD_TILE);

		// Insert a coin into the gameboard.
		addCoin();
	}



	public static void playSound() {

		try {
			File yourFile;
			AudioInputStream stream;
			AudioFormat format;
			DataLine.Info info;
			Clip clip;

			stream = AudioSystem.getAudioInputStream(new File("/home/john/Desktop/ding.wav"));
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.loop(10);
		}
		catch (Exception e) {
			//whatevers
		}

	}




	/**
	 * Insert another coin into the gameboard.
	 */
	private void addCoin() {
		Position newCoinPos;
		Dimension size = getGameboardSize();
		// Loop until a blank position is found and ...
		do {
			newCoinPos = new Position((int) (Math.random() * size.width),
					(int) (Math.random() * size.height));
		} while (!isPositionEmpty(newCoinPos));

		// ... add a new coin to the empty tile.
		setGameboardState(newCoinPos, COIN_TILE);
		coinPosition = newCoinPos;
	}

	/**
	 * Return whether the specified position is empty.
	 *
	 * @param pos
	 *            The position to test.
	 * @return true if position is empty.
	 */
	private boolean isPositionEmpty(final Position pos) {
		return (getGameboardState(pos) == BLANK_TILE);
	}

	/**
	 * Update the direction of the collector
	 * according to the user's keypress.
	 */
	private void updateDirection(final int key) {
		switch (key) {
			case KeyEvent.VK_LEFT:
				if (direction != Directions.EAST || this.snakePos.size() == 1) {
					this.direction = Directions.WEST;
				}
				break;
			case KeyEvent.VK_UP:
				if (direction != Directions.SOUTH || this.snakePos.size() == 1) {
					this.direction = Directions.NORTH;
				}
				break;
			case KeyEvent.VK_RIGHT:
				if (direction != Directions.WEST || this.snakePos.size() == 1) {
					this.direction = Directions.EAST;
				}
				break;
			case KeyEvent.VK_DOWN:
				if (direction != Directions.NORTH || this.snakePos.size() == 1) {
					this.direction = Directions.SOUTH;
				}
				break;
			default:
				// Don't change direction if another key is pressed
				break;
		}
	}

	/**
	 * Get next position of the collector.
	 */
	private Position getNextCollectorPos() {
		return new Position(
				this.snakePos.peekLast().getX() + this.direction.getXDelta(),
				this.snakePos.peekLast().getY() + this.direction.getYDelta());
	}

	/**
	 * This method is called repeatedly so that the
	 * game can update its state.
	 *
	 * @param lastKey
	 *            The most recent keystroke.
	 */
	@Override
	public void gameUpdate(final int lastKey) throws GameOverException {
		updateDirection(lastKey);

		setGameboardState(this.snakePos.peekLast(), BODY_TILE);

		if (this.snakePos.contains(getNextCollectorPos())) {
			throw new GameOverException(this.score);
		}

		this.snakePos.add(getNextCollectorPos());


		if (isOutOfBounds(this.snakePos.peekLast())) {
			throw new GameOverException(this.score);
		}
		// Draw collector at new position.


		// Remove the coin at the new collector position (if any)
		if (this.coinPosition.equals(this.snakePos.peekLast())) {
			this.score++;
			addCoin();
		} else {
			setGameboardState(this.snakePos.remove(), BLANK_TILE);
		}

		setGameboardState(this.snakePos.peekLast(), HEAD_TILE);

	}

	/**
	 *
	 * @param pos The position to test.
	 * @return <code>false</code> if the position is outside the playing field, <code>true</code> otherwise.
	 */
	private boolean isOutOfBounds(Position pos) {
		return pos.getX() < 0 || pos.getX() >= getGameboardSize().width
				|| pos.getY() < 0 || pos.getY() >= getGameboardSize().height;
	}

}
