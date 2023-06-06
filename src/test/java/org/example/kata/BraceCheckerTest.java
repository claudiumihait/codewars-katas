package org.example.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BraceCheckerTest {

	@Test
	public void testValid() {
		assertEquals(true, BraceChecker.isValid("()"));
	}

	@Test
	public void testInvalid() {
		assertEquals(false, BraceChecker.isValid("[(])"));
	}
}