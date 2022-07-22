package com.zhukowez.homework2;

import com.zhukowez.homework2.domain.Car;
import com.zhukowez.homework2.util.GenerateCarUtil;

import java.util.Arrays;
import java.util.Scanner;

import static com.zhukowez.homework2.util.GenerateCarUtil.arraysCar;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number Cars for generate");
        int countCarGenerate = scanner.nextInt();

        //Generates an array of Cars
        GenerateCarUtil.generateCare(countCarGenerate);

        //Sorts an array of Cars by Engine Volume
        Arrays.sort(arraysCar);

        //Displays array of Cars
        for (Car car : arraysCar) {
            System.out.println(car);
        }

        arraysCar[0].run();
        arraysCar[1].move();
        arraysCar[2].move(1500);

    }

}
