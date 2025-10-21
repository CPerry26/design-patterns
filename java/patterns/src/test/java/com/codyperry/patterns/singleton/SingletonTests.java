package com.codyperry.patterns.singleton;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SingletonTests {
    @Test
    @Order(1)
    void testGettingInstance() {
        Singleton singleton = Singleton.getInstance();

        assertEquals(singleton != null, true);
    }

    @Test
    @Order(2)
    void testSameInstance() {
        Singleton singletonOne = Singleton.getInstance();
        Singleton singletonTwo = Singleton.getInstance();

        assertEquals(singletonOne != null, true);
        assertEquals(singletonTwo != null, true);
        assertEquals(singletonOne.equals(singletonTwo), true);
    }
}
