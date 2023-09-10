package Junit;

/*
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    /**
     * 1:
     *
     *
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     *
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     *
     * Verify that the methods return the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     */
/*
    @Test
    void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Calculator calcolo = new Calculator();

        Assertions.assertEquals(13, calcolo.add(7, 6));
        System.out.println(calcolo.add(7, 6));

        Assertions.assertEquals(-5, calcolo.add(-3, -2));
        System.out.println(calcolo.add(-3, -2));

        Assertions.assertEquals(0, calcolo.add(0, 0));
        System.out.println(calcolo.add(0, 0));

        Assertions.assertEquals(-1, calcolo.subtract(999, 1000));
        System.out.println(calcolo.add(999, 1000));

        Assertions.assertEquals(-9, calcolo.subtract(-7, 2));
        System.out.println(calcolo.add(-7, -2));

        Assertions.assertEquals(0, calcolo.subtract(1, 1));
        System.out.println(calcolo.add(-1, -1));    }

    /**
     * 2:
     *
     *
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     *
     * Test the same kind of inputs as before as exercise 1
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     */
/*
    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        Calculator calculator = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));

        Assertions.assertEquals(12, calculator.multiply(2, 6));
        System.out.println(calculator.multiply(2,6));

        Assertions.assertEquals(10, calculator.divide(80, 8));
        System.out.println(calculator.divide(80, 8));
    }

    /**
     * 3:
     *
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     * Don't just write tests that use the result of the program as the expected!!
     */
/*
    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Calculator calculator = new Calculator();

        Assertions.assertTrue((calculator.power(3, 2) == 9));
        System.out.println(calculator.power(3,2));

        Assertions.assertTrue((calculator.power(0, 3) == 1));
        System.out.println(calculator.power(0, 3));

        Assertions.assertFalse((calculator.power(5.3, 2) == 28.09));
        System.out.println(calculator.power(5.3, 2));

        Assertions.assertTrue((calculator.power(-12.6, 3) == 9.733570762733526E-7));
        System.out.println(calculator.power(-12.6, 3));

        System.out.println();

        Assertions.assertFalse((calculator.power(-12.6, 0) == 10));
        System.out.println(calculator.power(-12.6, 0));

        Assertions.assertFalse(calculator.power(4, -2) == 0.0625);
        System.out.println(calculator.power(4, -2));

        Assertions.assertFalse(calculator.power(4.50, 2) == 20.25);
        System.out.println(calculator.power(4.50, 2));

        Assertions.assertFalse(calculator.power(4, 2.50) == 32);
        System.out.println(calculator.power(4, 2.50));

    }
}
*/