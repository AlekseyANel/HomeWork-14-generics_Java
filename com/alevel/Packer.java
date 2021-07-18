package com.alevel;

public class Packer {

    public static void main(String[] args) {
        Packer packer = new Packer();
        Box<Food> foodBox = new Box<>(new Food("Chicken"));
        Box<Cake> cakeBox = new Box<>(new Cake("BigCake"));
        printFood(foodBox.getItem());
        printFood(cakeBox.getItem());

        repackage(foodBox, cakeBox);

        print(packer);
    }

    public static <T extends Bakery> void repackage
            (Box<? super T> to, Box<? extends T> from) {
        to.setItem();
        from.getItem();
    }
    public static  <T extends Food> void printFood(T t) {
        System.out.println(t.getName());
    }
    public static <T extends Packer> void print(T t) {
        System.out.println(t);
    }

}


