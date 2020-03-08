package com.francisco;

import com.francisco.Data.Subject;
import com.francisco.Data.WeatherData;
import com.francisco.Displays.CurrentConditionsDisplay;
import com.francisco.Displays.ForecastDisplay;
import com.francisco.Displays.Observer;
import com.francisco.Displays.StaticsDisplay;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionDisplay = new CurrentConditionsDisplay(weatherData);
        StaticsDisplay staticsDisplay = new StaticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(10,20,30);
        weatherData.setMeasurements(100,200,300);
        weatherData.setMeasurements(1000,2000,3000);
    }
}
