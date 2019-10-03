public class Student {
    private String name;
    private String surname;
    //private String nickname;

    public static int numberOfStudent = 0;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        Student.numberOfStudent += 1;
    }
//
//    public Student(String name, String surname, String nickname) {
//        this(name, surname);
//        this.nickname = nickname;
//    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
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
        Student john = new Student("John", "Lennon");
        Student paul = new Student("Paul", "McCartney");
        Student carl = new Student("Richard", "Starkey");
        System.out.println(john.getName());
        System.out.println(carl.getName());
        carl.printThis();
        System.out.println();
        john.printThis();
        /**
         *  Just a reminder, toString implementation is not magic it is simply:
         *  Class name @ identityHashCode
         *  identityHashCode is a integer that can be seen as an unique identifier of an object
         */
        String hexID = Integer.toHexString(System.identityHashCode(john));
        String className = john.getClass().getCanonicalName();
        System.out.println(className+"@"+hexID);
    }
}
