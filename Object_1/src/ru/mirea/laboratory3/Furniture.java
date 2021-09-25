package ru.mirea.laboratory3;

public class Furniture {
    private int legcount;
    private double height;
    private double width;
    private double depth;
    private boolean mayseat;
    private int price;
    private String modelname;

    public Furniture(int legcount, double height, double width, double depth, boolean mayseat, int price, String modelname) {
        this.legcount = legcount;
        if(height <= 0)
            throw new IllegalArgumentException("Высота должна быть больше 0!");
        this.height = height;
        if(width <= 0)
            throw new IllegalArgumentException("Ширина должна быть больше 0!");
        this.width = width;
        if(depth <= 0)
            throw new IllegalArgumentException("Глубина должна быть больше 0!");
        this.depth = depth;
        this.mayseat = mayseat;
        this.price = price;
        this.modelname = modelname;
    }

    public String getModelName() {
        return modelname;
    }

    public void setModelName(String modelName) {
        this.modelname = modelname;
    }

    public void setHeight(int height) {
        if(height <= 0)
            throw new IllegalArgumentException("Высота должна быть больше 0!");
        this.height = height;
    }

    public void setWidth(int width) {
        if(width <= 0)
            throw new IllegalArgumentException("Ширина должна быть больше 0!");
        this.width = width;
    }

    public void setDepth(int depth) {
        if(depth <= 0)
            throw new IllegalArgumentException("Глубина должна быть больше 0!");
        this.depth = depth;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public int getLegCount() {
        return legcount;
    }

    public boolean isMaySeat() {
        return mayseat;
    }

    @Override
    public String toString() {
        return "modelName=" + modelname +
                ", legCount=" + legcount +
                ", height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                ", maySeat=" + mayseat +
                ", price=" + price;
        }
}
