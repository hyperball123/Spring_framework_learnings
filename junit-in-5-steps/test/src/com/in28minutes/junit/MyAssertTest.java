package com.in28minutes.junit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyAssertTest {
    List<String> todos = Arrays.asList("AWS","Azure","Devops");

    @Test
    void test() {
        boolean test = todos.contains("AWS");
        boolean test2 = todos.contains("asd");

        assertTrue(test, "Something went wrong");
        assertFalse(test2);
        assertEquals(3, todos.size(),"Error message");
    }
}
