package com.codyperry.patterns.factory.abstractfactory.factories;

import com.codyperry.patterns.factory.abstractfactory.AbstractVehicleFactory;
import com.codyperry.patterns.factory.abstractfactory.product.Trailer;
import com.codyperry.patterns.factory.abstractfactory.product.Vehicle;

public class TrailerFactory implements AbstractVehicleFactory {
    @Override
    public Vehicle makeVehicle() {
        return new Trailer();
    }
}
