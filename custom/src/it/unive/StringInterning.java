package it.unive;

/*
    Simple class/main used to explain Java String Interning
 */
public class StringInterning {
    public static void main(String[] args) {
        String s1 = "My beautiful string";
        String s2 = "My beautiful string";
        String s3 = new String("My beautiful string");
        String s4 = s3.intern();
        System.out.print("s1 == s2? ");
        System.out.println(s1 == s2);
        System.out.print("s2 == s3? ");
        System.out.println(s2 == s3);
        System.out.print("s3 == s4? ");
        System.out.println(s3 == s4);
        System.out.print("s1 == s3? ");
        System.out.println(s1 == s3);
        System.out.print("s1 == s4? ");
        System.out.println(s1 == s4);
        System.out.print("s1.equals(s2)? ");
        System.out.println(s1.equals(s2));
        System.out.print("s1.equals(s2)? ");
        System.out.println(s2.equals(s3));
        System.out.print("s3.equals(s4) ");
        System.out.println(s3.equals(s4));
        System.out.print("s1.equals(s4) ");
        System.out.println(s1.equals(s4));
        System.out.print("s1.equals(s3) ");
        System.out.println(s1.equals(s3));
    }
}
