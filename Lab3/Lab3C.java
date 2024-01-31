import java.util.Scanner;
public class Lab3C {
    public static void main(String[] args){
        int quarters, dimes, nickels, pennies, cents;
        double dollars;
        final int QUARTER = 25;
        final int DIME = 10;
        final int NICKEL = 5;
        final int PENNY = 1;
        //input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of quarters: ");
        quarters = in.nextInt();
        System.out.print("Enter the number of dimes: ");
        dimes = in.nextInt();
        System.out.print("Enter the number of nickels: ");
        nickels = in.nextInt();
        System.out.print("Enter the number of pennies: ");
        pennies = in.nextInt();
        //verifying your entries
        System.out.println("You Entered " + quarters + " quarters.");
        System.out.println("You Entered " + dimes + " dimes.");
        System.out.println("You Entered " + nickels + " nickels.");
        System.out.println("You Entered " + pennies + " pennies.");
        //total number of cents
        cents = quarters * QUARTER + nickels * NICKEL + dimes * DIME + pennies * PENNY;
        //using typecasting to manipulate the desired data
        dollars = (double) cents / 100;
        cents -=  (int) dollars * 100;
        //final line
        System.out.println("Your total is " +  (int) dollars  + " dollars and " + cents + " cents.");
    }
}
