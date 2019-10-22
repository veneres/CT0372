package it.unive.custom.university;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void sayHello() {
        System.out.println("I'm " + this.name + " " + this.surname);
    }

    public static void main(String[] args) {
        Person prova = new Person("Alberto", "Veneri");
        prova.sayHello();
    }
}
