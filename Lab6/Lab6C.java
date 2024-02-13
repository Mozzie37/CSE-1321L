import java.util.Scanner;

public class Lab6C {
    public static void main(String[] args){
        int balance, selection, change;
        char mainMenu;
        Scanner in = new Scanner(System.in);
        balance = 1000;
        System.out.println("Welcome!\nYou have $" + balance + " in your account.");

        do {
        System.out.println("\nMenu\n0) Make a deposit\n1) Make a withdrawal\n2) Display account value\n");
        System.out.print("Please make a selection: ");
        selection = in.nextInt();
        if(selection == 0){
            System.out.print("How much would you like to deposit? : ");
            change = in.nextInt();
            balance += change;
            System.out.println("Your current balance is $" + balance);
        } else if (selection == 1) {
            System.out.print("How much would you like to withdraw? : ");
            change = in.nextInt();
            balance -= change;
            System.out.println("Your current balance is $" + balance);
        } else if (selection == 2){
            System.out.println("Your current balance is $" + balance);
        } else{
            System.out.println("Invalid entry, please try again.");
        }
        System.out.print("Would you like to return to the main menu (Y/N)? : ");
        mainMenu = in.next().charAt(0);
        in.nextLine();
        if(mainMenu == 'n' || mainMenu == 'N'){
            System.out.println("\nThank you for banking with us!");
            break;
        }
        }while(true);
    }
}
