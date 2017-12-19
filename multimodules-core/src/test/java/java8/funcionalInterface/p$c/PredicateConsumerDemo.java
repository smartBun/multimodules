package java8.funcionalInterface.p$c;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumerDemo {

    private static Student updateStudentFee(Student student, Predicate<Student> predicate, Consumer<Student> consumer) {
        if (predicate.test(student)) {
            consumer.accept(student);
        }
        return student;
    }


    public static void main(String[] args) {
        Student student1 = new Student("Ashok", "Kumar", 9.5);
        updateStudentFee(student1,
                student -> student.grade > 8.5,
                student -> student.feeDiscount = 30.0);
        student1.printFee();

        Student student2 = new Student("Rajat", "Verma", 8.0);
        updateStudentFee(student2,
                student -> student.grade >= 8,
                student -> student.feeDiscount = 20.0);
        student2.printFee();
    }
}