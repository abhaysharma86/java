package objectClassMethods;

public class ToStringTest {
    public static void main(String[] args) {
        ToStringMethod emp1 = new ToStringMethod(1, "Abhay", "IT");
        ToStringMethod emp2 = new ToStringMethod(2, "Neha", "HR");

        // Without toString(), it would print the object's hashcode
        System.out.println(emp1); // calls emp1.toString()
        System.out.println(emp2); // calls emp2.toString()
    }
}
