package com.aminals;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bear bear = new Bear("Baloo");
        String name = bear.getName();
        System.out.println(name);

        bear.setName("Baloo of the Jungle");
        System.out.println(bear.getName());

        bear.name = "Clawinator";
        System.out.println(bear.name);

    }
}