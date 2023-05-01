package Hogwarts;

public class Gryffindor extends HogwartsFaculties {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerMagic, int transgression, int bravery, int honor, int nobility) {
        super(name, powerMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{"+ super.toString() + " nobility=" + nobility + ", honor=" + honor + ", bravery=" + bravery + '}';
    }
}
