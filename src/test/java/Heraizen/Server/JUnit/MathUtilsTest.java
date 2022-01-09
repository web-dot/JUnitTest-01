package Heraizen.Server.JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

    MathUtils mathUtils;
    
    @BeforeEach
    void init() {
        mathUtils = new MathUtils();
    }
    
    
    @Test
    void testAdd() {
        int expected = 2;
        int actual = mathUtils.add(1, 1);
        assertEquals(expected, actual, "The add method should add two numbers"); //asserting that expected and actual are the same
    }
    
    @Test
    void testDivide() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "divide by 0 should throw");
    }
    
    @Test
    void testComputeCircleArea() {
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return circle area of the radius");
    }
    
    
}
