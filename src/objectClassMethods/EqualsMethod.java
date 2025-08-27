package objectClassMethods;

public class EqualsMethod {

    int id;
    String name;

    // Constructor to initialize fields
    public EqualsMethod(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding equals() to compare EqualsMethod objects logically
    @Override
    public boolean equals(Object obj) {
        // Check if both references point to the same object
        if (this == obj) return true;

        // Check if the object is null or not the same class
        if (obj == null || getClass() != obj.getClass()) return false;

        // Typecast the object to EqualsMethod to compare data members
        EqualsMethod other = (EqualsMethod) obj;

        // Check logical equality: same id and name
        return this.id == other.id && this.name.equals(other.name);
    }

    public static void main(String[] args) {
        EqualsMethod s1 = new EqualsMethod(101, "Abhay");
        EqualsMethod s2 = new EqualsMethod(101, "Abhay");
        EqualsMethod s3 = new EqualsMethod(102, "John");

        // Without overriding equals(), s1.equals(s2) would return false (compares memory address)

        System.out.println("s1 == s2: " + (s1 == s2));               // false (different objects)
        System.out.println("s1.equals(s2): " + s1.equals(s2));       // true  (logical comparison)
        System.out.println("s1.equals(s3): " + s1.equals(s3));       // false (different data)
    }

}
