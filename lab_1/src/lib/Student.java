package lib;

public class Student {
    String studentName;
    int studentAge;
    int studentMark;

    public Student() {}

    public void setAge(int age) {
       studentAge = age;
    }

    public int getAge() {
        return studentAge;
    }

    public void setMark(int mark) {
        studentMark = mark;
    }

    public int getMark() {
        return studentMark;
    }

    public void setName(String name) {
        studentName = name;
    }

    public String getName() {
        return studentName;
    }

}
