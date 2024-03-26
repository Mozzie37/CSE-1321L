import java.util.Scanner;

public class Lab9B {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int targetNum;
        int[] numStorage = new int[11];
        int low, mid, high;
        boolean found = false;


        System.out.println("Please enter 11 numbers:");
        for(int i = 0; i < 11; i++){
            System.out.print("Integer " + (i+1) + ": ");
            numStorage[i] = in.nextInt();
        }
        System.out.print("What is the target number: ");
        targetNum = in.nextInt();

        //bubble sort
        for(int i = 0; i < 11; i++){
            for(int j = 0; j < 10 - i; j++){
                if(numStorage[j] > numStorage[j+1]){
                    int temp = numStorage[j];
                    numStorage[j] = numStorage[j+1];
                    numStorage[j+1] = temp;
                }
            }
        }
        System.out.print("The sorted set is: ");
        //printing out the sorted list
        for(int i = 0; i < 11; i++){
            System.out.print(numStorage[i] + " ");
        }
        System.out.println();


        //binary bubbles
        low = 0;
        high = numStorage.length-1;
        while(high >= low){
            mid = (low+high)/2;
            System.out.println("Low is " + low);
            System.out.println("High is " + high);
            System.out.println("Mid is " + mid);
            System.out.println("Searching");
            if(targetNum < numStorage[mid]){
                high = mid-1;
            }
            else if (targetNum == numStorage[mid]){
                found = true;
                break;
            } 
            else low = mid + 1;
        }
        if (found){
            System.out.println("The target is in the set.");
        }
        else{
            System.out.println("The target is not in the set.");
        }
    }
}
