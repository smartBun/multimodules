package java8.funcionalInterface.predicate;

import java.util.List;
import java.util.function.Predicate;

public class PredicateUtil {

    public static <T> int count(List<T> list, Predicate<T> p) {
        int count = 0;
        for (T t : list) {
            if(p.test(t)) {
                count++;
            }
        }
        return count;
    }

    public static Predicate<String> getStringLengthPredicate(int length) {
        return e -> e.length() > length;
    }
}
