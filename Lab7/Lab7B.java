import java.util.Scanner;

public class Lab7B {
    public static void main(String[] args){
        int value;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a value for the size: ");
        value = in.nextInt();
        System.out.println("This is the requested " + value + "x" + value + " right-triangle:");
        for(int i = 1; i <= value; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

