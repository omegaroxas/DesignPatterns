package com.francisco.quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("...");
    }
}
