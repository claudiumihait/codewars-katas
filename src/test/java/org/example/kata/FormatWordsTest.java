package org.example.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FormatWordsTest {

	@Test
	public void sampleTests() {
		assertEquals("one, two, three and four", FormatWords.formatWords(new String[]{"one", "two", "three", "four"}));
		assertEquals("one", FormatWords.formatWords(new String[]{"one"}));
		assertEquals("one and three", FormatWords.formatWords(new String[]{"one", "", "three"}));
		assertEquals("three", FormatWords.formatWords(new String[]{"", "", "three"}));
		assertEquals("one and two", FormatWords.formatWords(new String[]{"one", "two", ""}));
		assertEquals("", FormatWords.formatWords(new String[]{}));
		assertEquals("", FormatWords.formatWords(null));
		assertEquals("", FormatWords.formatWords(new String[]{""}));
	}
}