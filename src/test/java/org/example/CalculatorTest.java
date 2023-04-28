package org.example;

import io.qase.api.annotation.QaseTitle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    @QaseTitle ("add")
      public void add() {

        // Given
        Calculator calculator = new Calculator();
        int term1 = 10;
        int term2 = 5;

        // When
        int sum = calculator.add(term1, term2);

        // Then
        assertEquals(15, sum);
    }

    @Test
    @QaseTitle ("subtraction")
    public void subtraction() {

        // Given
        Calculator calculator = new Calculator ();
        int num1 = 25;
        int num2 = 5;

        // When
        int actual = num1 - num2;

        // Then
        assertEquals(20, actual);

    }

    @Test
    @QaseTitle ("multiplication")
    public void multiplication() {

        // Given
        Calculator calculator = new Calculator();
        int num3 = 5;
        int num4 = 5;

        // When
        int multiply = num3 * num4;

        // Then
        assertEquals(25, multiply);

    }

    @Test
    @QaseTitle ("division")
    public void division() {

        // Given
        Calculator calculator = new Calculator();
        int numerator = 10;
        int denominator = 0;
        int result;

        // When, Then
        try {
            result = numerator / denominator;
        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());
        }


    }
}

