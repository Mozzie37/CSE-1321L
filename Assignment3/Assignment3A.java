import java.util.Scanner;
public class Assignment3A {
    public static void main(String[] args){
        int eventsAttended;
        float percentComplete;
        final int totalEvents = 63;
        String rewards, graduating;

        Scanner in = new Scanner(System.in);
        System.out.println("[Scrappy's Bucket List Rewards]");
        System.out.print("How many events have you attended? ");
        eventsAttended = in.nextInt();
        percentComplete = ((float) eventsAttended / (float) totalEvents) * 100;

        if(percentComplete < 10){
            System.out.print("Check out events at https://studentaffairs.kennesaw.edu/scrappysbucketlist/!");
        }
        else{
            System.out.printf("You've been to %.0f%% of all SBL events!\n", percentComplete);
            rewards = "You've earned a Drawstring Bag!\n";
            if(percentComplete > 25){
                rewards += "You've earned a Hat!\n";
            }
            if(percentComplete > 50){
                rewards += "You've earned a T-Shirt!\n";
            }
            if(percentComplete > 75){
                rewards += "You've earned a Glass Water Bottle!\n";
            }
            System.out.print(rewards);
            if (percentComplete == 100){
                System.out.println("You've earned a Hoodie!");
                System.out.print("Are you graduating? ");
                in.nextLine();
                graduating = in.nextLine().toLowerCase();
                if(graduating.equals("yes")){
                    System.out.print("Hooray, you earned a Challenge Coin and special graduation cords!");
                }
                else{
                    System.out.print("There's a special reward when you graduate.");
                }
            }
        }
    }
}