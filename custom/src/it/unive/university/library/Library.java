package it.unive.university.library.solution;

/**
 * Deeply inspired by Introduction to programming in Java, MIT OpenCourseWare
 * https://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-092-introduction-to-programming-in-java-january-iap-2010/
 * License: https://creativecommons.org/licenses/by-nc-sa/4.0/legalcode
 */
public class Library {
    // Add the missing implementation to this class

    private static final int MAX_BOOK = 50;
    private String address;
    private Book[] bookArray;
    private int nextIdx = 0; // a new book will be added in this position

    public Library(String address) {
        this.address = address;
        this.bookArray = new Book[MAX_BOOK];
    }

    private boolean addBook(Book bookName) {
        if(this.nextIdx == this.bookArray.length){
            return false;
        }
        this.bookArray[this.nextIdx] = bookName;
        this.nextIdx += 1;
        return true;
    }

    private void printAddress() {
        System.out.println(this.address);
    }

    private boolean borrowBook(String bookName) {
        boolean found = false;
        int index = 0;
        boolean outOfBound = index == this.nextIdx;
        while (!found && !outOfBound) {
            if (this.bookArray[index].getTitle().equals(bookName) && !this.bookArray[index].isBorrowed()){
                found = true;
                this.bookArray[index].borrowed();
            }
            index++;
            outOfBound = index == this.nextIdx;
        }
        return found;
    }

    private void printAvailableBooks() {
        for (int i = 0; i < this.nextIdx; i++) {
            if(!this.bookArray[i].isBorrowed()) {
                System.out.println(this.bookArray[i].getTitle());
            }
        }
    }
    private boolean returnBook(String bookName) {
        boolean found = false;
        int index = 0;
        boolean outOfBound = index == this.nextIdx;
        while (!found && !outOfBound) {
            if (this.bookArray[index].getTitle().equals(bookName)){
                found = true;
                this.bookArray[index].returned();
            }
            index++;
            outOfBound = index == this.nextIdx;
        }
        return found;
    }

    private static void printOpeningHours() {
        System.out.println("Opening hours: 9:00 - 21:00 from Monday to Sunday");
    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first it.unive.library
        boolean checkAdd;
        checkAdd = firstLibrary.addBook(new Book("The Da Vinci Code"));
        checkAdd = checkAdd && firstLibrary.addBook(new Book("Le Petit Prince"));
        checkAdd = checkAdd && firstLibrary.addBook(new Book("A Tale of Two Cities"));
        checkAdd = checkAdd && firstLibrary.addBook(new Book("The Lord of the Rings"));
        if(checkAdd){
            System.out.println("I have successfully added all the books");
        }

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings from the first it.unive.library:");
        if(firstLibrary.borrowBook("The Lord of the Rings")){
            System.out.println("Done");
        }
        System.out.println("Borrowing The Lord of the Rings from the first it.unive.library:");
        if(!firstLibrary.borrowBook("The Lord of the Rings")){
            System.out.println("No \"The Lord of the Rings\" available");
        }
        System.out.println("Borrowing The Lord of the Rings from the second it.unive.library:");
        if(!secondLibrary.borrowBook("The Lord of the Rings")) {
            System.out.println("No \"The Lord of the Rings\" available");
        }
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first it.unive.library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second it.unive.library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first it.unive.library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first it.unive.library
        System.out.println("Books available in the first it.unive.library:");
        firstLibrary.printAvailableBooks();
    }



}

