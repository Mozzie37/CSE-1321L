import java.util.Scanner;

public class Assignment7A {
    public static void main(String[] args){
        FSA stateMachine;
        String input;
        boolean running = true;


        Scanner in = new Scanner(System.in);
        System.out.println("[Finite State Automata]");
        System.out.print("What state do you want to start at? ");
        stateMachine = new FSA(in.nextInt());
        in.nextLine();
        System.out.println();
        while(running) {
            System.out.println("What will you do? \n>Go to next state\n>End");
            input = in.nextLine().toUpperCase();
            switch(input){
                case "GO TO NEXT STATE":
                    stateMachine.goToNextState();
                    System.out.println("\nYou're now at state " + stateMachine.getState() + ".");
                    break;
                case "END":
                    if(stateMachine.end()){
                        System.out.print("\nThe FSA has shut down.");
                        running = false;
                    }
                    else{
                        System.out.println("\nYou can't stop here; you can only stop at state 3.\n");
                    }
                    break;
                default:
                    System.out.println("\n[Invalid command!]\n");
                    break;
            }
        }
    }
}




