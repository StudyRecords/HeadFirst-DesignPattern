package ch2_ObserverPattern.propertyChangeListener;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class NewConcreteSubject {
    private String message;
    private PropertyChangeSupport support;

    public NewConcreteSubject() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener p){
        support.addPropertyChangeListener(p);
    }

    public void removePropertyChangeListener(PropertyChangeListener p){
        support.removePropertyChangeListener(p);
    }

    public void updateChange(String value){
        support.firePropertyChange("message", this.message, value);
        this.message = value;
    }
}
