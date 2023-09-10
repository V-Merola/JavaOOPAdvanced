package Inheritance;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here

        Dog dog = new Dog(30, 8, "chihuahua");
        System.out.println("breed: " + dog.getBreed());
        System.out.println("height: " + dog.getHeight());
        System.out.println("weight: " + dog.getWeight());

    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        System.out.println("Bird: \n");

        Bird bird = new Bird(10, 50, 12.8);
        System.out.println("wingspan: " + bird.getWingSpan());
        System.out.println("height: " + bird.getHeight());
        System.out.println("weight: " + bird.getWeight());

        System.out.println("Fish: \n");

        Fish fish = new Fish(12.6, 45, "Tonno");
        System.out.println("species: " + fish.getSpecies());
        System.out.println("height: " + fish.getHeight());
        System.out.println("weight: " + fish.getWeight());



    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here

        Dog dog = new Dog(22, 18.3, "chihuahua");

        Fish fish = new Fish(13, 70, "Tonno");

        Bird bird = new Bird(14, 27, 9);

        if (dog.runSpeedMetersPerSecond() < fish.swimSpeedMetersPerSecond()) {
            System.out.println("L'animale più veloce è Fish: " + fish.swimSpeedMetersPerSecond() + " m/s");
        } else if (fish.swimSpeedMetersPerSecond() < bird.flySpeedMetersPerSecond()) {
            System.out.println("L'animale più veloce è Bird: " + bird.flySpeedMetersPerSecond() + " m/s");
        } else if (dog.runSpeedMetersPerSecond() > bird.flySpeedMetersPerSecond()) {
            System.out.println("L'animale più veloce è Dog: " + dog.runSpeedMetersPerSecond() + " m/s");
        }

    }
}
