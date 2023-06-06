package org.example.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhatCenturyTest {

	@Test
	public void testSomething() {
		assertEquals("20th", WhatCentury.whatCentury(1999));
		assertEquals("21st", WhatCentury.whatCentury(2011));
		assertEquals("22nd", WhatCentury.whatCentury(2154));
		assertEquals("23rd", WhatCentury.whatCentury(2259));
	}
}