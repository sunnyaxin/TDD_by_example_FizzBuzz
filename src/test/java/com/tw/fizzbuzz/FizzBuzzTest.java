package com.tw.fizzbuzz;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private final Printer printer = new Printer();

    @Test
    public void test_when_input_is_one() throws Exception {
        assertEquals("1", printer.fizzbuzz(1));
    }

    @Test
    public void test_when_input_is_three() throws Exception {
        assertEquals("fizz", printer.fizzbuzz(3));
    }

    @Test
    public void test_when_input_is_five() throws Exception {
        assertEquals("buzz", printer.fizzbuzz(5));
    }

    @Test
    public void test_when_input_is_fifteen() throws Exception {
        assertEquals("buzz", printer.fizzbuzz(15));
    }

    @Test
    public void test_when_input_is_seven() throws Exception {
        assertEquals("whizz", printer.fizzbuzz(7));
    }

    @Test
    public void test_output_for_number_which_match_fizz_number() throws Exception {
        assertEquals("fizz", printer.fizzbuzz(31));
        assertEquals("fizz", printer.fizzbuzz(13));
        assertEquals("fizz", printer.fizzbuzz(1357));
    }

    @Test
    public void test_output_for_number_which_match_buzz_number() throws Exception {
        assertEquals("buzz", printer.fizzbuzz(51));
        assertEquals("buzz", printer.fizzbuzz(105));
    }
}
