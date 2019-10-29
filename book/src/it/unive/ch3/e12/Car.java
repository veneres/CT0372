package it.unive.ch3.e12;

public class Car {
    private double fuelConsumption; // km/l
    private double tankCapacity;
    private double currentGas;

    public Car(double fuelConsumption, double tankCapacity) {
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
        this.currentGas = 0;
    }

    public double getTankCapacity(){
        return tankCapacity;
    }

    public double getCurrentGas() {
        return currentGas;
    }

    public void addGas(double moreFuel){
        if(this.currentGas + moreFuel > this.tankCapacity){
            throw new RuntimeException("Too much fuel, currentGas + moreFuel > tankCapacity");
        }
        if(moreFuel < 0){
            throw new RuntimeException("What??? moreFuel < 0");
        }
        this.currentGas += moreFuel;
    }
    public void drive(double kmToDo){
        if (kmToDo / fuelConsumption < currentGas){
            this.currentGas -= kmToDo / fuelConsumption;
        } else{
            throw new RuntimeException("Not enough fuel");
        }
    }
}
