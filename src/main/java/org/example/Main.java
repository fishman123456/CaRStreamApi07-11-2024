package org.example;

import org.example.Car.Car;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Car> carList = new ArrayList<>();
        carList.add( new Car("Mazda",300_000.7,147));
        carList.add( new Car("Toyota",600_000.8,120));
        carList.add( new Car("Niva",800_000.4,67));
        carList.add( new Car("UAZ",1_500_000.2,150));

        System.out.println(carList.toString());
    }
}