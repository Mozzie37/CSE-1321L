import java.util.Scanner;
public class Assignment2B {
    public static void main(String[] args){
        int X, Y, width, height;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the hit box bottom-left X coordinate: ");
        X = in.nextInt();
        System.out.print("Enter the hit box bottom-left Y coordinate: ");
        Y = in.nextInt();
        System.out.print("Enter the width of the hit box: ");
        width = in.nextInt();
        System.out.print("Enter the height of the hit box: ");
        height = in.nextInt();
        System.out.println("[Hit Box Coordinates]");
        System.out.println("Bottom-Left: " + X + ", " + Y);
        System.out.println("Top-Left: " + X + ", " + (Y + height));
        System.out.println("Bottom-Right: " + (X + width) + ", " + Y);
        System.out.println("Top-Right: " + (X + width) + ", " + (Y + height));
    }
}
