package fr.fizzbuzz;



import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {
    private FizzBuzz fb;

    @BeforeEach
    public void setUp() {
        fb = new FizzBuzz();
    }

    @Test
    public void shouldReturn1IfNumberis1() {
        Assertions.assertThat(fb.generate(1, 1))
                .isEqualTo("1");
        ;
    }

    @Test
    public void shouldReturn2IfNumberis2() {
        assertThat(fb.generate(2, 2))
                .isEqualTo("2");
    }

    @Test
    public void shouldReturnFizzIfNumberis3() {
        Assertions.assertThat(fb.generate(3, 3))
                .isEqualTo("Fizz");
    }

    @Test
    public void shouldReturnFizzIfNumberis6() {
        Assertions.assertThat(fb.generate(6, 6))
                .isEqualTo("Fizz");
    }

    @Test
    public void shouldReturnFizzIfNumberis9() {
        Assertions.assertThat(fb.generate(9, 9))
                .isEqualTo("Fizz");
    }

    @Test
    public void shouldReturnBuzzIfNumberis5() {
        Assertions.assertThat(fb.generate(5, 5))
                .isEqualTo("Buzz");
    }

    @Test
    public void shouldReturnBuzzIfNumberis10() {
        Assertions.assertThat(fb.generate(10, 10))
                .isEqualTo("Buzz");
    }

    @Test
    public void shouldReturnFizzBuzzIfNumberis15() {
        Assertions.assertThat(fb.generate(15, 15))
                .isEqualTo("FizzBuzz");
    }

    @Test
    public void shouldReturnFizzBuzzIfNumberis30() {
        Assertions.assertThat(fb.generate(30, 30))
                .isEqualTo("FizzBuzz");
    }

    @Test
    public void shouldReturn12IfNumbersAre1And2() {
        Assertions.assertThat(fb.generate(1, 2))
                .isEqualTo("12");
    }

    @Test
    public void shouldReturn12FizzIfNumbersAre1to3() {
        Assertions.assertThat(fb.generate(1, 3))
                .isEqualTo("12Fizz");
    }

    @Test
    public void shouldReturn12Fizz4BuzzIfNumbersAre1to5() {
        Assertions.assertThat(fb.generate(1, 5))
                .isEqualTo("12Fizz4Buzz");
    }
}