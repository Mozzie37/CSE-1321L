import java.util.Scanner;
public class Lab4B {
    public static void main(String[] args){
        String input;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the day: ");
        input = in.nextLine().toUpperCase();

        if (input.equals("MONDAY") || input.equals("WEDNESDAY")){
            System.out.print("I have class today!");
        }
        else if (input.equals("FRIDAY")){
            System.out.println("It's Friday! Friday! Gotta get down on Friday!");
        }
        else{
            System.out.println("I should use this time to do my homework.");
        }
    }
}
