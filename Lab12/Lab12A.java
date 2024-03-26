import java.util.Scanner;



//todo FINISH THIS 
public class Lab12A {
    public static void main(String[] args) {
        int legs;
        boolean rolling;
        String material;
        Scanner in = new Scanner(System.in);

        System.out.println("You are about to create a chair.");
        System.out.print("How many legs does your chair have: ");
        legs = in.nextInt();
        in.next();
        System.out.print("Is your chair rolling (true/false) : ");
        rolling = in.nextBoolean();
        in.next();
        System.out.println("What is your chair made of: ");
        material = in.nextLine();
        in.next();
        







    }
}
class Chair{
    //attributes
    public int numOfLegs;
    public boolean rolling;
    public String material;


    //constructor
    Chair(){
        numOfLegs = 0;
        rolling = false;
        material = null;
    }
}