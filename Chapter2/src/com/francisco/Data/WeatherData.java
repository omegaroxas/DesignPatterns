package com.francisco.Data;

import java.util.ArrayList;
import com.francisco.Displays.Observer;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    public void registerObserver(Observer o){
        this.observers.add(o);
    }
    public void removeObserver(Observer o){
        this.observers.remove(o);
    }
    public void notifyObservers(){
        for(Observer o : observers){
            o.update(this.temp,this.humidity,this.pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
