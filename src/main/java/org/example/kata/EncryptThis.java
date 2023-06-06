package org.example.kata;

/*
	You want to create secret messages which can be deciphered by the Decipher this! kata. Here are the conditions:

	Your message is a string containing space separated words.
	You need to encrypt each word in the message using the following rules:
	The first letter must be converted to its ASCII code.
	The second letter must be switched with the last letter
	Keepin' it simple: There are no special characters in the input.
	Examples:
	Kata.encryptThis("Hello") => "72olle"
	Kata.encryptThis("good") => "103doo"
	Kata.encryptThis("hello world") => "104olle 119drlo"
 */
public class EncryptThis {

	public static String encryptThis(String text) {
		String[] words = text.split(" ");
		StringBuilder encryptedText = new StringBuilder();

		for (String word : words) {
			if (word.length() == 1) {
				encryptedText
						.append(encryptedFirstLetter(word));
			} else if (word.length() == 2) {
				encryptedText
						.append(encryptedFirstLetter(word))
						.append(encryptedLastLetter(word));
			} else if (word.length() == 3) {
				encryptedText
						.append(encryptedFirstLetter(word))
						.append(encryptedSecondLetter(word))
						.append(encryptedLastLetter(word));
			} else if (word.length() > 3) {
				encryptedText
						.append(encryptedFirstLetter(word))
						.append(encryptedSecondLetter(word))
						.append(middleLetters(word))
						.append(encryptedLastLetter(word));
			}

			encryptedText.append(" ");
		}

		return encryptedText.toString().trim();
	}

	private static String encryptedFirstLetter(String word) {
		return String.valueOf((int) word.charAt(0));
	}

	private static String encryptedSecondLetter(String word) {
		return String.valueOf(word.charAt(word.length() - 1));
	}

	private static String encryptedLastLetter(String word) {
		return String.valueOf(word.charAt(1));
	}

	private static String middleLetters(String word) {
		return word.substring(2, word.length() - 1);
	}

}
