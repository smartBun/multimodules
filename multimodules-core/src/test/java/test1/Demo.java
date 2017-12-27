package test1;

public class Demo {
    public static void main(String[] args) {
        TestInterfaceImpl t = new TestInterfaceImpl();
        t.doSomething();
        t.setCount(222);
        System.out.println("Count => " + t.getCount());
    }
}
