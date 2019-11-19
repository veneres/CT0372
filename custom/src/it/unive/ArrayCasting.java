package it.unive;

import java.util.ArrayList;

public class ArrayCasting {
    private static void writeStringToVector(Object[] a){
        a[0] = "hello";
    }
    private static void writeArrayList(ArrayList<Object> a){
        a.set(0, "hello");
    }
    public static void main(String[] args) {
        Integer[] a = new Integer[10];
        a[0] = 10;
        //This will not work because a it is a Integer[] and we are going to assign a String to one one of its element
        writeStringToVector(a);
        Object[] o = "a;b;c".split(";");
        /*
        * This will not work, read the warning:
        * Storing element of type 'java.lang.Integer' to array of 'java.lang.String' may produce 'ArrayStoreException'
        */
        o[0] = 42;
        String[] s = "a;b;c".split(";");
        Object[] o2 = new Object[s.length];
        for (int i = 0; i < s.length; i++) {
            o[i] = s[i];
        }
        // This will work because o2 has Object[] dynamic type
        o2[0] = 42;
        /*
         * There is a compile error, ArrayList<Integer> is not a subtype of ArrayList<Object>
         * ArrayList<Integer> a = new ArrayList<>();
         * writeArrayList(a);
        */
    }
}
