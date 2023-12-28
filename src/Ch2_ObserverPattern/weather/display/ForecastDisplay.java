package Ch2_ObserverPattern.weather.display;

import Ch2_ObserverPattern.weather.subject.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement{

    private float currentPressure = 29.92F;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        if (lastPressure < currentPressure){
            System.out.println("기상 예보 : 날씨가 좋아지고 있습니다!\n");
            return;
        }
        if (lastPressure > currentPressure){
            System.out.println("기상 예보 : 쌀쌀하며 비가 올 것 같습니다.\n");
            return;
        }
        System.out.println("기상 예보 : 지금과 비슷할 것 같습니다.\n");
    }

    //push
//    @Override
//    public void update(float temp, float humidity, float pressure) {
//        lastPressure = currentPressure;
//        currentPressure = pressure;
//
//        display();
//    }

    //pull
    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();

        display();
    }
}
