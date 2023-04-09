package Zadatak3;

public class ComplexMain {
    public static void main(String[] args) {

        Complex z = new Complex(-7, 1);
        System.out.println("Real part of the complex number is: " + z.Re());
        System.out.println("Imaginary part of the complex number is: " + z.Im());

        Complex z1 = new Complex(-10, 0);

        System.out.println("Sum of the two complex numbers is:");

        Complex z2 = z.add(z1);

        z2.printComplex();

        System.out.println("Difference of the two complex numbers is: ");

        Complex z3 = z.substract(z1);

        z3.printComplex();
    }
}
