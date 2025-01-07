package lesson14;

import jdk.jfr.Description;
import org.example.lesson14_junit_5.FactorialCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCaseJUnit5 {

    @Description("Тест для вычисления факторила числа 0 с использованием JUnit")
    @Test
    void testFactorialOfZero() {
        assertEquals(1, FactorialCalculator.calculateFactorial(0));
    }

    @Description("Тест для вычисления факторила положительных чисел с использованием JUnit")
    @Test
    void testFactorialOfPositiveNumber() {
        assertEquals(120, FactorialCalculator.calculateFactorial(5));
        assertEquals(6, FactorialCalculator.calculateFactorial(3));
        assertEquals(1, FactorialCalculator.calculateFactorial(1));
    }

    @Description("Тест для вычисления факторила отрицательного числа с использованием JUnit")
    @Test
    void testFactorialOfNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.calculateFactorial(-1);
        });
        assertEquals("Число должно быть неотрицательным", exception.getMessage());
    }
}


