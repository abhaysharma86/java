package inheritance.app;

import inheritance.base.Person;
import inheritance.heros.IronMan;

public class DynamicPoly {

    public static void main(String[] args) {

        // Upcasting: IronMan object is treated as a Person (superclass reference).
        // This enables runtime polymorphism.
        Person person = new IronMan();

        // This will call IronMan's overridden walk() method due to dynamic method dispatch.
        person.walk();

        // This will call IronMan's overridden eat(String food) method if it's overridden in IronMan.
        // Otherwise, it will call the Person class version.
        person.eat("Ice Cream");

        // sleep() method will be called from Person class unless it's overridden in IronMan.
        person.sleep();

        // Creating an IronMan object directly (no upcasting).
        IronMan ironMan = new IronMan();

        // Calling a method that may use super keyword to refer to the overridden method.
        ironMan.callOverriddenEatMethod();
    }
}
