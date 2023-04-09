package Zadatak1;

public class CarMain {
    public static void main(String[] args) {

            final Car Car1 = new Car("Renault", 15);
            final Car Car2 = new Car("BMW", 10, 200);

            Car1.carAging(5);
            Car1.carTuning(120);
            Car1.printCar();

            Car2.getModel();
            Car2.carAging(3);
            Car2.carTuning(30);;
            Car2.printCar();


    }
}
