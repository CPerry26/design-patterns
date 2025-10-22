package com.codyperry.patterns.factory.abstractfactory.product;

public class Car implements Vehicle {
    @Override
    public int getWheels() {
        return 4;
    }
}
