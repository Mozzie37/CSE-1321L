import java.util.Scanner;

public class Assignment4C {
    public static void main(String[] args) throws InterruptedException {
        String input;
        int letters;
        Scanner in = new Scanner(System.in);
        System.out.println("[Backspace Animation]\nPlease enter your sentence:");
        input = in.nextLine();
        System.out.println("How many letters do you want to backspace?");
        letters = in.nextInt();
        System.out.print(input);
        for(int i = 0; i < letters; i++){
            Thread.sleep(500);
            System.out.print("\b");
        }
    }
}
