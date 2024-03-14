import java.util.Scanner;

public class Lab10A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num1, num2;


        System.out.print("Enter number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        num2 = in.nextInt();
        System.out.println("Max is " + max(num1, num2));
        System.out.println("Min is " + min(num1, num2));
        System.out.println("Average is " + average(num1, num2));
    }
    public static int max(int x, int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
    public static int min(int x, int y){
        if(x>y){
            return y;
        }
        else{
            return x;
        }
    }
    public static float average(int x, int y){
        float average = (float)(x+y) / 2;
        return average;
    }
}