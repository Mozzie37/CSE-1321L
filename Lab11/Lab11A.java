import java.util.Scanner;

public class Lab11A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input;


        while(true){
            System.out.println("Menu\n0) Hello World\n1) Goodbye Moon\n2) Walking on sunshine");
            System.out.print("What would you like to do:");
            input = in.nextLine();
            switch(input){
                case "0":
                    System.out.println("Hello!");
                    break;
                case "1":
                    System.out.println("Ok, bye.");
                    break;
                case "2":
                    System.out.println("WHOA!");
                    break;
            }
            System.out.print("Type yes to rerun. ");
            input = in.nextLine().toUpperCase();
            if(input.equals("YES")){
                continue;
            }
            else{
                break;
            }
        }
        System.out.println("Program Ends");

    }
}