import java.util.Scanner;
public class Lab5C {
    public static void main(String[] args){
        /*
        on origin
        x axis
        y axis
        all quadrants (4)
        */
        int x, y;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x: ");
        x = in.nextInt();
        System.out.print("Enter y: ");
        y = in.nextInt();

        if(x == 0 && y == 0){
            System.out.print("This point is the origin.");
        }
        else if(y == 0){
            System.out.print("This point is on the x axis.");
        }
        else if(x == 0){
            System.out.print("This point is on the y axis.");
        }
        else if(x > 0 && y > 0){
            System.out.print("This point is in the first quadrant.");
        }
        else if (x < 0 && y > 0){
            System.out.print("This point is in the second quadrant.");
        }
        else if (x < 0){
            System.out.print("This point is in the third quadrant.");
        }
        else{
            System.out.print("This point is in the fourth quadrant");
        }


    }
}
