package ru.mirea.practice3;

public class Circle extends Shape {
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }


    public void Area(){
        double s = Math.PI * (radius * radius);
        String sts = Double.toString(s);
        System.out.println("Площадь круга равна: " + sts);
    }
}
