package it.unive.ch7.e10;

public class ArrayMethods {
    private int[] values;

    public ArrayMethods(int[] initialValues) {
        values = initialValues;
    }

    public void swapFirstAndLast() {
        if (values.length > 0) {
            int tmp = 0;
            tmp = values[0];
            values[0] = values[values.length - 1];
            values[values.length - 1] = tmp;
        }
    }

    public void shiftRight() {
        if (values.length > 0) {
            int tmp = values[values.length - 1];
            for (int i = values.length - 1; i > 0; i--) {
                values[i] = values[i - 1];
            }
            values[0] = tmp;
        }
    }

    public void subEvensZeros() {
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                values[i] = 0;
            }
        }
    }

    public void substituteMaxAdj() {
        // done using a copy of the current array, is this necessary?
        int[] aux = new int[values.length];
        for (int i = 1; i < values.length - 1; i++) {
            aux[i] = Math.max(values[i - 1], values[i + 1]);
        }
        for (int i = 1; i < values.length - 1; i++) {
            values[i] = aux[i];
        }
    }

    public void removeMedian() {
        if (values.length == 0) {
            return;
        }
        int newValues[];
        int toSkip = 0;
        if (values.length % 2 == 0) {
            newValues = new int[values.length - 2];
            toSkip = 2;
        } else {
            newValues = new int[values.length - 1];
            toSkip = 1;
        }
        for (int i = 0; i < values.length; i++) {
            if (i == Math.floor(values.length / 2. - 0.5) || (i == Math.ceil(values.length / 2))) {
                continue;
            }
            if (i < Math.floor(values.length / 2.)) {
                newValues[i] = values[i];
            } else {
                if (i - toSkip < newValues.length) {
                    newValues[i - toSkip] = values[i];
                }
            }
        }
        this.values = newValues;
    }

    public void moveEvens() {
        int[] odds = new int[values.length];
        int[] evens = new int[values.length];
        int lastEven = 0;
        int lastOdds = 0;
        // copy even values
        for (int value : values) {
            if (value % 2 == 0) {
                evens[lastEven] = value;
                lastEven += 1;
            } else {
                odds[lastOdds] = value;
                lastOdds += 1;
            }
        }
        for (int i = 0; i < lastEven; i++) {
            values[i] = evens[i];
        }
        for (int i = 0; i < lastOdds; i++) {
            values[i + lastEven] = odds[i];
        }
    }

    public int getSecondMax() {
        if (values.length < 2) {
            throw new RuntimeException("Array length < 2");
        }
        int max = Math.max(values[0], values[1]);
        int secondMax = Math.min(values[0], values[1]);
        for (int i = 2; i < values.length; i++) {
            if (values[i] > max) {
                secondMax = max;
                max = values[i];
            } else {
                if (values[i] > secondMax) {
                    secondMax = values[i];
                }
            }
        }
        return secondMax;
    }

    public boolean isOrdered() {
        boolean ordered = true;
        int i = 0;
        while (ordered && i < values.length - 1) {
            if (values[i] > values[i + 1]) {
                ordered = false;
            }
            i++;
        }
        return ordered;
    }

    public boolean adjDuplicates() {
        boolean duplicate = false;
        int i = 0;
        while (!duplicate && i < values.length - 1) {
            if (values[i] == values[i + 1]) {
                duplicate = true;
            }
            i++;
        }
        return duplicate;
    }

    public boolean duplicates() {
        boolean duplicate = false;
        int i = 0;
        while (!duplicate && i < values.length - 1) {
            int j = i + 1;
            while (!duplicate && j < values.length) {
                if (values[i] == values[j]) {
                    duplicate = true;
                }
                j++;
            }
            i++;
        }
        return duplicate;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int value : values) {
            sb.append(value);
            sb.append(" ");
        }
        return sb.toString();
    }


}
