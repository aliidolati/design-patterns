package org.example.creational.builder;

public class Builder {
    public static void main(String[] args){
        Car car = new Car.CarBuilder()
                .setBrand("benz")
                .setColor("black")
                .setYear(1999)
                .setModel("S500")
                .build() ;
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Color: " + car.getColor());
    }
}
