package interview;

public class ParamTest {

    protected int num = 0;

    public void change(int i) {
        i = 5;
    }

    public void change(ParamTest t) {
        ParamTest tmp = new ParamTest();
        tmp.num = 9;
        t = tmp;
    }

    public void add(int i) {
        i += 10;
    }

    public void add(ParamTest pt) {
        pt.num += 20;
    }

    public static void main(String[] args) {
        ParamTest t = new ParamTest();
        System.out.println("t.num 1 == " + t.num);
        t.change(t.num);
        System.out.println("t.num 2 == " + t.num);
        t.change(t);
        System.out.println("t.num 3 == " + t.num);


        t = new ParamTest();
        System.out.println("t.num 4 == " + t.num);
        t.add(t.num);
        System.out.println("t.num 5 == " + t.num);
        t.add(t);
        System.out.println("t.num 6 == " + t.num);
    }
}