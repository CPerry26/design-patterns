package com.codyperry.patterns.factory.abstractfactory;

import com.codyperry.patterns.factory.abstractfactory.product.Vehicle;

public class Client {
    AbstractVehicleFactory factory;

    public Client(AbstractVehicleFactory factory) {
        this.factory = factory;
    }

    public Vehicle constructVehicle() {
        return this.factory.makeVehicle();
    }
}
