package org.example.kata;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
	In this kata, you have an input string and you should check whether it is a valid message. To decide that, you need to split the string by the numbers, and then compare the numbers with the number of characters in the following substring.

	For example "3hey5hello2hi" should be split into 3, hey, 5, hello, 2, hi and the function should return true, because "hey" is 3 characters, "hello" is 5, and "hi" is 2; as the numbers and the character counts match, the result is true.

	Notes:

	Messages are composed of only letters and digits
	Numbers may have multiple digits: e.g. "4code13hellocodewars" is a valid message
	Every number must match the number of character in the following substring, otherwise the message is invalid: e.g. "hello5" and "2hi2" are invalid
	If the message is an empty string, you should return true
 */
public class MessageValidator {

	public static boolean isAValidMessage(String message) {

		if (message.equals("") || message.equals("0")) return true;

		Pattern p = Pattern.compile("[a-zA-z]+|\\d+");
		Matcher m = p.matcher(message);
		ArrayList<String> allMatches = new ArrayList<>();

		while (m.find()) {
			allMatches.add(m.group());
		}

		String lastElt = allMatches.get(allMatches.size() - 1);
		String firstElt = allMatches.get(0);

		try {
			int last = Integer.parseInt(lastElt);
			return false;
		} catch (NumberFormatException e) {
			System.out.println("last elt is numeric");
		}

		try {
			int first = Integer.parseInt(firstElt);
		} catch (NumberFormatException e) {
			System.out.println("first elt is a string");
			return false;
		}

		for (int i = 0; i < allMatches.size() - 1; i++)
			if (i % 2 == 0 && Integer.parseInt(allMatches.get(i)) != allMatches.get(i + 1).length()) return false;

		return true;
	}
}
