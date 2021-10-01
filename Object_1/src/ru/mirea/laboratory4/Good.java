package ru.mirea.laboratory4;

public abstract class Good implements Priceable {
    private double price;

    public Good(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "price=" + price;
    }
}
