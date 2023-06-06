package org.example.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BackspacesInStringTest {

	@Test
	public void testCleanString() {
		assertEquals("ac", BackspacesInString.cleanString("abc#d##c"));
		assertEquals("", BackspacesInString.cleanString("abc####d##c#"));
	}
}