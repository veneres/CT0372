package it.unive.ch10.common;

public class Data {
    public static double average(Measurable[] objects){
        double sum = 0;
        for (Measurable object : objects) {
            sum += object.getMeasure();
        }
        if(objects.length > 0){
            return  sum / objects.length;
        } else {
            return 0;
        }
    }
}
