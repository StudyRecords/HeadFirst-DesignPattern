package Ch2_ObserverPattern.propertyChangeListener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class NewConcreteObserver implements PropertyChangeListener {

    private String messeage;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        setMesseage((String) evt.getNewValue());
    }

    public String getMesseage(){
        return messeage;
    }

    public void setMesseage(String messeage){
        this.messeage = messeage;
    }
}

