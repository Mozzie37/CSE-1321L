import java.util.Scanner;
public class Lab3B {
    public static void main(String[] args){
    float hoursTotal = 0, qualityPoints = 0, hours;
    int num;
    Scanner in = new Scanner(System.in);
    for(num = 1; num < 5; num++){
        System.out.print("Course " + num + " hours: ");
        hours = in.nextFloat();
        hoursTotal += hours;
        System.out.print("Grade for course " + num + ": ");
        qualityPoints += hours * in.nextFloat();
    }
    System.out.println("Total hours is: " + hoursTotal);
    System.out.println("Total quality points is: " + qualityPoints);
    System.out.println("Your GPA for this semester is " + (qualityPoints / hoursTotal));
    }
}
