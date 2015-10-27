public class DemoWithEquals {

    public static void main(String[] args) {
        WithEquals foo = new WithEquals(42);
        WithEquals bar = new WithEquals(42);
        Demo.runDemo(foo, bar);
    }
}
