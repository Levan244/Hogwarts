package Hogwarts;

public class Hogwarts {
    public void compareGryffindor(Gryffindor first, Gryffindor second) {
        int fistPoints = first.getBravery() + first.getHonor() + first.getNobility();
        int secondPoints = second.getBravery() + second.getHonor() + second.getNobility();
        if (fistPoints > secondPoints) {
            System.out.println(first.getName() + " is better than - " + second.getName());
        } else if (fistPoints < secondPoints) {
            System.out.println(second.getName() + " is better than - " + first.getName());
        } else {
            System.out.println("They are both powerful");

        }

    }

    public void comperAnyStudent(HogwartsFaculties first, HogwartsFaculties second) {
        int fistPoints = first.getPowerMagic() + first.getTransgression();
        int secondPoints = second.getPowerMagic() + second.getTransgression();

        if (fistPoints > secondPoints) {
            System.out.println(first.getName() + " is better than - " + second.getName());
        } else if (fistPoints < secondPoints) {
            System.out.println(second.getName() + " is better than - " + first.getName());
        } else {
            System.out.println("They are both powerful");


        }
    }
}
