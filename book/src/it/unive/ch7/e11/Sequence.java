package it.unive.ch7.e11;

public class Sequence {
    private int[] values;
    public Sequence(int size){
        values = new int[size];
    }
    public void set(int i, int n){
        values[i] = n;
    }
    public int get(int i){
        return values[i];
    }
    public int size(){
        return values.length;
    }

    @Override
    public boolean equals(Object obj) {
        if(! (obj instanceof  Sequence)){
            return false;
        }
        Sequence seq2 = (Sequence) obj;
        if(this.size() != seq2.size()){
            return false;
        }
        boolean equals = true;
        int i = 0;
        while(i < this.size() && equals){
            if(this.get(i) != seq2.get(i)){
                equals = false;
            }
            i++;
        }
        return equals;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.size(); i++) {
            sb.append(this.get(i));
            sb.append(" ");
        }
        return sb.toString();
    }
}
