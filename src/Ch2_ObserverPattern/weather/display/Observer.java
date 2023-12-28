package Ch2_ObserverPattern.weather.display;

public interface Observer {
//    public void update(float temp, float humidity, float pressure);     //push
    public void update();       //pull
}
