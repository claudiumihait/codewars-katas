package org.example.kata;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveParenthesesTest {

	@Test
	public void basicTests() {
		String[][] testData = {
				{"example(unwanted thing)example", "exampleexample"},
				{"example(unwanted thing)example", "exampleexample"},
				{"example (unwanted thing) example", "example  example"},
				{"a (bc d)e", "a e"},
				{"a(b(c))", "a"},
				{"hello example (words(more words) here) something", "hello example  something"},
				{"(first group) (second group) (third group)", "  "}
		};

		for (String[] trial : testData) {
			String input = trial[0];
			String expected = trial[1];

			String actual = RemoveParentheses.removeParentheses(input);

			assertEquals(expected, actual);
		}
	}
}