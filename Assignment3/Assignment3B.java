import java.util.Scanner;
public class Assignment3B {
    public static void main(String[] args){
        int width, height, fileSize, bitsPerChannel;
        boolean valid;
        Scanner in = new Scanner(System.in);

        System.out.println("[Image Encoding Checker]");
        System.out.print("What is the image width? ");
        width = in.nextInt();
        System.out.print("What is the image height? ");
        height = in.nextInt();
        System.out.print("What is the file size (in bytes)? ");
        fileSize = in.nextInt();

        bitsPerChannel = (fileSize / (width * height)) * 2;

        switch (bitsPerChannel){
            case 8, 16, 32:
                valid = true;
                break;
            default:
                valid = false;
                break;
        }
        if(valid){
            System.out.println("\nThe RGBA image is encoded with " + bitsPerChannel + " bits per channel." );
        }
        else{
            System.out.println("\nThe information is invalid - please re-enter it.");
        }
    }
}
