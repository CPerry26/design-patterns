package com.codyperry.patterns.singleton;

public class Singleton {
    private Singleton() {}

    private static final class InstanceHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
