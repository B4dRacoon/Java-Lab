package ru.mirea.laboratory4;

public class Printer extends Good{
    private int dpi;
    private String color;

    public Printer(double price, int dpi, String color) {
        super(price);
        this.dpi = dpi;
        this.color = color;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Printer{" +
                "dpi=" + dpi +
                ", color='" + color + '\'' + ", " + super.toString() +
                '}';
    }
}