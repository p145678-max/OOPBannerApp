/*
* OOPBannerApp Weekly Assignment 1: Code Level 3 questions
*/

import java.util.Scanner;

public class Week1Level3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- Question 1 -----");
        System.out.print("Enter temperature in celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheitResult = (celsius * 9/5) + 32;

        System.out.println(celsius + " celsius is " + fahrenheitResult + " in fahrenheit");


        System.out.println("\n----- Question 2 -----");
        System.out.print("Enter temperature in fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsiusResult = (fahrenheit - 32) * 5/9;

        System.out.println(fahrenheit + " fahrenheit is " + celsiusResult + " in celsius");
    }
}