package ru.mirea.laboratory3;

public class Table extends Furniture {
    private String material;
    private int drawercount;

    public Table(String modelname, int legcount, double height, double width, double depth, int price, String material, int drawercount) {
        super(legcount, height, width, depth, false, price, modelname);
        this.material = material;
        this.drawercount = drawercount;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getDrawerCount() {
        return drawercount;
    }

    public void setDrawerCount(int drawerCount) {
        this.drawercount = drawerCount;
    }

    @Override
    public String toString() {
        return "Table(" +
                "material='" + material + '\'' +
                ", drawerCount=" + drawercount + ", " + super.toString() +
                ')';
    }
}
