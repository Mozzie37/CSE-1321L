/*
Class: CSE 1321L
Section: J01
Term: Spring 2024
Instructor: Hari Krishna Hota
Name: Roberto Osaba
Lab#: 3
 */
import java.util.Scanner;
public class Lab3A {
    public static void main(String[] args){
        double debt, APR, monthlyPercentage, minPayment;
        Scanner in = new Scanner(System.in);
        System.out.print("Amount owed: $");
        debt = in.nextDouble();
        System.out.print("APR: ");
        APR = in.nextDouble()/100;
        monthlyPercentage = (APR/12) * 100;
        minPayment = debt * APR / 12;
        System.out.printf("Monthly percentage rate: %.3f", monthlyPercentage);
        System.out.println();
        System.out.printf("Minimum payment: $%.2f", minPayment);
    }
}
