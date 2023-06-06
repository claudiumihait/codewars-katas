package org.example.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumStringsTest {

	@Test
	void testAdd() {
		assertEquals("579", SumStrings.add("123", "456"));
	}

	@Test
	void testAddWithZero() {
		assertEquals("123", SumStrings.add("123", "0"));
		assertEquals("456", SumStrings.add("0", "456"));
		assertEquals("0", SumStrings.add("0", "0"));
	}

	@Test
	void testAddLargeNumbers() {
		String number1 = "99999999999999999999999999999999999999999999999999";
		String number2 = "1";
		String expected = "100000000000000000000000000000000000000000000000000";
		assertEquals(expected, SumStrings.add(number1, number2));
	}
}
