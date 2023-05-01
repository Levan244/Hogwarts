package Hogwarts;

public class Blyherin extends HogwartsFaculties {
    private int sly;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int power;


    public Blyherin(String name, int powerMagic, int transgression,int sly,int determination,int ambition,int resourcefulness,int power) {
        super(name, powerMagic, transgression);
        this.sly = sly;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;

    }

    public int getSly() {
        return sly;
    }

    public void setSly(int sly) {
        this.sly = sly;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Blyherin{" + super.toString()  + "sly=" + sly + ", determination=" + determination + ", ambition=" + ambition + ", resourcefulness=" + resourcefulness + ", power=" + power + '}';
    }
}
