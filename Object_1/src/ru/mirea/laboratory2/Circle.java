package ru.mirea.laboratory2;

public class Circle {
    private double x;
    private double y;
    private double r;

    public Circle (double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
    @Override
    public String toString(){
        String xs = Double.toString(x);
        String ys = Double.toString(y);
        String rs = Double.toString(r);
        return "Окружность с центром в точке " + xs + " " + ys + " и радиусом " + rs;
    }


    public void SetCoordinats (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void SetRadius (double r) {
        this.r = r;
    }


}
