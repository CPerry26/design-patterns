package com.codyperry.patterns.factory.abstractfactory.factories;

import com.codyperry.patterns.factory.abstractfactory.AbstractVehicleFactory;
import com.codyperry.patterns.factory.abstractfactory.product.Car;
import com.codyperry.patterns.factory.abstractfactory.product.Vehicle;

public class CarFactory implements AbstractVehicleFactory {
    @Override
    public Vehicle makeVehicle() {
        return new Car();
    }
}
