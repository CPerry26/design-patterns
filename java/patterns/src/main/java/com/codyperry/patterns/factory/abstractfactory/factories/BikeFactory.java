package com.codyperry.patterns.factory.abstractfactory.factories;

import com.codyperry.patterns.factory.abstractfactory.AbstractVehicleFactory;
import com.codyperry.patterns.factory.abstractfactory.product.Bike;
import com.codyperry.patterns.factory.abstractfactory.product.Vehicle;

public class BikeFactory implements AbstractVehicleFactory {
    @Override
    public Vehicle makeVehicle() {
        return new Bike();
    }
}
