package it.unive.ch3.e12;

public class CarTester {
    public static void main(String[] args) {
        Car c1 = new Car(20, 60);
        c1.addGas(30);
        c1.drive(80);
        System.out.println(c1.getCurrentGas()); // 26
    }
}
