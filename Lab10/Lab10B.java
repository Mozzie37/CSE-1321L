import java.util.Scanner;

public class Lab10B {
    public static void main(String[] args){
        double width, height;
        Scanner in = new Scanner(System.in);
        char option;
        
        while(true){
            System.out.print("Enter width: ");
            width = in.nextDouble();
            System.out.print("Enter height: ");
            height = in.nextDouble();
            if (isValid(width, height)){
                System.out.println("This is a valid rectangle\nThe area is " + area(width, height) + "\nThe perimeter is " + perimeter(width, height));
            }
            else{
                System.out.println("This is an invalid rectangle.");
            }
            System.out.print("Do you want to enter another width and height? : ");
            option = in.next().charAt(0);
            if(option == 'N' || option == 'n'){
                break;
            }
        }
    }
    public static boolean isValid(double width, double height){
        if (width + height <= 30){
            return false;
        }
        return true;
    }
    public static double area(double width, double height){
        return width * height;
    }
    public static double perimeter(double width, double height){
        return 2 * (width + height);
    }
}
