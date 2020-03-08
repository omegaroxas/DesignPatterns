package com.francisco;

import com.francisco.fly.FlyWithWings;
import com.francisco.quack.Squeak;

public class RedDuck extends Duck{
    public RedDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a red duck");
    }
}
