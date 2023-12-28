package Ch2_ObserverPattern.weather;

import Ch2_ObserverPattern.weather.display.*;
import Ch2_ObserverPattern.weather.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        //왜 여기서는 DisplayElement라고 받지 않았을까?

        weatherData.setMeasurements(80, 65, 40.2f);
        weatherData.setMeasurements(70, 77, 33.3f);
        weatherData.setMeasurements(90, 33, 96.7f);
    }
}
