package com.fati.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void testDivide(){
        Calculator calculator = new Calculator();
        int result= calculator.divide(6, 3);
        assertThat(result).isEqualTo(2);
             }
}
