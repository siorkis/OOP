import lib.Monitor;
import lib.Student;
import lib.University;

public class Main {

    public static void compareMonitor(Monitor first, Monitor second){
        if (first.getColor().equals(second.getColor())) {
            System.out.print("The monitors have the same color, " +
                    "they are both " + first.getColor() + "\n\n");
        } else {
            System.out.print("The monitors have different colors\n" +
                    "The first one is " + first.getColor() + "\n" +
                    "The second one is " + second.getColor() + "\n\n");
        }

        if (first.getResolution().equals(second.getResolution())) {
            System.out.print("The monitors have the same resolution, " +
                    "their resolution is " + first.getResolution() + "\n\n");
        } else {
            System.out.print("The monitors have different resolutions\n" +
                    "The first one is " + first.getResolution() + "\n" +
                    "The second one is " + second.getResolution() + "\n\n");
        }

        if (first.getSize() == second.getSize()) {
            System.out.print("The monitors have the same size\n\n");
        } else if (first.getSize() > second.getSize()) {
            System.out.print("The first monitor is bigger\n\n");
        } else {
            System.out.print("The second monitor is bigger\n\n");
        }

    }

    public static void TestMonitor() {
        Monitor monitor1 = new Monitor();
        Monitor monitor2 = new Monitor();

        monitor1.setSize(25);
        monitor2.setSize(24);
        monitor1.setColor("Black");
        monitor2.setColor("Blue");
        monitor1.setResolution("HD");
        monitor2.setResolution("HD");

        compareMonitor(monitor1, monitor2);
    }

    public static void TestUniversity() {
        University asem = new University(
                "ASEM",
                1991);
        Student[] students = new Student[3];

        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();

        students[0].setName("Mark");
        students[1].setName("Bruce");
        students[2].setName("John");

        students[0].setAge(21);
        students[1].setAge(21);
        students[2].setAge(19);

        students[0].setMark(9);
        students[1].setMark(6);
        students[2].setMark(8);

        asem.addStudents(students[0], 0);
        asem.addStudents(students[1], 1);
        asem.addStudents(students[2], 2);
    }

    public static void massUniversityTest () {
        University utm = new University(
                "UTM",
                1964);
        University usm = new University(
                "USM",
                1946);
        University asem = new University(
                "ASEM",
                1991);

        Student[] students = new Student[9];

        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();
        students[3] = new Student();
        students[4] = new Student();
        students[5] = new Student();
        students[6] = new Student();
        students[7] = new Student();
        students[8] = new Student();

        students[0].setName("Mask");
        students[1].setName("Vong");
        students[2].setName("George");
        students[3].setName("John");
        students[4].setName("Van");
        students[5].setName("Nattaly");
        students[6].setName("Valea");
        students[7].setName("Sandra");
        students[8].setName("Alex");

        students[0].setAge(19);
        students[1].setAge(20);
        students[2].setAge(21);
        students[3].setAge(20);
        students[4].setAge(19);
        students[5].setAge(21);
        students[6].setAge(21);
        students[7].setAge(21);
        students[8].setAge(21);

        students[0].setMark(10);
        students[1].setMark(10);
        students[2].setMark(5);
        students[3].setMark(9);
        students[4].setMark(8);
        students[5].setMark(7);
        students[6].setMark(6);
        students[7].setMark(5);
        students[8].setMark(8);

        asem.addStudents(students[0], 0);
        asem.addStudents(students[1], 1);
        asem.addStudents(students[2], 2);
        usm.addStudents(students[3], 0);
        usm.addStudents(students[4], 1);
        usm.addStudents(students[5], 2);
        utm.addStudents(students[6], 0);
        utm.addStudents(students[7], 1);
        utm.addStudents(students[8], 2);

        System.out.println("UTM average mark is " + asem.getMark() + "\n");
        System.out.println("USM average mark is " + usm.getMark() + "\n");
        System.out.println("ASEM average mark is " + utm.getMark() + "\n");

    }

    public static void main(String []args) {
        TestMonitor();
        TestUniversity();
        massUniversityTest();
    }
}