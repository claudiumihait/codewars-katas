package org.example.kata;

import java.util.Arrays;
import java.util.List;

/*
	Complete the method so that it formats the words into a single comma separated value. The last word should be separated by the word 'and' instead of a comma. The method takes in an array of strings and returns a single formatted string.

	Note:

	Empty string values should be ignored.
	Empty arrays or null/nil/None values being passed into the method should result in an empty string being returned.
	Example: (Input --> output)

	['ninja', 'samurai', 'ronin'] --> "ninja, samurai and ronin"
	['ninja', '', 'ronin'] --> "ninja and ronin"
	[] -->""
 */
public class FormatWords {

	public static String formatWords(String[] words) {
		if (words == null || words.length == 0) return "";

		List<String> noEmptyStrings = Arrays.stream(words)
				.filter(s -> !s.isEmpty())
				.toList();

		if (noEmptyStrings.isEmpty()) return "";

		return noEmptyStrings.stream()
				.reduce((a, b) -> noEmptyStrings.indexOf(b) == noEmptyStrings.size() - 1
						? a + " and " + b
						: a + ", " + b)
				.orElse("");
	}
}
