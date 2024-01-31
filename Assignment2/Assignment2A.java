import java.util.Scanner;
public class Assignment2A {
    public static void main(String[] args){
        boolean searching = true;
        int num1, num2, check;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number you want to find a multiple of: ");
        num1 = in.nextInt();
        System.out.print("Enter a second number: ");
        num2 = in.nextInt();
        System.out.println("Calculating...");
        check = num2;
        while(searching){
            if (check % num1 == 0){
                searching = false;
            }
            else{
                check -= 1;
            }
        }
        System.out.print("The nearest multiple of " + num1 + " from " + num2 + " is " + check + "!");
    }
}
