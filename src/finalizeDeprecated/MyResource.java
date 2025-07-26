package finalizeDeprecated;

public class MyResource implements AutoCloseable {

    public void use() {
        System.out.println("Using the resource...");
    }

    @Override
    public void close() {
        System.out.println("Resource is closed.");
    }

    public static void main(String[] args) {
        try (MyResource resource = new MyResource()) {
            resource.use();
        }
    }
}
