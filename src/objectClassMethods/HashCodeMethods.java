package objectClassMethods;

import java.util.Objects;

public class HashCodeMethods {
    private int id;
    private String name;

    public HashCodeMethods(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same reference
        if (obj == null || getClass() != obj.getClass()) return false;

        HashCodeMethods other = (HashCodeMethods) obj;
        return id == other.id && Objects.equals(name, other.name);
    }

    // Overriding hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // For printing the object
    @Override
    public String toString() {
        return "HashCodeMethods{id=" + id + ", name='" + name + "'}";
    }
}
