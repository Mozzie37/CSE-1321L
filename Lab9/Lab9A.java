import java.util.Scanner;

public class Lab9A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int targetNum;
        int[] numStorage = new int[10];
        boolean targetInSet = false;



        System.out.println("Please enter 10 numbers:");
        for(int i = 0; i < 10; i++){
            System.out.print("Integer " + (i+1) + ": ");
            numStorage[i] = in.nextInt();
        }

        System.out.print("What is the target number: ");
        targetNum = in.nextInt();

        for(int i = 0; i < 10; i++){
            if (targetNum == numStorage[i]){
                targetInSet = true;
            }
        }
        if(targetInSet){
            System.out.println("The target is in the set.");
        }
        else{
            System.out.print("The target is not in the set.");
        }

    }
}