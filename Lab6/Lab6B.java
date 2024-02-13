import java.util.Random;
import java.util.Scanner;

public class Lab6B {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int input, guess, count;
        System.out.print("Enter a number between 1 and 1000: ");
        input = in.nextInt();
        count = 0;
        while(true){
            guess = rand.nextInt(999) + 1;
            System.out.println("My guess was " + guess);
            count++;
            if(guess == input){
                break;
            }
        }
        System.out.println("I guessed the number was " + guess + " and it only took me " + count + " guesses");
    }
}
