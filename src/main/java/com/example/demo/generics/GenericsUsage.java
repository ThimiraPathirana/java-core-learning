package com.example.demo.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsUsage {
    public static void main(String[] args) {
        Counter<Integer> iCounter = new Counter<>(50);
        iCounter.printCount();

        Counter<Double> dCounter = new Counter<>(50.0);
        dCounter.printCount();

        /**
         * Primitive data type can't use.Should be wrapper class
         */
//        Counter<int> intCounter = new Counter<>(50);
//        intCounter.printCount();

        /**
         * Not allow to user String because it contains boundary with Number class
         */
//        Counter<String> sCounter = new Counter<>("50");
//        sCounter.printCount();

        /**
         * Getting error because string can't cast to Integer.
         * So Proper type need to use store value
         */
//        ArrayList<Object> objects = new ArrayList<>();
//        objects.add(10);
//        objects.add("100");
//        Integer i = (Integer) objects.get(1);

        printValue(20);
        printValue("Sharuk");

        printValue("Sharuk age", 45);

        /**
         * Integer is subclass of Object but List<Object> is not subclass of List<Integer>
         */
        List<Integer> integerList = new ArrayList<>();
        integerList.add(30);
        printIValue( integerList);


    }

    /**
     * Need to define generics type before the return type when create method with generics param
     */
    private static <T> void printValue(T t) {
        System.out.println(t);
    }

    /**
     * Can pass more than one param
     */
    private static <T, D> void printValue(T t, D d) {
        System.out.println(t + ": " + d);
    }

    /**
     * Can use wildcard character
     */
//    private static void printIValue(List<Object> oList) {
//        System.out.println(oList);
//    }
    private static void printIValue(List<?> oList) {
        System.out.println(oList);
    }
}
