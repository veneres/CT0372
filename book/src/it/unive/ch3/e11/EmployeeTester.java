package it.unive.ch3.e11;

public class EmployeeTester {

    public static void main(String[] args) {
        Employee nicola = new Employee("Nicola", 20000);
        System.out.println(nicola.getName());
        System.out.println(nicola.getSalary());
        nicola.raiseSalary(50);
        System.out.println(nicola.getSalary());
        nicola.raiseSalary(50);
        System.out.println(nicola.getSalary());
        nicola.raiseSalary(-50);
    }
}
