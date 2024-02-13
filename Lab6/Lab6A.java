import java.util.Scanner;

public class Lab6A {
    public static void main(String[] args){
        int largestNum, input;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 10 numbers and this program will display the largest.");
        System.out.print("Please enter number 1: ");
        largestNum = in.nextInt();
        for(int i = 2; i <= 10; i++){
            System.out.print("Please enter number " + i + ": ");
            input = in.nextInt();
            if(input > largestNum) {
                largestNum = input;
            }
        }
        System.out.println("\nThe largest number was " + largestNum);
    }
}
