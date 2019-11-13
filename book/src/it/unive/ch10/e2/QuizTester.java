package it.unive.ch10.e2;

import it.unive.ch10.common.Measurable;
import it.unive.ch10.e1.Data;

public class QuizTester {
    public static void main(String[] args) {
        Quiz[] a = new Quiz[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Quiz(Math.random() * 100);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].getMeasure());
        }
        System.out.println("Values");
        System.out.println(Data.max(a).getMeasure());
        System.out.println(Data.average(a));
    }
}
