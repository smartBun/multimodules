package java8.funcionalInterface.predicate;

import java.util.ArrayList;
import java.util.List;

public class PredicateTest {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("12");
        list.add("123");
        list.add("1234");
        list.add("12345");
        list.add("123456");
        list.add("1234567");
        list.add("12345678");

        System.out.println(PredicateUtil.count(list, PredicateUtil.getStringLengthPredicate(3)));
        System.out.println(PredicateUtil.count(list, PredicateUtil.getStringLengthPredicate(4)));
        System.out.println(PredicateUtil.count(list, PredicateUtil.getStringLengthPredicate(6)));
        System.out.println(PredicateUtil.count(list, PredicateUtil.getStringLengthPredicate(9)));

    }
}
