package orig2011.v7;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ReversiScoreView implements PropertyChangeListener {

    public void propertyChange(PropertyChangeEvent evt){
        if(evt.getPropertyName().equals("score") && evt.getSource().getClass() == ReversiModel.class){
            ReversiModel model = (ReversiModel) evt.getSource();
            System.out.println("Bong! White: " + model.getWhiteScore()
                    + "\tBlack: " + model.getBlackScore()
                    + "\tnext turn:" + model.getTurnColor());
        }

    }
}
