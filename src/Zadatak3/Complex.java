package Zadatak3;

public class Complex {

        private int realNumber;
        private int imaginaryNumber;

        public Complex()
        {
            this.realNumber = 0;
            this.imaginaryNumber = 0;
        }

        public Complex (int realNumber, int imaginaryNumber)
        {
                this.realNumber = realNumber;
                this.imaginaryNumber = imaginaryNumber;
        }

        public int Re()
        {
                return realNumber;
        }

        public int Im()
        {
                return imaginaryNumber;
        }


        public Complex add(Complex z1)
        {
            int realNumber = this.realNumber + z1.realNumber;
            int imaginaryNumber = this.imaginaryNumber + z1.imaginaryNumber;
            return new Complex(realNumber, imaginaryNumber);
        }

        public Complex substract(Complex z1)
        {
             int realNumber = this.realNumber - z1.realNumber;
             int imaginaryNumber = this.imaginaryNumber - z1.imaginaryNumber;
             return new Complex(realNumber, imaginaryNumber);
        }

        public void printComplex() {
                if (realNumber != 0 && imaginaryNumber == 0) {
                        System.out.println(realNumber);
                }
                else if (realNumber == 0 && imaginaryNumber != 0) {
                        System.out.println(imaginaryNumber + "i");
                }
                else if (realNumber == 0 && imaginaryNumber == 0) {
                        System.out.println("0");
                }
                else if (realNumber != 0 && imaginaryNumber != 0) {

                                System.out.println(realNumber + " + " + imaginaryNumber + "i");

                }




}}
