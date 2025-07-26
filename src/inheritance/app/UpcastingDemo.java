package inheritance.app;

import inheritance.animals.Cat;
import inheritance.animals.Dog;
import inheritance.base.Animal;

public class UpcastingDemo {
    public static void main(String[] args) {

        // Creating a base Animal object
        Animal anm = new Animal();
        anm.setName("Scooby");
        AnimalUtility.printName(anm);  // Calls Animal's eat() method

        // Upcasting: Dog object is referred by Animal type reference
        anm = new Dog(); // Upcasting (Dog → Animal)
        anm.setName("Charlie");
        AnimalUtility.printName(anm);  // Calls Dog's overridden eat() method

        // No upcasting here, Cat object is used directly
        Cat cat = new Cat();
        cat.setName("Snoopy");
        AnimalUtility.printName(cat);  // Calls Cat's overridden eat() method
    }
}
