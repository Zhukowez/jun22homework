package com.zhukowez.homework2.util;

import com.zhukowez.homework2.domain.Car;
import com.zhukowez.homework2.service.CarBrandInterface;
import com.zhukowez.homework2.service.CarModelInterface;
import com.zhukowez.homework2.service.CarTransmissionTypeInterface;
import com.zhukowez.homework2.service.EngineVolumeInterface;

import java.util.Random;


public class GenerateCarUtil implements CarBrandInterface, CarModelInterface, CarTransmissionTypeInterface, EngineVolumeInterface {

    public static Car[] arraysCar;
    private static final Random random = new Random();

    //minDoors - this minimum number doors in car
    public static final int MIN_DOORS = 2;
    //maxDoors - this maximum number doors in car
    public static final int MAX_DOORS = 6;
    //minWheels - this minimum number wheels in car
    public static final int MIN_WHEELS = 3;
    //maxWheels - this maximum number wheels in car
    public static final int MAX_WHEELS = 6;

    public static void generateCare(int numberCarsGenerate) {
        arraysCar = new Car[numberCarsGenerate];

        for (int i = 0; i < numberCarsGenerate; i++) {
            String brand = CarBrandInterface.CAR_BRAND[random.nextInt(CAR_BRAND.length)];
            String model = CarModelInterface.CAR_MODEL[random.nextInt(CAR_MODEL.length)];
            int doors = numberGeneratedMinMax(MIN_DOORS, MAX_DOORS);
            int wheels = numberGeneratedMinMax(MIN_WHEELS, MAX_WHEELS);
            double engineVolume = EngineVolumeInterface.CAR_ENGINE_VOLUME[random.nextInt(CAR_ENGINE_VOLUME.length)];
            String transmissionType = CarTransmissionTypeInterface.CAR_TRANSMISSION_TYPE[random.nextInt(CAR_TRANSMISSION_TYPE.length)];
            String vinCode = generateVinCode(brand.hashCode(), model.hashCode());

            Car car = new Car(brand, model, doors, wheels, engineVolume, transmissionType, vinCode);
            arraysCar[i] = car;
        }
    }

    private static int numberGeneratedMinMax(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    private static String generateVinCode(int brandHashCode, int modelHashcode) {
        return "" + (brandHashCode * 31 + modelHashcode * 31);
    }

}
