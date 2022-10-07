package com.activity.comparable;

import java.util.*;

public class FruitDriver {

    public static void main(String[] args) {
        String a = "Apple";
        Fruit apple = new Fruit(a, 100);
        Fruit orange = new Fruit("Orange", 50);
        Fruit banana = new Fruit("Banana", 50);
        Fruit peach = new Fruit("Peach", 200);
        Fruit apple2 = new Fruit(a, 125);
        Fruit tangerine = new Fruit("Tangerine", 50);
        Fruit apple3 = new Fruit(a, 300);

        List<Fruit> fruits = new ArrayList<>();
            fruits.add(apple);
            fruits.add(orange);
            fruits.add(banana);
            fruits.add(peach);
            fruits.add(apple2);
            fruits.add(tangerine);
            fruits.add(apple3);

            fruits.forEach(System.out::println);

        System.out.println();

        Collections.sort(fruits);

        fruits.forEach(System.out::println);
    }
}
