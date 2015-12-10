package orig2011.v4;


import java.beans.PropertyChangeListener;

public interface IObservable {

	/**
	 * Add an observer to the model.
	 * @param observer the observing viewer
	 */
	void addObserver(PropertyChangeListener observer);

	/**
	 * Add an observer to the model.
	 * @param observer the observing viewer
	 */
	void removeObserver(PropertyChangeListener observer);

}
