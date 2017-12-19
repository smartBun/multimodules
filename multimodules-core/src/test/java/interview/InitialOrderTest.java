package interview;

public class InitialOrderTest {

    public static String staticField = "field1";
    public String field = "filed2";

    static {
        System.out.println(staticField);
        System.out.println("field3");
    }

    {
        System.out.println(field);
        System.out.println("field4");
    }

    public InitialOrderTest() {
        System.out.println("field5");
    }

    public static void main(String[] args) {
        new InitialOrderTest();
    }
}
