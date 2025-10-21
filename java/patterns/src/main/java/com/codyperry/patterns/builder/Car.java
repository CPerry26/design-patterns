package com.codyperry.patterns.builder;

public record Car(String make, String model, String color, int year) {
    private Car(CarBuilder builder) {
        this(builder.make, builder.model, builder.color, builder.year);
    }

    public static class CarBuilder {
        private String make;
        private String model;
        private String color;
        private int year;

        public CarBuilder() {}

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder year(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder make(String make) {
            this.make = make;
            return this;
        }

        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
