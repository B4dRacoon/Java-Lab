package ru.mirea.practice16.menu;

public class Drink extends MenuItem implements Alcoholable{

    private double alcoholVol;
    private DrinkTypeEnum type;

    public Drink(String name, String description, double cost, double alcoholVol, DrinkTypeEnum type) {
        super(name, description, cost);
        this.alcoholVol = alcoholVol;
        this.type = type;
    }

    public DrinkTypeEnum getType() {
        return type;
    }

    public boolean isAlcoholDrink() {
        return Double.compare(alcoholVol, 0) > 0;
    }

    public double getAlcoholVol() {
        return alcoholVol;
    }

    public boolean equals(Object obj) {
        return super.equals(obj) && obj instanceof Drink && type == ((Drink) obj).type && alcoholVol == ((Drink) obj).alcoholVol;
    }
}