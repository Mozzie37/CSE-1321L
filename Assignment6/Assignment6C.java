import java.util.Random;
import java.util.Scanner;

public class Assignment6C {
    public static void main(String[] args){
        char[][] board;
        int[] mines; //each index will correspond to a row, the value of the index will be the column (since there is a mine in every row)
        boolean[][] guesses; // each index will start as false, and if true then the correct char of board will be displayed
        int size;
        int xCoord, yCoord;
        boolean hitMine = false;
        boolean safe = true;
        Scanner in = new Scanner(System.in);
        //start
        System.out.println("[Minesweeper - DOS Edition]");
        System.out.print("What is the grid size? ");
        size = in.nextInt();
        mines = initMines(size);
        board = initBoard(size, mines);
        guesses = initGuesses(size);
        for(int i = 0; i < size; i++) {
            printBoard(board, guesses);
            System.out.print("Enter your X coordinate: ");
            xCoord = in.nextInt();
            System.out.print("Enter your Y coordinate: ");
            yCoord = in.nextInt();
            if(guesses[yCoord][xCoord]){// this removes duplicates of guesses still counting towards the final loop
                i--;
            }
            guesses[yCoord][xCoord] = true;
            if(!goodGuess(board, xCoord, yCoord)){
                printBoard(board, guesses);
                System.out.print("Sorry, you hit a mine!");
                hitMine = true;
                break;
            }
        }
        if(!hitMine){
            printBoard(board,guesses);
            System.out.println("You win!");
        }
    }
    public static char[][] initBoard(int size, int[] mineLocations){
        char[][] board = new char[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                board[i][j] = '_'; //starting with board being all safe tiles
            }
        }
        for(int i = 0; i < size; i++){
            board[mineLocations[i]][i] = 'X';
        }
        return board;
    }
    public static int[] initMines(int size){
        int[] mines = new int[size];
        Random rand = new Random();
        for(int i = 0; i < size; i++){
            mines[i] = rand.nextInt(0,size);
        }
        return mines;
    }
    public static boolean[][] initGuesses(int size){
        boolean[][] guesses= new boolean[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                guesses[i][j] = false;
            }
        }
        return guesses;
    }
    public static void printBoard(char[][] board, boolean[][]guesses){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(guesses[i][j]){
                    System.out.print(board[i][j]);
                }
                else{
                    System.out.print("?");
                }
            }
            System.out.println();
        }
    }
    public static boolean goodGuess(char[][] board, int x, int y){
        if(board[y][x] == 'X'){
            return false;
        }
        return true;
    }
}
