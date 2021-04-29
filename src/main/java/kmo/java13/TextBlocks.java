package kmo.java13;

public class TextBlocks {

    private static final String HTML = "<html>\r\n" + "<body>\r\n" + "\t<b>Hi All</b>\r\n" + "</body>\r\n" + "</html" +
            ">\r\n";

    private static final String HTML_IN_NICE = """
            <html>
            <body>
                <b>Hi All</b>
            </body>
            </html>
            """;

    public static void main(String[] args) {
        final var abc = " a\n b\\n    c ";
        System.out.println("###");
        System.out.println(abc);
        System.out.println("###");
        System.out.println(abc.stripIndent());
        System.out.println("###");
        System.out.println(abc.translateEscapes());
        System.out.println("###");
        System.out.println(abc.stripIndent().translateEscapes());
        System.out.println("###");
    }
}
