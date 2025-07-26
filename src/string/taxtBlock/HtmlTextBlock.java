package string.taxtBlock;

public class HtmlTextBlock {
    public static void main(String[] args) {

        // Text blocks are useful for embedding HTML or JSON directly into code
        String html = """
                <html>
                    <body>
                        <h1>Welcome!</h1>
                        <p>This is HTML inside a Java string.</p>
                    </body>
                </html>
                """;

        System.out.println(html);
    }
}
