package it.unive.ch10.p2;

public class RandomSequence implements Sequence {

    @Override
    public int next() {
        return (int) (Integer.MAX_VALUE * Math.random());
    }
}
