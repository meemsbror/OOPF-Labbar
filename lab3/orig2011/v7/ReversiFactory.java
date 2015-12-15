package orig2011.v7;


/**
 * Factory class for available games.
 */
public class ReversiFactory implements IGameFactory {
	ReversiScoreView scoreView;
	/**
	 * Returns an array with names of games this factory can create. Used by GUI
	 * list availible games.
	 */
	@Override
	public String[] getGameNames() {
		return new String[] { "Gold", "Reversi"};
	}

	/**
	 * Returns a new model object for the game corresponding to its Name.
	 * 
	 * @param gameName
	 *            The name of the game as given by getGameNames()
	 * @throws IllegalArgumentException
	 *             if no such game
	 */
	@Override
	public GameModel createGame(final String gameName) {
		if (gameName.equals("Gold")) {
			return new GoldModel();
		}
		if (gameName.equals("Reversi")) {
			ReversiModel m = new ReversiModel();
			scoreView = new ReversiScoreView();
            m.addObserver(scoreView);
			return m;
		}

		throw new IllegalArgumentException("No such game: " + gameName);
	}
}
