package com.francisco.Data;

import com.francisco.Displays.Observer;

public interface Subject {
    public void registerObserver(Observer O);
    public void removeObserver(Observer O);
    public void notifyObservers();
}
