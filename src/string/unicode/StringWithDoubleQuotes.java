package string.unicode;

public class StringWithDoubleQuotes {

    public static void main(String[] args) {
        /*
         * Sometimes, you may want to store a String value that includes double quotes.
         * In such scenarios, using double quotes directly inside your string will result
         * in a compilation error. To overcome this, we can use the escape sequence
         * character \" as shown below.
         */
        String str = "\"Hello world!\"";

        System.out.println(str);

        /*
         * We can also use Unicode character values inside a String.
         * Behind the scenes, the Java compiler will convert the Unicode values
         * to their respective characters.
         *
         * For example: \u004D and \u0021 are the Unicode values for 'M' and '!' respectively.
         */
        String name = "\u004Dadan\u0021";

        System.out.println(name);

    }

}
