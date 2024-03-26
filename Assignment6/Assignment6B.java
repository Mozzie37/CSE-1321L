import java.util.Scanner;

public class Assignment6B {
    public static void main(String[] args){
        float[] floatArray = new float[8];
        char[] charArray= new char[8];
        int[] intArray = new int[8];

        String dataType;
        Scanner in = new Scanner(System.in);

        System.out.println("[Overloaded Sort]");
        System.out.print("What data type do you want to enter? ");
        dataType = in.nextLine().toLowerCase();
        switch(dataType){
            case "float":
                for(int i = 1; i <= 8; i++){
                    System.out.print("Value " + i + ": ");
                    floatArray[i-1] = in.nextFloat();
                }
                arraySort(floatArray);
                break;
            case "char":
                for(int i = 1; i <= 8; i++){
                    System.out.print("Value " + i + ": ");
                    charArray[i-1] = in.next().charAt(0);
                }
                arraySort(charArray);
                break;
            case "int":
                for(int i = 1; i <= 8; i++){
                    System.out.print("Value " + i + ": ");
                    intArray[i-1] = in.nextInt();
                }
                arraySort(intArray);
                break;
        }

    }
    public static void arraySort(float[] input){
        System.out.println("calling arraySort()...");
        float temp;
        //bubblesort
        for(int i = 0; i < input.length; i++){
            for(int j = 0; j  < input.length - 1 - i; j++){
                if(input[j] > input[j+1]){
                    temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
        System.out.println("The sorted values are:");
        for(int i = 0; i < input.length; i++){
            System.out.print(input[i] + ", ");
        }
    }
    public static void arraySort(char[] input){
        System.out.println("calling arraySort()...");
        char temp;
        //bubblesort
        for(int i = 0; i < input.length; i++){
            for(int j = 0; j  < input.length - 1 - i; j++){
                if(input[j] > input[j+1]){
                    temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
        System.out.println("The sorted values are:");
        for(int i = 0; i < input.length; i++){
            System.out.print(input[i] + ", ");
        }

    }
    public static void arraySort(int[] input){
        System.out.println("calling arraySort()...");
        int temp;
        //bubblesort
        for(int i = 0; i < input.length; i++){
            for(int j = 0; j  < input.length - 1 - i; j++){
                if(input[j] > input[j+1]){
                    temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
        System.out.println("The sorted values are:");
        for(int i = 0; i < input.length; i++){
            System.out.print(input[i] + ", ");
        }

    }
}
