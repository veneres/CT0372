package it.unive.ch7.e1;

import java.util.Arrays;
import java.util.Random;

public class ArrayExample {
    private int[] v;
    private static Random rndGen = new Random();

    public ArrayExample(int n) {
        if(n < 1){
            throw  new IllegalArgumentException(" n < 1");
        }
        this.v = new int[n];
        for (int i = 0; i < v.length; i++) {
            v[i] = rndGen.nextInt();
        }
    }

    public int get(int i){
        return v[i];
    }

    public void printEvenIndex(){
        System.out.println("Even indices");
        for (int i = 0; i < v.length; i += 2) {
            System.out.print(v[i] +" ");
        }
        System.out.println();
    }

    public void printEven(){
        System.out.println("Evens");
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0){
                System.out.print(v[i] + " ");
            }
        }
        System.out.println();
    }


    public void printInverseOrder(){
        System.out.println("Inverse order");
        for (int i = 1; i <= v.length; i++) {
            System.out.print(v[v.length - i] + " ");
        }
        System.out.println();
    }

    public void firstLast(){
        System.out.println("First: " + v[0]);
        System.out.println("Last: " + v[v.length -1]);
    }

}
