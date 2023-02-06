package org.planet;

public class Planet {
    private String name;
    private double size;

    public Planet(String name, double size){
        this.name = name;
        this.size = size;
    }

    public String getName(){
        return this.name;
    }

    public double getSize(){
        return this.size;
    }

    public void explode(){
        System.out.println(this.name + " has exploded...shame.");
    }

}
