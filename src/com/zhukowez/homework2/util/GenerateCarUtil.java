package com.zhukowez.homework2.util;

import com.zhukowez.homework2.Car;
import com.zhukowez.homework2.servis.CarBrandInterface;
import com.zhukowez.homework2.servis.CarModelInterface;
import com.zhukowez.homework2.servis.CarTransmissionTypeInterface;
import com.zhukowez.homework2.servis.EngineVolumeInterface;

import java.util.Random;


public class GenerateCarUtil implements CarBrandInterface, CarModelInterface, CarTransmissionTypeInterface, EngineVolumeInterface {

    public static Car[] arraysCar;
    private static final Random random = new Random();

    public static void generateCare(int numberCarsGenerate) {
        arraysCar = new Car[numberCarsGenerate];
        //minDoors - this minimum number doors in car
        int minDoors = 2;
        //maxDoors - this maximum number doors in car
        int maxDoors = 6;
        //minWheels - this minimum number wheels in car
        int minWheels = 3;
        //maxWheels - this maximum number wheels in car
        int maxWheels = 6;

        for (int i = 0; i < numberCarsGenerate; i++) {
            String brand = CarBrandInterface.carBrand[random.nextInt(carBrand.length)];
            String model = CarModelInterface.carModel[random.nextInt(carModel.length)];
            int doors = random.nextInt(maxDoors - minDoors) + minDoors;
            int wheels = random.nextInt(maxWheels - minWheels) + minWheels;
            double engineVolume = EngineVolumeInterface.carEngineVolume[random.nextInt(carEngineVolume.length)];
            String transmissionType = CarTransmissionTypeInterface.carTransmissionType[random.nextInt(carTransmissionType.length)];
            String vinCode = "" + (brand.hashCode() * 31 + model.hashCode() * 31);

            Car car = new Car(brand, model, doors, wheels, engineVolume, transmissionType, vinCode);
            arraysCar[i] = car;
        }
    }
}
