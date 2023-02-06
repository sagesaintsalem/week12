package org.planet;

public class Main {
    public static void main(String[] args) {

        Planet planet = new Planet("Persephone", 3456.789);
        String name = planet.getName();
        double size = planet.getSize();
        System.out.println(name);
        System.out.println(size);

//        planet.setName("Cassandra");
//        System.out.println(planet.getName());

        Planet tinyPlanet = new Planet("Circillian", 333.333);
        System.out.println(tinyPlanet.getName() + " is " + tinyPlanet.getSize() + " km in diameter.");

        tinyPlanet.explode();
    }
}