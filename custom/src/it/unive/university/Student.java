package it.unive.custom.university;

public class Student extends Person{
    //private String nickname;

    public static int numberOfStudent = 0;

    public Student(String name, String surname) {
        super(name, surname);
        Student.numberOfStudent += 1;
    }

    public void printThis(){
        System.out.println("--------------");
        System.out.println(this);
        // this is not a simple variable! It is a keyword that represent a reference to the current object!!!
        System.out.println("It is equal to: ");
        System.out.println(this.toString());
        System.out.println("--------------");
    }

    public static void main(String[] args) {
        Person john = new Student("John", "Lennon");
        Person paul = new Student("Paul", "McCartney");
        Person carl = new Student("Richard", "Starkey");
        System.out.println(john.getName());
        System.out.println(carl.getName());
        paul.sayHello();
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
