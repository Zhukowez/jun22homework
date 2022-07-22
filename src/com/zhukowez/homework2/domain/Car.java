package com.zhukowez.homework2.domain;

import com.zhukowez.homework2.service.CarActionInterface;

import java.util.Objects;

public class Car implements CarActionInterface, Comparable<Car> {

    private String brand;
    private String model;
    private int doors;
    private int wheels;
    private double engineVolume;
    private String transmissionType;
    private String vinCode;


    public Car() {
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, int doors, int wheels, double engineVolume, String transmissionType, String vinCode) {
        this.brand = brand;
        this.model = model;
        this.doors = doors;
        this.wheels = wheels;
        this.engineVolume = engineVolume;
        this.transmissionType = transmissionType;
        this.vinCode = vinCode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getVinCode() {
        return vinCode;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return doors == car.doors && wheels == car.wheels && Double.compare(car.engineVolume, engineVolume) == 0 && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(transmissionType, car.transmissionType) && Objects.equals(vinCode, car.vinCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, doors, wheels, engineVolume, transmissionType, vinCode);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", doors=" + doors +
                ", wheels=" + wheels +
                ", engineVolume=" + engineVolume +
                ", transmissionType='" + transmissionType + '\'' +
                ", vinCode='" + vinCode + '\'' +
                '}';
    }


    @Override
    public void run() {
        System.out.println(this.brand + " " + this.model + " " + CAR_ACTION_RUN);
    }

    @Override
    public int move() {
        System.out.println(this.brand + " " + this.model + " drive " + CAR_ACTION_MOVE + " meters");
        return 0;
    }

    public int move(int distance) {
        System.out.println(this.brand + " " + this.model + " drive " + (distance * CAR_ACTION_MOVE) + " meters");
        return 0;
    }

    @Override
    public int compareTo(Car o) {
        return Double.compare(this.getEngineVolume(), o.getEngineVolume());
    }

}
