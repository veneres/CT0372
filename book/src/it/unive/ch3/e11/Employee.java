package it.unive.ch3.e11;

public class Employee {
    private String employeeName;
    private double currentSalary;

    public Employee(String employeeName, double currentSalary) {
        this.employeeName = employeeName;
        this.currentSalary = currentSalary;
    }

    public double getSalary(){
        return currentSalary;
    }

    public String getName(){
        return employeeName;
    }

    public void raiseSalary(double byPercent){
        if(byPercent < 0){
            throw new IllegalArgumentException("byPercent < 0");
        }
        currentSalary += currentSalary * byPercent / 100;
    }
}
