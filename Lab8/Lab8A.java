import java.util.Scanner;

public class Lab8A {
    public static void main(String[] args){
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter 5 integers for the first array:");
        for(int i = 0; i < 5; i++){
            System.out.print("Integer " + (i + 1) + ": ");
            array1[i] = in.nextInt();
        }
        System.out.println("Please enter 5 integers for the second array:");
        for(int i = 0; i < 5; i++){
            System.out.print("Integer " + (i + 1) + ": ");
            array2[i] = in.nextInt();
        }
        System.out.print("The resulting sums are ");
        for(int i = 0; i < 5; i++){
            System.out.print(array1[i] + array2[i] + "|");
        }

    }
}
