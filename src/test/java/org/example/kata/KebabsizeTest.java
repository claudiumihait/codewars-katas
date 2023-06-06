package org.example.kata;

import org.junit.Test;

import static org.example.kata.Kebabsize.kebabize;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KebabsizeTest {

	@Test
	public void fixedTests() {
		assertEquals("my-camel-cased-string", kebabize("myCamelCasedString"));
		assertEquals("my-camel-has-humps", kebabize("myCamelHas3Humps"));
	}
}