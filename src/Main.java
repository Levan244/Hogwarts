import Hogwarts.Gryffindor;
import Hogwarts.Hogwarts;
import Hogwarts.HogwartsFaculties;
import Hogwarts.HogwartsStudent;
import Hogwarts.Blyherin;


public class Main {
    public static void main(String[] args) {
        Gryffindor[] students = {
                new Gryffindor("Harry Potter", 95, 90, 100, 90, 100),
                new Gryffindor("Hermione Granger", 95, 90, 100, 90, 100),

        };
        HogwartsStudent printer = new HogwartsStudent();
        for (HogwartsFaculties student : students) {
            printer.print(student);

        }
        Hogwarts hogwarts = new Hogwarts();
        hogwarts.compareGryffindor(students[0], students[1]);


        Blyherin[] study = {
                new Blyherin("Draco Malfoy", 90, 100, 95, 95, 95, 80, 85),
                new Blyherin("Gregory Goyle", 75, 95, 75, 65, 100, 85, 100)
        };
        HogwartsStudent print = new HogwartsStudent();
        for (HogwartsFaculties studes : study) {
            print.println(studes);

        }
        Hogwarts hogwarts1= new Hogwarts();
        hogwarts1.comperAnyStudent(study[0], study[1]);

    }


}
