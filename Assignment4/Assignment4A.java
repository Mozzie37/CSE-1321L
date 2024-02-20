import java.util.Scanner;
import java.lang.Math;
public class Assignment4A {
    public static void main(String[] args){
        char input;
        char whitespace = ' ';
        int width;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character to use: ");
        input = in.next().charAt(0);
        do{
            System.out.print("Enter the diamond's width: ");
            width = in.nextInt();
            if(width < 3){
                System.out.println("Please enter a width of at least 3.");
            }
        }while(width < 3);
        if(width % 2 == 0){
            width += 1;
            System.out.println("To make a diamond we'll use " + width + " as the width instead.");
        }
        //number of lines
        int numChars = 1;
        for(int i = -1 * (width - 1) / 2; i <= (width - 1) / 2 ; i++){
            int absI = Math.abs(i);
            //whitespace characters
            for(int j = absI; j > 0; j--){
                System.out.print(whitespace);
            }
            //non whitespace characters
            if(i < 0){
                for(int j = 0; j < numChars; j++){
                    System.out.print(input);
                }
                System.out.println();
                numChars += 2;
            } else if (i == 0) {
                for(int j = 0; j < width; j++){
                    System.out.print(input);
                }
                System.out.println();
                numChars -= 2;
            } else if (i > 0){
                for(int j = 0; j < numChars; j++){
                    System.out.print(input);
                }
                System.out.println();
                numChars -= 2;
            }
        }
    }
}
