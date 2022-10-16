package org.saigautam.problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CountPrimeTest {

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(1, 0),
                Arguments.of(3, 1),
                Arguments.of(10, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void test1(int input, int expectedOutput) {
        CountPrime countPrime = new CountPrime();
        assertEquals(expectedOutput, countPrime.countPrimes(input));
    }
}