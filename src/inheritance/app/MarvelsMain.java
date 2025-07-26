package inheritance.app;


import inheritance.base.Person;
import inheritance.heros.IronMan;

public class MarvelsMain {

    public static void main(String[] args) {
        IronMan ironMan = new IronMan();
        ironMan.walk();
        ironMan.eat("Pasta");
        ironMan.sleep();
        ironMan.usePower();

        Person person = new Person();
        int hc = person.hashCode();
        String str = person.toString();
    }

}
