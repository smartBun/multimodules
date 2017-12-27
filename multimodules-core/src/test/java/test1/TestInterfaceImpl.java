package test1;

public class TestInterfaceImpl implements TestInterface{

    private Integer count;
    @Override
    public void doSomething() {
        System.out.println("Do Something");
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
