import java.util.Scanner;

public class Lab8B {
    public static void main(String[] args){
        int rows, cols;
        int[][] array;
        int count;
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the number of rows: ");
        rows = in.nextInt();
        System.out.print("Please enter the number of columns: ");
        cols = in.nextInt();

        System.out.println("I have " + rows + " rows and " + cols + " columns. I need to fill-up " + (rows * cols) + " spaces.");
        System.out.println("The " + rows + "x" + cols + " array:");

        array = new int[rows][cols];
        count = 1;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                array[i][j] = count;
                count++;
                System.out.print(array[i][j] + "|");
            }
            System.out.println();
        }
    }
}
