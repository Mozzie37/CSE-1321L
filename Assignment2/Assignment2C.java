import java.util.Scanner;
public class Assignment2C {
    public static void main(String[] args){
        int USD;
        double GBP, BSD; //BSD is Bison Dollars
        final double USD_TO_GBP = 0.79;
        final double BSD_TO_GBP = 5;
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Bisonica!");
        System.out.print("How many US Dollars do you have? ");
        USD = in.nextInt();
        GBP = ((double) USD) * USD_TO_GBP;
        BSD = GBP / BSD_TO_GBP;
        System.out.println(USD + " US Dollar(s) is " + GBP + " British Pound(s), which is " + BSD + " Bison Dollar(s)!");
    }
}