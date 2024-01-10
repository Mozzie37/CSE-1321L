import java.util.Scanner;

public class Assignment1A{
    public static void main(String[] args){
        String scheme, subdomain, secondLevel, topLevel, subdirectory, URL;
        Scanner in = new Scanner(System.in);
        System.out.print("Scheme: ");
        scheme = in.nextLine();
        System.out.print("Subdomain: ");
        subdomain = in.nextLine();
        System.out.print("Second-level domain: ");
        secondLevel = in.nextLine();
        System.out.print("Top-level domain: ");
        topLevel = in.nextLine();
        System.out.print("Subdirectory: ");
        subdirectory = in.nextLine();
        URL = scheme + "://" + subdomain + "." + secondLevel + "." + topLevel + "/" + subdirectory;
        System.out.print("Your URL is:\n" + URL);

    }
}