package student.demo.Model;

import jakarta.persistence.*;

@Entity(name = "Student_table")
public class Student {
    @Id
    @GeneratedValue
     Long id;
    String name;
    int age;
    String sub;
    int marks;

    public Student(String name, int age, String sub, int marks) {
        this.name = name;
        this.age = age;
        this.sub = sub;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student() {
    }
}
