public class DemoNoEquals {

    public static void main(String[] args) {
        NoEquals foo = new NoEquals(42);
        NoEquals bar = new NoEquals(42);
        Demo.runDemo(foo, bar);
    }
}
