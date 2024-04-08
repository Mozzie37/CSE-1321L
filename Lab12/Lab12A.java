import java.util.Scanner;

public class Lab12A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numOfLegs;
        boolean rolling;
        String material;

        System.out.println("You are about to create a chair.");
        System.out.print("How many legs does your chair have: ");
        numOfLegs = in.nextInt();
        in.nextLine();
        System.out.print("Is your chair rolling (true/false): ");
        rolling = in.nextBoolean();
        in.nextLine();
        System.out.print("What is your chair made of: ");
        material = in.nextLine();

        Chair chair = new Chair(numOfLegs, rolling, material);

        System.out.print("Your chair has " + chair.numOfLegs + " legs, is ");
        if(!chair.rolling){
            System.out.print("not ");
        }
        System.out.print("rolling, and is made of " + chair.material + ".");

        System.out.println("\nThis program is going to change that.");
        chair.numOfLegs = 4;
        chair.rolling = false;
        chair.material = "wood";

        System.out.print("Your chair has " + chair.numOfLegs + " legs, is ");
        if(!chair.rolling){
            System.out.print("not ");
        }
        System.out.print("rolling, and is made of " + chair.material + ".");

    }
}
class Chair{
    public int numOfLegs;
    public boolean rolling;
    public String material;
    Chair(int legs, boolean rolls, String madeOf){
        numOfLegs = legs;
        rolling = rolls;
        material = madeOf;
    }
}
