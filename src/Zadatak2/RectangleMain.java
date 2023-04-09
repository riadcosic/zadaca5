package Zadatak2;

public class RectangleMain {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2.11, 5.55);

        System.out.println(rectangle.getA());

        System.out.println(rectangle.getCircumference());

        rectangle.setB(2.11);

        System.out.println(rectangle.getCircumference());

        System.out.println(rectangle.getArea());

        System.out.println(rectangle.isSquare());


    }
}
