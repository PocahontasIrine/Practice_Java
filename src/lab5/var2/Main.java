package lab5.var2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student(1, "Ivan", "Ivanov", "Ivanovich", new GregorianCalendar(2001, 10, 15), "Rf", "+3456789", 2, 1, 143);
        Student s2 = new Student(1, "Petr", "Ivanov", "Ivanovich", new GregorianCalendar(2000, 10, 15), "Rf", "+3456789", 1, 1, 141);
        Student s3 = new Student(1, "Michael", "Ivanov", "Ivanovich", new GregorianCalendar(1999, 10, 15), "Rf", "+3456789", 3, 3, 143);
        Student s4 = new Student(1, "Alexander", "Ivanov", "Ivanovich", new GregorianCalendar(2003, 10, 15), "Rf", "+3456789", 3, 1, 143);
        Student[] students = new Student[4];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        try {
            Student[] faculty = Student.facultySelection(students, 3);
        }catch (FacultyCheckException e){
            e.Error();
        }
        //students = Student.sort(students);
        try {
            students = Student.birthAfter(students, 2000);
        }catch (YearCheckException e){
            e.Error();
        }
        try {
            students = Student.groupList(students, 143);
        }catch (GroupCheckException e){
            e.Error();
        }
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
