import java.util.Scanner;
public class Assignment3C {
    public static void main(String[] args){
        int input;
        Scanner in = new Scanner(System.in);

        System.out.println("[Epic Quest Simulator]");
        System.out.println("""
                Hello stranger! Do you have time to hear my tale?
                1) Yes
                2) No""");

        input = in.nextInt();

        if(input == 1){
            System.out.println("""
                    Thank you! I come from the land of Pax Bisonica. Our country has been taken over by a cruel tyrant!
                    1) That's awful!
                    2) What can I do?""");
            input = in.nextInt();
            if(input == 1){
                System.out.println("Alas, it is truly terrible...");
            }
            System.out.println("""
                    Please, you must journey to Pax Bisonica and free our country!
                    1) Yes
                    2) No""");

            input = in.nextInt();
            if(input == 1){
                System.out.println("Hooray!");
            }
            else{
                System.out.println("Then all is lost...");
            }
        }
        else{
            System.out.println("Ah, then goodbye...");

        }
    }
}
