/*
Class: CSE 1321L
Section: J01
Term: Spring 2024
Instructor: Hari Krishna Hota
Name: Roberto Osaba
Lab#: 2
 */
import java.util.Scanner;
public class Lab2A {
    public static void main(String[] Args){
        String name, name2, verb, adverb;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a name: ");
        name = in.next();
        System.out.print("Enter another name: ");
        name2 = in.next();
        System.out.print("Enter a verb: ");
        verb = in.next();
        System.out.print("Enter an adverb: ");
        adverb = in.next();
        System.out.println("Once upon a time, there was a person named " + name + " who had a child named " + name2 + ". This child would " + verb + " " + adverb + " while singing to strangers.");
    }
}
/*
Enter a name: Tiffany
Enter another name: Bubba
Enter a verb: eat
Enter an adverb: wickedly
Once upon a time, there was a person named Tiffany who had a child named
Bubba. This child would eat wickedly while singing to strangers.
 */