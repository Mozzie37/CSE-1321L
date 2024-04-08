import java.util.Scanner;

public class Assignment7B {
    public static void main(String[] args){
        int width, height, red, green, blue, choice, row, column, length;
        Scanner in = new Scanner(System.in);
        boolean running = true;
        System.out.println("[Portable Pix Map Art Program]");
        System.out.print("Enter an image width: ");
        width = in.nextInt();
        System.out.print("Enter an image height: ");
        height = in.nextInt();
        System.out.print("Enter the fill color's red value: ");
        red = in.nextInt();
        System.out.print("Enter the fill color's green value: ");
        green = in.nextInt();
        System.out.print("Enter the fill color's blue value: ");
        blue = in.nextInt();

        pixel[][] image = new pixel[height][width];

        //instantiation of image
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                image[i][j] = new pixel(red, green, blue);
            }
        }

        while(running){
            System.out.println("""
                    
                    What will you do?
                    1) Fill in a pixel
                    2) Fill in a line
                    3) Print the image
                    4) Quit""");
            System.out.print("Choice? ");
            choice = in.nextInt();


            switch(choice){
                case 1:
                    System.out.print("Row: ");
                    row = in.nextInt();
                    System.out.print("Column: ");
                    column = in.nextInt();
                    System.out.print("New Red Color: ");
                    red = in.nextInt();
                    System.out.print("New Green Color: ");
                    green = in.nextInt();
                    System.out.print("New Blue Color: ");
                    blue = in.nextInt();
                    image[row][column].changeRGB(red, green, blue);
                    break;
                case 2: //documentation says that lines are horizontal
                    System.out.print("Row: ");
                    row = in.nextInt();
                    System.out.print("Column: ");
                    column = in.nextInt();
                    System.out.print("Length: ");
                    length = in.nextInt();
                    System.out.print("New Red Color: ");
                    red = in.nextInt();
                    System.out.print("New Green Color: ");
                    green = in.nextInt();
                    System.out.print("New Blue Color: ");
                    blue = in.nextInt();

                    for(int i = 0; i < length; i++){
                        image[row][column + i].changeRGB(red, green, blue);
                    }


                    break;
                case 4:
                    running = false;
                case 3:
                    System.out.print("\nP3\n" + width + " " + height + "\n255\n");
                    for(int i = 0; i < height; i++){
                        for(int j = 0; j < width; j++){
                            image[i][j].printRGB();
                            System.out.print(" ");
                        }
                        System.out.println();
                    }

            }

        }
        System.out.println("Closing...");
    }
}

