package it.unive.ch7.e11;

public class SequenceTester {
    public static void main(String[] args) {
        Sequence a = new Sequence(10);
        Sequence b = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            a.set(i, i);
            b.set(i, i);
        }
        System.out.println("Sequence a");
        System.out.println(a);
        System.out.println("Sequence b");
        System.out.println(b);
        System.out.println("a == b ?");
        System.out.println(a.equals(b));
        a.set(9, 41);
        System.out.println("Sequence a");
        System.out.println(a);
        System.out.println("Sequence b");
        System.out.println(b);
        System.out.println("a == b ?");
        System.out.println(a.equals(b));

    }
}
