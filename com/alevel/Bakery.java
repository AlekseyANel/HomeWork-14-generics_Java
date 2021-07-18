package com.alevel;

public class Bakery extends Food {
    private String name;
    public Bakery(String name) {
        super(name);
        this.name=name;
    }

    public String getName() {
        return name;
    }

}
