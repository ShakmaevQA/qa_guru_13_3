package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnit5Examples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("== Something before All tests");
    }

    @BeforeAll
    static void beforeAll1() {
        System.out.println("== Something 1 before  All tests");
    }

    @BeforeEach
    void beforeEach() {

        System.out.println("======= Something before  Every tests");

    }


    @Test
    void firstTest() {
        System.out.println("======== Started firstTest");

    }

    @Test
    void secondTest() {
        System.out.println("======== Started secondTest");

    }

    @AfterAll
    static void afterAll() {
        System.out.println("======== Started afterTest");

    }

    @AfterAll
    static void afterAll1() {
        System.out.println("======== Started afterTest");

    }
}
