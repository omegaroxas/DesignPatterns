package com.francisco;

import com.francisco.fly.FlyNoWay;

public class Main {

    public static void main(String[] args) {
	    Duck patoRojo = new RedDuck();
	    patoRojo.performFly();
	    patoRojo.performQuack();
	    patoRojo.setFlyBehavior(new FlyNoWay());
		patoRojo.performFly();
    }
}
