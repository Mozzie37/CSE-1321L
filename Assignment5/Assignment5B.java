import java.util.Scanner;

public class Assignment5B {
    public static void main(String[] args) {
        int width, height, selection, xPos, yPos, length;
        char[][] level;
        boolean running = true;
        Scanner in = new Scanner(System.in);


        System.out.println("[FYE Level Map Creator]");
        System.out.print("Enter a map width: ");
        width = in.nextInt();
        System.out.print("Enter a map height: ");
        height = in.nextInt();
        level = new char[height][width];
        //generate level
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                level[i][j] = '_';
            }
        }
        while (running) {
            //print level
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print(level[i][j]);
                }
                System.out.println();
            }
            System.out.print("Options\n" +
                    "1. Clear Level\n" +
                    "2. Add Platform\n" +
                    "3. Add Items\n" +
                    "4. Quit\n" +
                    "Enter a choice: ");
            selection = in.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("[Clear Level]");
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            level[i][j] = '_';
                        }
                    }
                    break;
                case 2:
                    System.out.println("[Add Platform]");
                    System.out.print("Enter X Coordinate: ");
                    xPos = in.nextInt();
                    System.out.print("Enter Y Coordinate: ");
                    yPos = in.nextInt();
                    System.out.print("Enter length: ");
                    length = in.nextInt();
                    if(xPos <= width && xPos >= 0 && yPos <= height && yPos >= 0 && xPos + length <= width){
                        for(int i = 0; i < length; i++){
                            level[yPos][xPos + i] = '=';
                        }
                    }
                    else{
                        System.out.println("This platform wont fit in the level!");
                    }


                    break;
                case 3:
                    System.out.println("[Add Items]");
                    System.out.print("Enter X Coordinate: ");
                    xPos = in.nextInt();
                    System.out.print("Enter Y Coordinate: ");
                    yPos = in.nextInt();
                    if (xPos <= width && xPos >= 0 && yPos <= height && yPos >= 0){
                        level[yPos][xPos] = 'P';
                    }
                    else{
                        System.out.println("This is not a valid location!");
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
            }
        }
    }
}