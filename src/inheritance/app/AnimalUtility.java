package inheritance.app;

import inheritance.animals.Cat;
import inheritance.animals.Dog;
import inheritance.base.Animal;

public class AnimalUtility {

    // Method that uses polymorphism to print name and perform common behavior (eat)
    public static void printName(Animal animal) {
        System.out.println(animal.getName());  // Calls overridden getName() based on actual object (Dog/Cat)
        animal.eat();                          // Polymorphic call
    }

    // Method to perform specific actions based on actual object type
    public static void performAction(Animal animal) {
        animal.eat(); // Common behavior for all animals

        // Downcasting using instanceof check (safe casting)
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;  // Downcasting Animal to Dog
            dog.bark();              // Dog-specific method
        } else if (animal instanceof Cat cat) { // Pattern matching for instanceof (Java 16+)
            cat.meow();             // Cat-specific method
        }
    }

}
