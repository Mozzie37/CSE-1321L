import java.util.Random;
import java.util.Scanner;

public class Assignment4B {
    public static void main(String[] args){
        int difficulty, questions, attempts, num1, num2, answer, input;
        boolean correct = false;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("[Mathletes Game]\n" +
                         "Choose a game mode (0=Easy, 1=Hard)");
        difficulty = in.nextInt();
        if(difficulty == 0){
            questions = 3;
            attempts = 2;
            System.out.println("Playing on easy mode, huh? Okay!");
        } else{
            questions = 6;
            attempts = 1;
            System.out.println("So, you want a challenge? Okay!");
        }
        //number of questions
        for(int i = 1; i <= questions; i++){
            num1 = rand.nextInt(-255, 255);
            num2 = rand.nextInt(-255,255);
            answer = num1 * num2;
            System.out.println("Q" + i + ". " + num1 + " * " + num2 + " = ?");
            for(int j = 1; j <= attempts; j++){
                input = in.nextInt();
                if(input == answer){
                    correct = true;
                    System.out.println("Correct!");
                    break;
                }
                else{
                    correct = false;
                    System.out.print("Incorrect!");
                    if(difficulty == 0 && j < attempts){
                        System.out.print("Try again.\n");
                    }
                }
            }
            if(!correct){
            System.out.print("\nGame over...");
            break;
            }
            if(i == questions){
                System.out.println("You win!");
            }
        }
    }
}
