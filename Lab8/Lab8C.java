import java.util.Scanner;

public class Lab8C {
    public static void main(String[] args){
        int rows, cols;
        int[][] array;
        int[] array2;
        int count;
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the number of rows: ");
        rows = in.nextInt();
        System.out.print("Please enter the number of columns: ");
        cols = in.nextInt();

        System.out.println("I have " + rows + " rows and " + cols + " columns. I need to fill-up " + (rows * cols) + " spaces.");
        System.out.println("The " + rows + "x" + cols + " array:");

        array = new int[rows][cols];
        array2 = new int[rows*cols];
        count = 1;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                array[i][j] = count;
                System.out.print(array[i][j] + "|");
                array2[count-1] = count;
                count++;
            }
            System.out.println();
        }

        System.out.println("The " + rows + "x" + cols + "2-D array flattened into a " + (rows * cols) + " cell 1-D array:" );
        for(int i = 0; i < (rows*cols); i++){
            System.out.print(array2[i] + "|");
        }


    }
}
