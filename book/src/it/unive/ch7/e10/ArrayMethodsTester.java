package it.unive.ch7.e10;

public class ArrayMethodsTester {
    public static void main(String[] args) {
        int[] a = {1, 5, 30, 45, 423, 43, 65, 643, 534, 0};
        ArrayMethods am = new ArrayMethods(a);
        System.out.println("Original array");
        System.out.println(am);
        System.out.println(am.isOrdered());
        System.out.println("Remove median(s)");
        am.removeMedian();
        System.out.println(am);
        System.out.println("Swap first and last");
        am.swapFirstAndLast();
        System.out.println(am);
        System.out.println("Shift right");
        am.shiftRight();
        System.out.println(am);
        System.out.println("Substitute evens with zeros");
        am.subEvensZeros();
        System.out.println(am);
        System.out.println("Substitute elements with the max of the adjacents");
        am.substituteMaxAdj();
        System.out.println(am);
        System.out.println("Remove median(s)");
        am.removeMedian();
        System.out.println(am);
        System.out.println("Move evens");
        am.moveEvens();
        System.out.println(am);
        System.out.println("Second max");
        System.out.println(am.getSecondMax());
        System.out.println("Is ordered");
        System.out.println(am.isOrdered());
        System.out.println("Adjacent duplicates");
        System.out.println(am.adjDuplicates());
        System.out.println("Duplicates");
        System.out.println(am.duplicates());
    }
}
