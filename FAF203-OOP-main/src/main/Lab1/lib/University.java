package lib;
import lib.Student;

public class University {
    String universityName;
    int foundationYear;
    float overallMark;
    Student[] studentList = new Student[3];

    public University(String name, int year) {
        universityName = name;
        foundationYear = year;
        overallMark = 0;
    }

    public String getName() {
        return universityName;
    }

    public int getYear() {
        return foundationYear;
    }

    public float getMark() {
        float total = 0;

        for (Student student : studentList) {
            total += student.getMark();
        }

        if (total == 0 || studentList.length == 0){
            overallMark = 0;
        } else {
            overallMark = total / studentList.length;
        }

        return overallMark;
    }

    public void addStudents(Student newStudent, int nr) {
         studentList[nr] = newStudent;
    }
}
