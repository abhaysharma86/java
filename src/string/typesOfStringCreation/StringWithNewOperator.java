package string.typesOfStringCreation;

public class StringWithNewOperator {

    /*
    * When we can create a String using the new operator like show belo,
    * the string will store inside the "HEAP MEMORY"
    * */

    public static void main(String[] args) {
        String str = new String("Hello");
        System.out.println(str);
    }

    /*
    * If we can create s String Object using the new operator, a new Object will be created in memory
    * every time, even if the string value is the same. in contrast, if the string is created using literals, the
    * same memory location is used in the string pool.
    * */


}
