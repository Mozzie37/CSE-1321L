import java.util.Scanner;
public class Lab7A {
    public static void main(String[] args){
        int value;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a value for the size: ");
        value = in.nextInt();
        System.out.println("This is the requested " + value + "x" + value + " box:");
        for(int i = 0; i < value; i++){
            for(int j = 0; j < value; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
