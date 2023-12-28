package Ch2_ObserverPattern.weather.subject;


import Ch2_ObserverPattern.weather.display.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
