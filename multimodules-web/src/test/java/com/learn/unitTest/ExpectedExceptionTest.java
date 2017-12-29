package com.learn.unitTest;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExpectedExceptionTest {

    @Rule
    public ExpectedException exp = ExpectedException.none();

    @Test
    public void expectException() {
        exp.expect(IndexOutOfBoundsException.class);
        throw new IndexOutOfBoundsException("Exception method.");
    }

    @Test
    public void expectMessage() {
        exp.expectMessage("Hello World");
        throw new RuntimeException("Hello World will throw exception.");
    }

    @Test
    public void expectCourse() {
        exp.expectCause(new BaseMatcher<IllegalArgumentException>() {

            public boolean matches(Object item) {
                return item instanceof IllegalArgumentException;
            }

            public void describeTo(Description description) {
                description.appendText("Expected Cause Error.");
            }

        });

        Throwable cause = new IllegalArgumentException("Cause Test.");
        throw new RuntimeException(cause);
    }
}