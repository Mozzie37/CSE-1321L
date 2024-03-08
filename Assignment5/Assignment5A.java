import java.util.Random;
import java.util.Scanner;

public class Assignment5A {
    public static void main(String[] args){
        int games;
        String playerThrow, computerThrow;
        String[] computerResponse = {"ROCK", "PAPER", "SCISSORS"};
        String[] resultOfGame, winningThrow;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();


        System.out.print("How many games do you want to play?: ");
        games = in.nextInt();
        in.nextLine();
        resultOfGame = new String[games];
        winningThrow = new String[games];
        for(int i = 0; i < games; i++){
            System.out.print("Round " + (i+1) + ": What do you want to throw?: ");
            playerThrow = in.nextLine().toUpperCase();
            computerThrow = computerResponse[rand.nextInt(0,2)];
            System.out.println("Computer thew " + computerThrow);
            //ties
            if(playerThrow.equals(computerThrow)){
                resultOfGame[i] = "Tied";
                winningThrow[i] = computerThrow;
            }
            //not ties
            else{
                switch(playerThrow){
                    case "ROCK":
                        switch(computerThrow){
                            case "PAPER":
                                resultOfGame[i] = "Computer won";
                                winningThrow[i] = computerThrow;
                                break;
                            case "SCISSORS":
                                resultOfGame[i] = "Player won";
                                winningThrow[i] = playerThrow;
                                break;
                        }
                        break;
                    case "PAPER":
                        switch(computerThrow){
                            case "SCISSORS":
                                resultOfGame[i] = "Computer won";
                                winningThrow[i] = computerThrow;
                                break;
                            case "ROCK":
                                resultOfGame[i] = "Player won";
                                winningThrow[i] = playerThrow;
                                break;
                        }
                        break;
                    case "SCISSORS":
                        switch(computerThrow){
                            case "ROCK":
                                resultOfGame[i] = "Computer won";
                                winningThrow[i] = computerThrow;
                                break;
                            case "PAPER":
                                resultOfGame[i] = "Player won";
                                winningThrow[i] = playerThrow;
                                break;
                        }
                        break;
                }
            }
        }
        System.out.println("Game over...");
        System.out.println("\nHere's the recap:");
        for(int i = 0; i < games; i++){
            System.out.println(resultOfGame[i] + " Round " + (i+1) + " with " + winningThrow[i]);
        }
    }
}
