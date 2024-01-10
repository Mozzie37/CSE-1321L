import java.util.Scanner;
public class Assignment3A {
    public static void main(String[] args){
            double soups, rice, vegetables, peanutButter, numPeople;
            Scanner in = new Scanner(System.in);


            System.out.println("How far your donation goes\n");
            System.out.print("How many cans of soups? ");
            soups = in.nextInt();
            System.out.print("How many bags of rice? ");
            rice = in.nextInt();
            System.out.print("How many cans of vegetables? ");
            vegetables = in.nextInt();
            System.out.print("How many cans of peanut butter? ");
            peanutButter = in.nextInt();

            numPeople = soups * 2 + rice * 4 + vegetables * 3.5 + peanutButter * 7;

            System.out.println("\nYour donation will help feed " + numPeople + " people!");
            System.out.println(soups * 2 + " people with the " + soups + " can(s) of soup");
            System.out.println(rice * 4 + " people with the " + rice + " bag(s) of rice");
            System.out.println(vegetables * 3.5 + " people with the " + vegetables + " can(s) of vegetables");
            System.out.println(peanutButter * 7 + " people with the " + peanutButter + " can(s) of peanut butter");
            

    }
}