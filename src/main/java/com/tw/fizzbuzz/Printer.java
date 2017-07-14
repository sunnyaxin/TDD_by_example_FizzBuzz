package com.tw.fizzbuzz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Printer {


    private final BuzzMatcher buzzMatcher = new BuzzMatcher();
    private final FizzMatcher fizzMatcher = new FizzMatcher();
    private final FizzBuzzMatcher fizzBuzzMatcher = new FizzBuzzMatcher(fizzMatcher, buzzMatcher);

    private List<Matcher> matchers = Arrays.asList(fizzMatcher, buzzMatcher);

    Printer() {
        //noinspection unchecked
        Collections.sort(matchers);
    }

    String fizzbuzz(int digit) {
        String result = "";
        for (Matcher matcher : matchers) {
            if (matcher.isMatched(digit)) {
                result += matcher.getText();
            }
        }
        return result.isEmpty()? String.valueOf(digit) : result;
    }

}