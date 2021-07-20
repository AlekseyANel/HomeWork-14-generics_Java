package com.alevel;

public class Packer {

    public static void main(String[] args) {
        //Packer packer = new Packer();
        Box<Food> foodBox = new Box<>(new Food("Chicken"));
        Box<Cake> cakeBox = new Box<>(new Cake("BigCake"));
        System.out.println("Food и Cake");
        print("Содержимое коробоки foodBox: ", foodBox.getItem());
        print("Содержимое коробоки cakeBox: ", cakeBox.getItem());
        repackage(foodBox, cakeBox);
        System.out.println("После repackage/перепаковки");
        print("Содержимое коробоки foodBox: ", foodBox.getItem());
        print("Содержимое коробоки cakeBox: ", cakeBox.getItem());

        //наоборот
       /* System.out.println("Cake и Food");
        Box<Cake> cakeBox2 = new Box<>(new Cake("BigCake2"));
        Box<Food> foodBox2 = new Box<>(new Food("Chicken2"));
        print("Содержимое коробоки cakeBox2: ", cakeBox2.getItem());
        print("Содержимое коробоки foodBox2: ", foodBox2.getItem());
        repackage(cakeBox2, foodBox2);
        System.out.println("После repackage/перепаковки");
        print("Содержимое коробоки cakeBox2: ", cakeBox2.getItem());
        print("Содержимое коробоки foodBox2: ", foodBox2.getItem());*/

    }
    public static <T extends Bakery> void repackage
            (Box<? super T> to, Box<? extends T> from) {
        to.setItem(from.getItem());
        from.getItem();
    }
    public static  <T extends Food> void print(String S, T t) {
        System.out.println(S+t.getName());
    }

}


