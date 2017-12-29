package com.learn.unitTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith(Parameterized.class)
public class TestGenerateParams {

    private String greeting;

    public TestGenerateParams(String greeting) {
        super();
        this.greeting = greeting;
    }

    @Test
    public void testParams() {
        System.out.println(greeting);
    }

    /**
     * the return type should match the parameters' type in the constructor
     * @return parameters
     */
    @Parameterized.Parameters
    public static List<String> getParams() {
        List<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        return list;
    }
}
