package objectClassMethods;

// Class must implement Cloneable interface to allow cloning
class Student implements Cloneable {

    int id;
    String name;

    // Constructor to initialize Student object
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override the clone() method from Object class
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Call Object's clone() method to create a shallow copy
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            // Create original object
            Student s1 = new Student(101, "Abhay");

            // Clone the original object using clone() method
            Student s2 = (Student) s1.clone();

            // Print values of original and cloned objects
            System.out.println("Original Object: ID = " + s1.id + ", Name = " + s1.name);
            System.out.println("Cloned Object:   ID = " + s2.id + ", Name = " + s2.name);

        } catch (CloneNotSupportedException e) {
            // If the object doesn't implement Cloneable, exception will be thrown
            System.out.println("Cloning not supported for this class");
        }
    }
}
