package ch2_ObserverPattern.weather.display;

import ch2_ObserverPattern.weather.subject.WeatherData;

public class StatisticsDisplay implements DisplayElement, Observer{

    private float minTemp = 200;
    private float maxTemp = 0;
    private float avgTemp = 0;
    private float tempNum = 0.0F;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("통계 : 최저 온도 "+minTemp+"F, 최고 온도 "+maxTemp+"F, 평균 온도 "+avgTemp+"F");
    }

    //push
//    @Override
//    public void update(float temp, float humidity, float pressure) {
//        avgTemp *= tempNum;
//        tempNum++;
//        avgTemp = (avgTemp+temp)/tempNum;
//        if (temp > maxTemp){
//            maxTemp = temp;
//        }
//        if (temp < minTemp){
//            minTemp = temp;
//        }
//        display();
//    }

    //pull
    @Override
    public void update() {

        float temp = weatherData.getTemperature();

        avgTemp *= tempNum;
        tempNum++;
        avgTemp = (avgTemp+temp)/tempNum;
        if (temp > maxTemp){
            maxTemp = temp;
        }
        if (temp < minTemp){
            minTemp = temp;
        }
        display();
    }
}
