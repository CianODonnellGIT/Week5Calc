package ie.atu.week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void  testAdd()
    {
        int a = 2;
        int b = 2;
        int total = a + b;
        System.out.println("the total is" + total);
    }

    @AfterEach
    void tearDown() {
    }
}