package org.example.kata;

/*
	Count the number of Duplicates
	Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

	Example
	"abcde" -> 0 # no characters repeats more than once
	"aabbcde" -> 2 # 'a' and 'b'
	"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
	"indivisibility" -> 1 # 'i' occurs six times
	"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
	"aA11" -> 2 # 'a' and '1'
	"ABBA" -> 2 # 'A' and 'B' each occur twice
 */
public class CountingDuplicates {

	public static int duplicateCount(String text) {
		String textLower = text.toLowerCase();
		int count = 0;

		for (int i = 0; i < textLower.length(); i++) {
			if (textLower.indexOf(textLower.charAt(i)) != textLower.lastIndexOf(textLower.charAt(i))) {
				count++;
				String toReplace = String.valueOf(textLower.charAt(i));
				textLower = textLower.replaceAll(toReplace, "");
				i--;
			}
		}

		return count;
	}
}
