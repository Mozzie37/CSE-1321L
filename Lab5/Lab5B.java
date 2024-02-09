import java.util.Scanner;
public class Lab5B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;

        System.out.print("Enter an integer: ");
        input = in.nextInt();


        if(input % 2 == 0){
            System.out.print("This number is divisible by 2");
        }
        else if(input % 3 == 0){
            System.out.print("This number is divisible by 3");
        }
        else if(input % 5 == 0){
            System.out.print("This number is divisible by 5");
        }
        else{
            System.out.print("This number is undetermined");
        }
    }
}