package lesson14;

import org.example.lesson14_testng.FactorialCalculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TestCaseTestNG {
    @DataProvider(name = "factorialDataProvider")
    public Object[][] factorialDataProvider() {
        return new Object[][]{
                {0, 1},    // Факториал 0
                {1, 1},    // Факториал 1
                {3, 6},    // Факториал 3
                {5, 120}   // Факториал 5
        };
    }

    @Test(dataProvider = "factorialDataProvider")
    public void testFactorial(int input, long expected) {
        assertEquals(FactorialCalculator.calculateFactorial(input), expected);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        FactorialCalculator.calculateFactorial(-1);
    }

}
