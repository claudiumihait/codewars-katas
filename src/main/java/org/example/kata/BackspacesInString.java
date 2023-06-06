package org.example.kata;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Encrypt this!

You want to create secret messages which can be deciphered by the Decipher this! kata. Here are the conditions:

- Your message is a string containing space separated words.
- You need to encrypt each word in the message using the following rules:
  - The first letter must be converted to its ASCII code.
  - The second letter must be switched with the last letter.
- Keepin' it simple: There are no special characters in the input.

Examples:
- Kata.encryptThis("Hello") => "72olle"
- Kata.encryptThis("good") => "103doo"
- Kata.encryptThis("hello world") => "104olle 119drlo"
*/
public class BackspacesInString {

	public static String cleanString(String s) {
		if (s.isEmpty()) {
			return "";
		}

		Deque<Character> result = new ArrayDeque<>();

		for (char c : s.toCharArray()) {
			if (c == '#' && !result.isEmpty()) {
				result.pop();
			} else if (c != '#') {
				result.push(c);
			}
		}

		StringBuilder sb = new StringBuilder();
		while (!result.isEmpty()) {
			sb.append(result.pop());
		}

		return sb.reverse().toString();
	}
}
