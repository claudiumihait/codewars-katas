package org.example.kata;

/*
	For a given string s find the character c (or C) with longest consecutive repetition and return:

	Object[]{c, l};
	where l (or L) is the length of the repetition. If there are two or more characters with the same l return the first in order of appearance.

	For empty string return:

	Object[]{"", 0}
 */
public class LongestConsecutiveRepetition {

	public static Object[] longestRepetition(String s) {
		int longestRepeatedCounter = 0;
		String longestRepeated = "";
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			String character = String.valueOf(s.charAt(i));
			String nextCharacter = String.valueOf(s.charAt(i + 1));
			if (character.equals(nextCharacter)) {
				count++;
				if (count > longestRepeatedCounter) {
					longestRepeatedCounter = count;
					longestRepeated = character;
				}
			} else {
				count = 1;
			}
		}
		return new Object[]{longestRepeated, longestRepeatedCounter};
	}
}
