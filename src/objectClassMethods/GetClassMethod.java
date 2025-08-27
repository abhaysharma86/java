package objectClassMethods;

public class GetClassMethod {
    private int id;
    private String name;

    // Constructor
    public GetClassMethod(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding equals() using getClass()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;            // Same reference
        if (obj == null) return false;           // Null check
        if (this.getClass() != obj.getClass()) return false; // Class check

        GetClassMethod other = (GetClassMethod) obj;
        return this.id == other.id && this.name.equals(other.name);
    }

    // Optional: Useful for debugging
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}
