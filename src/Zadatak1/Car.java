package Zadatak1;

public class Car {
    private String model;
    private int yearsOld;
    private int horsePower;

    public Car(String model, int yearsOld) {
        this.model = model;
        this.yearsOld = yearsOld;

    }

    public Car(String model, int yearsOld, int horsePower) {
        this.model = model;
        this.yearsOld = yearsOld;
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void carAging(int yearsOld) {
        this.yearsOld += yearsOld;
    }



    public void carTuning(int horsePower) {
        this.horsePower += horsePower;
    }

    public void printCar() {

        System.out.println("This is a " + this.model + "  with " + this.horsePower + " HP and " + this.yearsOld + " years old\n");
    }

}