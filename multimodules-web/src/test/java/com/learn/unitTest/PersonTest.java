package com.learn.unitTest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PersonTest {

    private Person person;

    @Before
    public void buildPerson() {
        person = new PersonImpl("Willard", 3);
    }

    @Test
    public void testGetAge() {
        int age = person.getAge();
        assertEquals(3, age);
    }

    @Test
    public void testGetName() {
        String name = person.getName();
        assertEquals("Willard", name);
    }

    @Test
    public void testTalk() {
        String message = person.talkTo("Jimy");
        assertNotNull(message);
    }

    @Test(timeout = 200)
    public void testWalk() {
        person.walk();
    }
}