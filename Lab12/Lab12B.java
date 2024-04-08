import java.util.Scanner;

public class Lab12B {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int age;
        double weight;
        String name, color, breed;

        System.out.println("You are about to create a dog");
        System.out.print("How old is the dog: ");
        age = in.nextInt();
        in.nextLine();
        System.out.print("How much does the dog weigh: ");
        weight = in.nextDouble();
        in.nextLine();
        System.out.print("What is the dog's name: ");
        name = in.nextLine();
        System.out.print("What color is the dog: ");
        color = in.nextLine();
        System.out.print("What breed is the dog: ");
        breed = in.nextLine();
        Dog dog = new Dog(age, weight, name, color, breed);
        System.out.println("\n" + dog.name + " is a " + dog.age + " year old " + dog.furColor + " " + dog.breed + " that weighs " + dog.weight + " lbs.\n");
        dog.bark();

        System.out.print(dog.name + " is hungry, how much should he eat: ");
        dog.eat(in.nextDouble());
        in.nextLine();
        System.out.print(dog.name + " isn't a very good name. What should they be renamed to: ");
        dog.rename(in.nextLine());

        System.out.println("\n" + dog.name + " is a " + dog.age + " year old " + dog.furColor + " " + dog.breed + " that weighs " + dog.weight + " lbs.\n");

    }
}
class Dog{
    int age;
    double weight;
    String name, furColor, breed;
    Dog(int dogAge, double dogWeight, String dogName, String dogColor, String dogBreed){
        age = dogAge;
        weight = dogWeight;
        name = dogName;
        furColor = dogColor;
        breed = dogBreed;
    }

    void bark(){
        System.out.println("Woof! Woof!");
    }
    void rename(String newName){
        name = newName;
    }
    void eat(double newWeight){
        weight += newWeight;
    }
}
