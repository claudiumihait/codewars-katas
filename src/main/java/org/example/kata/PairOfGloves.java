package org.example.kata;

import java.util.HashMap;
import java.util.Map;

/*
	Pair of gloves
	Winter is coming, you must prepare your ski holidays. The objective of this kata is to determine the number of pair of gloves you can constitute from the gloves you have in your drawer.

	Given an array describing the color of each glove, return the number of pairs you can constitute, assuming that only gloves of the same color can form pairs.

	Examples:
	input = ["red", "green", "red", "blue", "blue"]
	result = 2 (1 red pair + 1 blue pair)

	input = ["red", "red", "red", "red", "red", "red"]
	result = 3 (3 red pairs)
 */
public class PairOfGloves {

	public static int numberOfPairs(String[] gloves) {
		Map<String, Integer> counts = new HashMap<>();
		for (String s : gloves) {
			counts.put(s, counts.getOrDefault(s, 0) + 1);
		}

		int pairs = 0;
		for (int count : counts.values()) {
			pairs += count / 2;
		}

		return pairs;
	}
}
