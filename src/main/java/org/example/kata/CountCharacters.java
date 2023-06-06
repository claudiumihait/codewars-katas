package org.example.kata;

import java.util.HashMap;
import java.util.Map;

/*
	The main idea is to count all the occurring characters in a string. If you have a string like aba, then the result should be {'a': 2, 'b': 1}.

	What if the string is empty? Then the result should be empty object literal, {}.
 */
public class CountCharacters {

	public static Map<Character, Integer> count(String str) {
		Map<Character, Integer> result = new HashMap<>();
		for (char c : str.toCharArray()) {
			result.put(c, result.getOrDefault(c, 0) + 1);
		}

		return result;
	}
}
