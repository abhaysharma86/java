package inheritance.isAAndHasARelaction;

public class IsARelationshipTest {
    public static void main(String[] args) {
        // Creating an instance of Puppy
        Puppy puppy = new Puppy();

        // Puppy is-a Dog → can call Dog's method
        puppy.bark(); // Inherited from Dog class

        // Puppy is-a Animal → can call Animal's method
        puppy.eat();  // Inherited from Animal class

        // Puppy’s own method
        puppy.weep(); // Defined in Puppy class
    }
}
