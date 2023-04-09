package Zadatak2;

public class Rectangle {

    private double a;
    private double b;

    public Rectangle(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    public double getA()
    {
        return a;
    }

    public double getB()
    {
        return b;
    }

    public void setA(double a)
    {
        this.a = a;
    }

    public void setB(double b)
    {
        this.b = b;
    }

    public double getCircumference()
    {
        return 2 * a + 2 * b;
    }

    public double getArea()
    {
        return a * b;
    }

    public boolean isSquare()
    {
        return this.a == this.b;

    }
}