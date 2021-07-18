package com.alevel;

public class Cake extends Bakery {
    private  String name;

    public Cake(String name) {
        super(name);
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name;
    }
}
