package homework3.domain;

import java.util.Objects;

public class Student implements Comparable{

    public String studentFirstName;
    public String studentLastName;


    public Student(){
    }

    public Student(String studentFirstName, String studentLastName) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentFirstName, student.studentFirstName) && Objects.equals(studentLastName, student.studentLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentFirstName, studentLastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentFirstName='" + studentFirstName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        return this.studentFirstName.compareTo(((Student) o).getStudentFirstName());
    }
}
