package objectClassMethods;

public class ToStringMethod {
    private int id;
    private String name;
    private String department;

    // Constructor
    public ToStringMethod(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "ToStringMethod{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
