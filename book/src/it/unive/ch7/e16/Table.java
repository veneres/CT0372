package it.unive.ch7.e16;

public class Table{
    private int[][] values;

    public Table(int rows, int columns) {
        values = new int[rows][columns];
    }

    public void set(int i, int j, int n) {
        values[i][j] = n;
    }

    public double neighborAverage(int row, int column) {
        if (column >= values[0].length || column < 0 || row >= values.length || row < 0) {
            throw new IllegalArgumentException("row >= values[0].length || row < 0 || column >= values.length || column < 0");
        }
        double sum = 0, count = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (row + i < values.length && row + i >= 0
                        && column + j < values[0].length && column + j >= 0
                        && (row + i != row || column + j != column)) {
                    sum += values[row + i][column + j];
                    count++;
                }
            }
        }
        if (count == 0) {
            return 0;
        } else {
            return sum / count;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(5);
        try {
            this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        for (int[] rows : values) {
            for (int elem : rows) {
                sb.append('[').append(String.format("%5d", elem)).append(']').append("\t");
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
