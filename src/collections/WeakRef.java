package collections;

import java.lang.ref.WeakReference;

public class WeakRef {
    public static void main(String[] args) {
        String badaData = new String("Bahut Badi Image ka Data");

        WeakReference<String> weakRef = new WeakReference<>(badaData);

        badaData = null;

        System.out.println("Before GC: " + weakRef.get());

        System.gc();

        if (weakRef.get() == null) {
            System.out.println("After GC: Data delete ho gaya! Memory bach gayi.");
        } else {
            System.out.println("After GC: Data abhi bhi hai.");
        }
    }
}
