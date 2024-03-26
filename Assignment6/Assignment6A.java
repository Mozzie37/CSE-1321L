import java.util.Random;

public class Assignment6A{
    public static void main(String[] args){
        int[] array = setArray(19);
        int count = 1;
        System.out.println("[Bogosort]\n");

        while(true){
            printArray(array);
            if(checkIfSorted(array)){
                break;
            }
            array = shuffleArray(array);
            count++;
        }
        System.out.println("Hooray, it's sorted! And it only took " + count + " attempts!");
    }

    public static int[] setArray(int size){
        Random rand = new Random();
        int[] output = new int[size];
        for(int i = 0; i < size; i++){
            output[i] = rand.nextInt(1,453);
        }
        return output;
    }
    public static void printArray(int[] input){
        System.out.println("Printing array...");
        for(int i = 0; i < input.length; i++){
            System.out.print(input[i] + ", ");
        }
        System.out.println();
    }
    public static boolean checkIfSorted(int[] input){
        for(int i = 0; i < input.length - 1; i++){
            if(input[i] > input[i+1]){
                System.out.println("Not sorted yet!");
                return false;
            }
        }
        return true;
    }
    public static int[] shuffleArray(int[] input){
        System.out.println("Shuffling array...");
        //implementation of the fisher-yates shuffle https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle
        Random rand = new Random();
        int temp, roll;
        for(int i = input.length - 1; i > 0; i--){
            //random roll from beginning of array to the i-th element
            roll = rand.nextInt(0,i);
            //swapping the i-th entry and the roll-th entries
            temp = input[i];
            input[i] = input[roll];
            input[roll] = temp;
        }
        return input;
    }

}