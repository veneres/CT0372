package it.unive.ch7.e16;

public class TableTester{
    public static void main(String[] args) {
        Table tb = new Table(10, 5);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                tb.set(i, j, i*10 + j);
            }
        }
        System.out.println(tb);
        tb.neighborAverage(0, 0);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(String.format("Average for (%d, %d): %f", i, j, tb.neighborAverage(i, j)));
            }
        }
    }
}
