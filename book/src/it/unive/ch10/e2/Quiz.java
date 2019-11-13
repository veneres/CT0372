package it.unive.ch10.e2;

import it.unive.ch10.common.Measurable;

public class Quiz implements Measurable {
    private double points;
    private String grade;

    public Quiz(double points) {
        if (points < 0 || points > 100) {
            throw new IllegalArgumentException("points < 0 || points > 100");
        }
        StringBuilder sb = new StringBuilder();
        double normalizedPoints = points / 20.;
        sb.append((char) ((int) ('E') - Math.floor(normalizedPoints)));
        if (normalizedPoints - Math.floor(normalizedPoints) >= 0.75) {
            sb.append('+');
        }
        this.points = points;
        grade = sb.toString();
    }

    public double getPoints() {
        return points;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public double getMeasure() {
        return points;
    }

    public static void main(String[] args) {
        Quiz a = new Quiz(35);
        System.out.println(a.getGrade());
    }

}
