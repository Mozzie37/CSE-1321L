import java.util.Scanner;
public class Assignment1B {
    public static void main(String[] args){
        double r1, r2, g1, g2, b1, b2, r, g, b, colorDistance;
        Scanner in = new Scanner(System.in);

        System.out.print("First color\nR: ");
        r1 = in.nextFloat();
        System.out.print("G: ");
        g1 = in.nextFloat();
        System.out.print("B: ");
        b1 = in.nextFloat();

        System.out.print("\nSecond Color\nR:");
        r2 = in.nextFloat();
        System.out.print("G: ");
        g2 = in.nextFloat();
        System.out.print("B: ");
        b2 = in.nextFloat();

        r = Math.pow(r2 - r1,2);
        g = Math.pow(g2 - g1,2);
        b = Math.pow(b2 - b1,2);

        colorDistance = Math.sqrt(r + g + b);

        System.out.println("\nColor Distance: " + colorDistance);
    }
}
