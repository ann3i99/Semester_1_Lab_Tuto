package ProbSolvingInJava.Tuto;

import java.util.Scanner;

/** QUESTION 1: Display the sentence Faculty of Computer Science and Information Technology.
                a. In one line using multiple Java statements
                b. In multiple lines using one Java statement
 **/

public class Tuto2 {
    public static void main(String[] args) {
        System.out.println("Faculty");
        System.out.println("of");
        System.out.println("Computer");
        System.out.println("Science");
        System.out.println("and");
        System.out.println("Information");
        System.out.println("Technology");

        System.out.println("Faculty\nof\nComputer\nScience\nand\nInformation\nTechonology");

        /** QUESTION 2: Write a Java statement that print "SDN" - Software-defined networking
 **/
        System.out.println("\"SDN\" - Software-defined networking");

        //QUESTION 4. Write statements for each of the following
                // a. Declare a variable that used to store the value of a matric number.
        String MatricNo;

                // b. Declare a variable that used to store the value of π.
        double pi;

                // c. Initialize a variable named M with the value set to false.
        boolean M = false;

                // d. Initialize a variable named P with the value set to 8800000000.
        long P = 8800000000L;

                // e. Initialize a variable named letter with the value set to U.
        char letter = 'U';

                // f. Declare a constant variable named PRO. The value of the constant variable is Java.
        String PRO = "Java";

        /** QUESTION 6: Write a java program that print the circumference of a circle. The input of the
         program is diameter. Display the result in three decimal places. (Note  = Math.PI)
         **/

        Scanner s = new Scanner(System.in);
        double diameter, circumference;

        System.out.print("Enter the diameter of circle: ");
        diameter = s.nextDouble();

        circumference = Math.PI * diameter;

        System.out.printf("The circumference of the circle is: %.3f", circumference);

        /** QUESTION 7: Write a java program that converts inches to meters. (Given 1 inch equals to 2.54
         centimeters). Print the output in two decimal places.
         **/

        double inches, cm;

        System.out.print(" \nEnter value in inches: ");
        inches = s.nextDouble();

        cm = inches*2.54;

        System.out.printf(inches + " inches = %.2f meter",cm);

    }
}
