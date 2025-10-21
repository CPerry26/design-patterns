package com.codyperry.patterns.builder;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BuilderTests {
    @Test
    @Order(1)
    void testSettingAllProperties() {
        Car.CarBuilder builder = new Car.CarBuilder();
        builder.make("Chevy");
        builder.model("Camaro");
        builder.color("Black");
        builder.year(1967);
        Car builtCar = builder.build();

        assertEquals(builtCar != null, true);
        assertEquals(builtCar.make(), "Chevy");
        assertEquals(builtCar.model(), "Camaro");
        assertEquals(builtCar.color(), "Black");
        assertEquals(builtCar.year(), 1967);
    }

    @Test
    @Order(2)
    void testSettingSomeProperties() {
        Car.CarBuilder builder = new Car.CarBuilder();
        builder.make("Chevy");
        builder.model("Camaro");
        Car builtCar = builder.build();

        assertEquals(builtCar != null, true);
        assertEquals(builtCar.make(), "Chevy");
        assertEquals(builtCar.model(), "Camaro");
        assertEquals(builtCar.color(), null);
    }
}
