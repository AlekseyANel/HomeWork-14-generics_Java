package com.alevel;

public class Pie extends Bakery {
    private  String name;

    public Pie(String name) {
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
