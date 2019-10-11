package it.unive.custom.library.solution;

/**
 * Deeply inspired by Introduction to programming in Java, MIT OpenCourseWare
 * https://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-092-introduction-to-programming-in-java-january-iap-2010/
 * License: https://creativecommons.org/licenses/by-nc-sa/4.0/legalcode
 */
public class Book {

    String title;
    boolean borrowed;

    // Creates a new Book
    public Book(String title) {
        this.title = title;
        this.borrowed = false;
    }

    // Marks the book as rented
    public void borrowed() {
        this.borrowed = true;
    }

    // Marks the book as not rented
    public void returned() {
        this.borrowed = false;
    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed(){
        return this.borrowed;
    }

    // Returns the title of the book
    public String getTitle(){
        return this.title;
    }

    public static void main(String[] arguments){
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }

}

