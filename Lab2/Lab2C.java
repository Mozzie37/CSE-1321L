/*
Class: CSE 1321L
Section: J01
Term: Spring 2024
Instructor: Hari Krishna Hota
Name: Roberto Osaba
Lab#: 2
 */
import java.util.Scanner;
public class Lab2C {
    public static void main(String[] args){
        int width, height;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a width: ");
        width = in.nextInt();
        System.out.print("Enter a height: ");
        height = in.nextInt();
        System.out.println("The area is " + (width * height));
        System.out.println("The perimeter is " + 2*(width+height));
    }
}
