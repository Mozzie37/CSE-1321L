import java.util.Scanner;
public class Lab4C {
    public static void main(String[] args){
        String output;
        float number, operation;
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.print("Welcome!\nPlease input a number: ");
        number = in.nextFloat();
        System.out.println("What would you like to do to this number:");
        System.out.println("0) Get the additive inverse of the number");
        System.out.println("1) Get the reciprocal of the number");
        System.out.println("2) Square the number");
        System.out.println("3) Cube the number");
        System.out.println("4) Exit the program");
        choice = in.nextInt();

        switch(choice){
            case 0:
                operation = -1 * number;
                output = "The additive inverse of " + number + " is " + operation;
                break;
            case 1:
                operation = 1 / number;
                output = "The reciprocal of " + number + " is "+ operation;
                break;
            case 2:
                operation = number * number;
                output = "The square of " + number + " is " + operation;
                break;
            case 3:
                operation = number * number * number;
                output = "The cube of " + number + " is " + operation;
                break;
            case 4:
                output = "Thank you, goodbye!";
                break;
            default:
                output = "Invalid input, please try again!";
                break;
        }
        System.out.println(output);
    }
}
