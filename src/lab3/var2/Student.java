package lab3.var2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Student{
    private int id;
    private String name;
    private String sername;
    private String secName;
    private GregorianCalendar dateOfBirth;
    private String adress;
    private String phoneNumber;
    private int faculty;
    private int course;
    private int group;

    public Student(int id, String name, String sername, String secName, GregorianCalendar dateOfBirth, String adress, String phoneNumber, int faculty, int course, int group) {
        this.id = id;
        this.name = name;
        this.sername = sername;
        this.secName = secName;
        this.dateOfBirth = dateOfBirth;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(Student s1) {
        this.id = s1.id;
        this.name = s1.name;
        this.sername = s1.sername;
        this.secName = s1.secName;
        this.dateOfBirth = s1.dateOfBirth;
        this.adress = s1.adress;
        this.phoneNumber = s1.phoneNumber;
        this.faculty = s1.faculty;
        this.course = s1.course;
        this.group = s1.group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getFaculty() {
        return faculty;
    }

    public void setFaculty(int faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        String print = "Student " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sername='" + sername + '\'' +
                ", secName='" + secName + '\'' +
                ", dateOfBirth=" + dateOfBirth.getTime() +
                ", adress='" + adress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'';
        switch (faculty) {
            case 1:
                print += ", faculty='It" + '\'';
                break;
            case 2:
                print += ", faculty='Math" + '\'';
                break;
            case 3:
                print += ", faculty='Fus" + '\'';
                break;
        }
        print += ", course=" + course +
                ", group=" + group;
        return print;
    }

    public static Student[] facultySelection(Student[] students, int faculty) {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty() == faculty) {
                count++;
            }
        }
        Student[] selection = new Student[count];
        count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty() == faculty) {
                selection[count] = students[i];
                count++;
            }
        }
        return selection;
    }

    public static Student[] sort(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].faculty > students[j].faculty) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if(students[i].faculty == students[j].faculty){
                    if(students[i].course > students[j].course){
                        Student temp = students[i];
                        students[i] = students[j];
                        students[j] = temp;
                    }
                }
            }
        }
        return students;
    }

    public static Student[] birthAfter(Student[] students, int year){
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i].dateOfBirth.get(Calendar.YEAR) > year){
                count++;
            }
        }
        Student[] selection = new Student[count];
        count = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i].dateOfBirth.get(Calendar.YEAR) > year){
                selection[count] = students[i];
                count++;
            }
        }
        return selection;
    }

    public static Student[] groupList(Student[] students, int group){
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGroup() == group) {
                count++;
            }
        }
        Student[] selection = new Student[count];
        count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGroup() == group) {
                selection[count] = students[i];
                count++;
            }
        }
        return selection;
    }
}
