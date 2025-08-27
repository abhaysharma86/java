package inheritance.isAAndHasARelaction;

// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Dog is-a Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Puppy is-a Dog and also is-a Animal (multi-level inheritance)
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping...");
    }
}
