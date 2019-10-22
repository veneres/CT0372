package it.unive.university.roles;

import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<String> teachCourses;

    public Teacher(String name, String surname) {
        super(name, surname);
        teachCourses = new ArrayList<>();
    }

    public void sayHello() {
        System.out.println("I'm prof." + getName() + " " + getSurname());
    }

    public void addTeachCourse(String courseName) {
        this.teachCourses.add(courseName);
    }

    public void listCourses() {
        for (int i = 0; i < this.teachCourses.size(); i++) {
            System.out.println(this.teachCourses.get(i));
        }
    }

    public static void main(String[] args) {
        Person ab = new Teacher("a", "b");
        Teacher cd = new Teacher("c", "d");
        if (ab instanceof Person) {
            Person ef = (Person) ab;
            System.out.println(ef);
        }
        System.out.println(ab);
        ab.sayHello();
        cd.sayHello();
        cd.addTeachCourse("Math");
        cd.addTeachCourse("Geometry");
        cd.listCourses();
        // carl.printThis();
        // System.out.println();
        //john.printThis();
        /**
         *  Just a reminder, toString implementation is not magic it is simply:
         *  Class name @ identityHashCode
         *  identityHashCode is a integer that can be seen as an unique identifier of an object
         */
        // String hexID = Integer.toHexString(System.identityHashCode(john));
        // String className = john.getClass().getCanonicalName();
        // System.out.println(className+"@"+hexID);
    }
}
