package com.alevel;

public class Tart extends Bakery {
    private  String name;

    public Tart(String name) {
        super(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name;
    }
}
