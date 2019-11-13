package it.unive.ch10.e1;

import it.unive.ch10.common.Measurable;

public class Data extends it.unive.ch10.common.Data {
    public static Measurable max(Measurable[] objects) {
        if (objects.length == 0) {
            throw new IllegalArgumentException("objects.length == 0");
        }
        double max = objects[0].getMeasure();
        int maxIndex = 0;
        for (int i = 1; i < objects.length; i++) {
            if (objects[i].getMeasure() > max) {
                max = objects[i].getMeasure();
                maxIndex = i;
            }
        }
        return objects[maxIndex];
    }
}
