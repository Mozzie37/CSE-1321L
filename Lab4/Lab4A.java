import java.util.Scanner;
public class Lab4A {
    public static void main(String[] args){
        float grade;
        String letter;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the score of your exam: ");
        grade = in.nextFloat();
        if(grade > 97){
            letter = "A+";
        }
        else if (grade > 94){
            letter = "A";
        }
        else if (grade > 91){
            letter = "A-";
        }
        else if (grade > 88){
            letter = "B+";
        }
        else if (grade > 87){
            letter = "B";
        }
        else if (grade > 82){
            letter = "B-";
        }
        else if (grade > 79){
            letter = "C+";
        }
        else if (grade > 76){
            letter = "C";
        }
        else if (grade > 73){
            letter = "C-";
        }
        else if (grade > 70){
            letter = "D+";
        }
        else if (grade > 67){
            letter = "D";
        }
        else if (grade > 64){
            letter = "D-";
        }
        else{
            letter = "F";
        }
        System.out.println("Letter grade is: " + letter);
    }
}
