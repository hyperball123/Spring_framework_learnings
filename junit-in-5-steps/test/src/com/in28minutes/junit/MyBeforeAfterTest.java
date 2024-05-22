package com.in28minutes.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MyBeforeAfterTest {


    @BeforeAll
    static void beforeAll(){
        System.out.println("beforeAll");
    }
    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach");
    }

    @Test
    void test() {
        System.out.println("test");
    }

    @Test
    void test1() {
        System.out.println("test1");
    }

    @Test
    void test2() {
        System.out.println("test2");
    }

    @AfterEach
    void AfterEach() {
        System.out.println("AfterEach");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }
}
