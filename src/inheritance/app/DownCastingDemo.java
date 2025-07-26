package inheritance.app;

import inheritance.animals.Cat;
import inheritance.animals.Dog;
import inheritance.base.Animal;

public class DownCastingDemo {

    public static void main(String[] args) {

        // Declare a reference of superclass (Animal)
        Animal anm;

        // Create a Dog object
        Dog dog = new Dog();

        //  Upcasting:
        // Assigning Dog object to Animal reference (implicit casting)
        anm = dog;

        //  Downcasting:
        // Casting Animal reference back to Dog (explicit casting)
        // This is safe because anm is actually referring to a Dog object
        dog = (Dog) anm;

        // Call some method on the dog using a utility class
        AnimalUtility.performAction(dog);

        //  instanceof Check Before Downcasting
        // Helps to avoid ClassCastException at runtime
        if (anm instanceof Cat) {
            // This block won't execute because `anm` is a Dog, not a Cat
            Cat cat = (Cat) anm;
        }
    }

}
