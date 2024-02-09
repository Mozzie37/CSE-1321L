import java.util.Scanner;
public class Lab5A {
    public static void main(String[] args){
        char input;
        Scanner in = new Scanner(System.in);
        System.out.print("Do you have a driving permit (Y/N)? ");
        input = in.next().charAt(0);
        if(input == 'y' || input == 'Y'){
            System.out.print("Do you have a commercial driving license (Y/N)? ");
            input = in.next().charAt(0);
            if(input == 'y' || input == 'Y'){
                System.out.print("Congratulations! You can purchase a vehicle, let's start talking options!");
            }
            else{
                System.out.println("Commercial driving license is a prerequisite to purchase a vehicle!");
            }
        }
        else{
            System.out.println("Driving permit is a prerequisite to purchase a vehicle!");
        }


    }
}
