package com.francisco.Displays;

import com.francisco.Data.Subject;

public class StaticsDisplay implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StaticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display(){
        String str = String.format("Statics temperature = %f", temp);
        System.out.println(str);
    }
}
