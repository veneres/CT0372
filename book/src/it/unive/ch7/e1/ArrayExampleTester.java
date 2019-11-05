package it.unive.ch7.e1;

public class ArrayExampleTester {
    public static void main(String[] args) {
        int length = 10;
        ArrayExample arrEx = new ArrayExample(length);
        for (int i = 0; i < length; i++) {
            System.out.print(arrEx.get(i) + " ");
        }
        System.out.println();

        arrEx.printEvenIndex();
        arrEx.printEven();
        arrEx.printInverseOrder();
        arrEx.firstLast();
    }
}
