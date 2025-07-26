package finalizeDeprecated;

public class FinalizeExample {

    // Overrides method that is deprecated and marked for removal in 'java.lang.Object'
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() called before object is garbage collected");
    }

    public static void main(String[] args) {
        FinalizeExample obj = new FinalizeExample();
        obj = null; // eligible for GC

        System.gc(); // Suggests JVM to run GC (not guaranteed)

        System.out.println("End of main method");
    }
}
