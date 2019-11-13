package it.unive.ch10.p2;

public class LastDigitDistribution {
    int counters[] = new int[10];

    public void process(Sequence seq, int valuesToProcess) {
        for (int i = 0; i < valuesToProcess; i++) {
            int value = seq.next();
            int lastDigit = value % 10;
            counters[lastDigit]++;
        }
    }

    public void display() {
        for (int i = 0; i < counters.length; i++) {
            System.out.printf("%d: %d\n", i, counters[i]);
        }
    }
}
