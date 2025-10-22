package com.codyperry.patterns.factory.abstractfactory.product;

public class Bike implements Vehicle {
    @Override
    public int getWheels() {
        return 2;
    }
}
