package it.euris.ires;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class CalculatorTest {

    Calculator calculator; //instanza di classe perché con il BeforeEach creerò un nuovo calcolatore ad ogni test

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    //TEST CON PATTERN ARRANGE-ACT-ASSERT
    @Test
    @DisplayName("1 + 2 = 3 ---- nome test")
    void addsTwoNumbers() {
        //arrange
        int numberA = 1;
        int numberB = 2;
        int expectedResult = 3;
        //act
        int result = calculator.add(1, 2);
        //assert
        assertEquals(expectedResult, result, String.format("%s + %s should equal %s", numberA, numberB, expectedResult));
    }

    @Test
    @DisplayName("5 - 2 = 3 ---- nome test")
    void subTwoNumbers() {
        assertEquals(3, calculator.sub(5, 2), "5 - 2 should equal 3");
    }

    @Test
    @DisplayName("GIVEN the .multiply() method WHEN the factors are  2 and 3 THEN the result should be 6")
    void multiplyTwoNumbers(){
        //arrange
        int numberA = 2;
        int numberB = 3;
        int expectedResult = 6;
        //act
        int result = calculator.multiply(numberA, numberB);
        //assert
        assertEquals(expectedResult, result, String.format("%s * %s = %s", numberA, numberB, expectedResult));
    }

    @Test
    void givenDivideWhenFirstNumberIs6AndSecondNumberIs2ThenResultIs3(){
        //arrange
        int numberA = 6;
        int numberB = 2;
        int expectedResult = 3;
        //act
        double result = calculator.divide(numberA, numberB);
        //assert
        assertEquals(expectedResult, result, String.format("%s / %s = %s", numberA, numberB, expectedResult));
    }
}
