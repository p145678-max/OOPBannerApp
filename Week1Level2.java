/*
* OOPBannerApp Weekly Assignment 1: Code Level 2 questions
*/

import java.util.Scanner;

public class Week1Level2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("----- Question 1 -----");
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication, and division value of the 2 numbers "
                + number1 + " and " + number2 + " are: "
                + addition + ", " + subtraction + ", "
                + multiplication + ", and " + division);


        System.out.println("\n----- Question 2 -----");
        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInch = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq. inch is "
                + areaInch + " and in sq. centimeters is " + areaCm);


        System.out.println("\n----- Question 3 -----");
        System.out.print("Enter perimeter: ");
        double perimeter = input.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side of a square whose perimeter is "
                + perimeter + " is " + side);
    }
}