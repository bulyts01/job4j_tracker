package ru.job4j.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class FunctionCalculatorTest {

    @Test
    void whenLinearFunctionThenLinearResults() {
        var result = new FunctionCalculator().diapason(5, 8, x -> 2 * x + 1);
        var expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result).containsAll(expected);
    }

    @Test
    void whenSquareFunctionThenLinearResults() {
        var result = new FunctionCalculator().diapason(1, 4, x -> x * x);
        var expected = Arrays.asList(1D, 4D, 9D);
        assertThat(result).containsAll(expected);
    }

    @Test
    void whenExpFunctionThenLinearResults() {
        var result = new FunctionCalculator().diapason(1, 4, x -> Math.pow(3, x));
        var expected = Arrays.asList(3D, 9D, 27D);
        assertThat(result).containsAll(expected);
    }

}
