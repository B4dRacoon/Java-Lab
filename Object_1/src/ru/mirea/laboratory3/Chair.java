package ru.mirea.laboratory3;

public class Chair extends Furniture {

    private String backseatmaterial, mainmaterial;
    private boolean iscircle;

    public Chair(String modelname, double height, double width, double depth, String backseatmaterial, String mainmaterial, boolean iscircle, int price) {
        super(4, height, width, depth, true, price, modelname);
        this.backseatmaterial = backseatmaterial;
        this.mainmaterial = mainmaterial;
        this.iscircle = iscircle;
    }

    public String getBackseatMaterial() {
        return backseatmaterial;
    }

    public void setBackseatMaterial(String backseatmaterial) {
        this.backseatmaterial = backseatmaterial;
    }

    public String getMainMaterial() {
        return mainmaterial;
    }

    public void setMainMaterial(String mainmaterial) {
        this.mainmaterial = mainmaterial;
    }

    public boolean iscircle() {
        return iscircle;
    }

    public void setcircle(boolean circle) {
        iscircle = circle;
    }

    @Override
    public String toString() {
        return "Chair(" +
                "backseatMaterial='" + backseatmaterial + '\'' +
                ", mainMaterial='" + mainmaterial + '\'' +
                ", isCircle=" + iscircle +
                ", " + super.toString() +
                ')';
    }
}
