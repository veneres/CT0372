package it.unive.ch10.p2;

import java.util.ArrayList;

public class PrimeSequence implements Sequence {
    private int n;
    private ArrayList<Integer> primeNumbers;

    public PrimeSequence() {
        n = 2;
        primeNumbers = new ArrayList<>();
    }

    @Override
    public int next() {
        int i;
        boolean found = false;
        while (!found) {
            found = true;
            i = 0;
            while (i < primeNumbers.size()) {
                if (n % primeNumbers.get(i) == 0) {
                    n++;
                    found = false;
                    break;
                }
                i++;
            }
        }
        primeNumbers.add(n);
        return n;

    }
}
