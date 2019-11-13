package it.unive.ch10.p2;

public class SquareSequence implements Sequence {
    private int n;

    @Override
    public int next() {
        n++;
        return n * n;
    }
}
