package org.example.cycles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalculatingTest {

    @Test
    public void testCalc() {
        Calculating service = new Calculating();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int actual = service.calculate(income, expenses,threshold);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
}