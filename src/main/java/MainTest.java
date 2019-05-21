import java.util.Collections;
import java.util.Iterator;
import java.util.*;

class Student{
    private int id;
    private String name;
    private int age;

    // Constructor

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        String str = +id+" "+name+" "+age;
        return str;
    }


}

class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student stud1, Student stud2) {

        // for comparison
        int nameCompare = stud1.getName().compareTo(stud2.getName());
        int ageCompare;
        int idCompare;

        if (stud1.getAge() > stud2.getAge()) {
            ageCompare = -10;
        } else if (stud1.getAge() < stud2.getAge()) {
            ageCompare = 10;
        } else {

            if (nameCompare != 0) {
                return nameCompare;
            }

            if (stud1.getId() > stud2.getId()) {
                idCompare = 10;
            } else {
                idCompare = -10;
            }

            return idCompare;

        }
        return ageCompare;

    }
}

public class MainTest
{

 public static void main(String[] args) {

    ArrayList<Student> studentList = new ArrayList<>();
    Student student1 = new Student(1,"Sravani",22);
    studentList.add(student1);

    Student student2 = new Student(2,"Ramya",23);
    studentList.add(student2);

    Student student3 = new Student(3,"Nikitha",21);
    studentList.add(student3);

    Student student4 = new Student(4,"Suniyas",23);
    studentList.add(student4);

    Student student5 = new Student(5,"Saranya",22);
    studentList.add(student5);

    Student student6 = new Student(6,"Nishitha",22);
    studentList.add(student6);

    Student student7 = new Student(7,"Yogitha",22);
    studentList.add(student7);

    System.out.println("Overriding toString and printing the ArrayList");
    System.out.println(studentList.toString());


    System.out.println("Printing using Iterator");
    System.out.println("Before sorting.......");

    Iterator studIterator = studentList.iterator();

    while (studIterator.hasNext()) {
        System.out.println(studIterator.next());
    }

    Collections.sort(studentList,new StudentSorter());


    Iterator studIterator1 = studentList.iterator();


    System.out.println("\nAfter Sorting...");
    while (studIterator1.hasNext()) {
        System.out.println(studIterator1.next());
    }



}

}
