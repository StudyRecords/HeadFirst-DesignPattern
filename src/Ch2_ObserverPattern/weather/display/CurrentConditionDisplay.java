package Ch2_ObserverPattern.weather.display;

import Ch2_ObserverPattern.weather.subject.WeatherData;

public class CurrentConditionDisplay implements DisplayElement, Observer{

    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("현재 상태 : 온도 "+temperature+"F, 습도 "+humidity+"%");
    }

    //push
//    @Override
//    public void update(float temp, float humidity, float pressure) {
//        this.temperature = temp;
//        this.humidity = humidity;
//        display();
//    }

    //pull
    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
