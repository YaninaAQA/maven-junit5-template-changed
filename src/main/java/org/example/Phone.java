package org.example;

public class Phone {
    private double number;
    private String model;
    private double weight;


    public Phone(double number, String model) {
        this.number = number;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public double getNumber() {
        return number;
    }
}
