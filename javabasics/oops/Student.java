package javabasics.oops;

// A class is an blueprint of an object. A class combines all the methods and properties.
// A class is also a datatype of it's own
// The below class student, when instantiated would be Student datatype.
public class Student {
    int rno;
    String name;
    float marks;

    // A constructor is a special method which is called when an object is
    // instantiated.
    Student(int rno, String name, float marks) {
        // the this keyword, refers to the current object being instantiated.
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    // calling constructor using constructor
    Student() {
        this(0, "DEFAULT", 0);
    }

    // Print all the properties

    public void print() {
        System.out.println("Roll no: " + rno + " Name: " + name + " Marks: " + marks);
    }
}

// An object is an instance of a class. Physical version.

class ObjectExample {
    public static void main(String[] args) {

        // An object arun is created, the below object is of student datatype.
        Student arun = new Student(1, "Arun", 20);

        // Print properties of arun using the method of Student class
        arun.print();

        // Calling constructor using constructor
        Student randomStudent = new Student();

        // Print properties of randomStudent using the method of Student class
        randomStudent.print();

        // Declaring a final object
        final Student st1 = new Student(2,"Kawin",200);

        // this is possible
        st1.name = "Ramesh";

        // the below line is not possible because the reference of a final variable can't be changed
        // st1 = new Student();


        st1.print();


    }
}
