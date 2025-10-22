package com.codyperry.patterns.factory.abstractfactory;

import com.codyperry.patterns.factory.abstractfactory.factories.BikeFactory;
import com.codyperry.patterns.factory.abstractfactory.factories.CarFactory;
import com.codyperry.patterns.factory.abstractfactory.factories.TrailerFactory;
import com.codyperry.patterns.factory.abstractfactory.product.Bike;
import com.codyperry.patterns.factory.abstractfactory.product.Car;
import com.codyperry.patterns.factory.abstractfactory.product.Trailer;
import com.codyperry.patterns.factory.abstractfactory.product.Vehicle;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AbstractFactoryTests {
    @Test
    @Order(1)
    void testBikeFactory() {
        Client client = new Client(new BikeFactory());
        Vehicle createdVehicle = client.constructVehicle();

        assertEquals(createdVehicle instanceof Bike, true);

        Bike bike = (Bike) createdVehicle;
        assertEquals(bike.getWheels(), 2);
    }

    @Test
    @Order(2)
    void testCarFactory() {
        Client client = new Client(new CarFactory());
        Vehicle createdVehicle = client.constructVehicle();

        assertEquals(createdVehicle instanceof Car, true);

        Car car = (Car) createdVehicle;
        assertEquals(car.getWheels(), 4);
    }

    @Test
    @Order(3)
    void testTrailerFactory() {
        Client client = new Client(new TrailerFactory());
        Vehicle createdVehicle = client.constructVehicle();

        assertEquals(createdVehicle instanceof Trailer, true);

        Trailer trailer = (Trailer) createdVehicle;
        assertEquals(trailer.getWheels(), 18);
    }
}
