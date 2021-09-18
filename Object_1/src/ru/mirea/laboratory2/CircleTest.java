package ru.mirea.laboratory2;

import java.util.Arrays;

public class CircleTest {
    public static void main(String[] args) {
        Circle o1 = new Circle(10, 10, 5);
        System.out.println(o1);
        o1.SetCoordinats(20, 30);
        o1.SetRadius(15);
        System.out.println(o1);
    }
}
