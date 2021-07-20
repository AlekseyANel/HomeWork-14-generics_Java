package com.alevel;

//этот класс - обёртка над нашим itemom
public class Box<T extends Food> {//класс Box работает с  классом
    //Goods и его подклассами.
    private T item;

    public Box(T item) {
        this.item=item;
    }

    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return this.item;
    }

}
