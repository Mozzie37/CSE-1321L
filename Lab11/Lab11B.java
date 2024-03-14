import java.util.Scanner;

public class Lab11B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String password;
        boolean length, upper = false, digit = false;
        System.out.print("Enter a password: ");
        password = in.nextLine();
        //checks the length of the password
        if(password.length() < 8){
            length = false;
        }
        //checks every character if they are upper case or a number
        else{
            length = true;
            for(int i = 0; i < password.length() - 1; i++){
                if(password.codePointAt(i) >= 65  && password.codePointAt(i) <= 90){
                    upper = true;
                }
                if(password.codePointAt(i) >= 48 && password.codePointAt(i) <= 57){
                    digit = true;
                }
                if(digit && upper){
                    break;
                }
            }
        }
        if(length && upper && digit){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Invalid Password");
        }
    }
}
