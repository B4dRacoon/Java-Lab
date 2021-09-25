package ru.mirea.laboratory3;

public class Bed extends Furniture {
    private int personcount, maxweight;
    private String mainmaterial, mattressmaterial;

    public Bed(String modelname, double height, double width, double depth, int price,
               int personcount, int maxweight, String mainmaterial, String mattressmaterial) {
        super(4, height, width, depth, true, price, modelname);
        if(personcount <= 0 || personcount >=3)
            throw new IllegalArgumentException("Невозможное число спальных мест для кровати: " + personcount);
        this.personcount = personcount;
        this.maxweight = maxweight;
        this.mainmaterial = mainmaterial;
        this.mattressmaterial = mattressmaterial;
    }

    public int getPersonCount() {
        return personcount;
    }

    public void setPersonCount(int personcount) {
        this.personcount = personcount;
    }

    public int getMaxWeight() {
        return maxweight;
    }

    public void setMaxWeight(int maxweight) {
        this.maxweight = maxweight;
    }

    public String getMainMaterial() {
        return mainmaterial;
    }

    public void setMainMaterial(String mainmaterial) {
        this.mainmaterial = mainmaterial;
    }

    public String getMattressMaterial() {
        return mattressmaterial;
    }

    public void setMattressMaterial(String mattressmaterial) {
        this.mattressmaterial = mattressmaterial;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "personCount=" + personcount +
                ", maxWeight=" + maxweight +
                ", mainMaterial='" + mainmaterial + '\'' +
                ", mattressMaterial='" + mattressmaterial + '\'' +
                ", " + super.toString() +
                '}';
    }
}
