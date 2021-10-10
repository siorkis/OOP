package lib;

import lib.Student;

public class University {
    String university;
    int Year;
    float Mark;
    Student[] studentList = new Student[3];

    public University(String name, int year) {
        university = name;
        Year = year;
        Mark = 0;
    }

    public String getName() {
        return university;
    }

    public int getYear() {
        return Year;
    }

    public float getMark() {
        float total = 0;

        for (Student student : studentList) {
            total += student.getMark();
        }

        if (total == 0 || studentList.length == 0){
            Mark = 0;
        } else {
            Mark = total / studentList.length;
        }

        return Mark;
    }

    public void addStudents(Student newStudent, int nr) {
         studentList[nr] = newStudent;
    }
}
