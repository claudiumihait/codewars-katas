package org.example.kata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
	You will be given a number and you will need to return it as a string in Expanded Form. For example:

	Kata.expandedForm(12); # Should return "10 + 2"
	Kata.expandedForm(42); # Should return "40 + 2"
	Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
	NOTE: All numbers will be whole numbers greater than 0.
 */
public class NumberInExpandedForm {

	public static String expandedForm(int num) {
		List<Integer> digits = new ArrayList<>();

		while (num > 0) {
			digits.add(num % 10);
			num /= 10;
		}

		List<String> expandedDigits = new ArrayList<>();

		for (int i = 0; i < digits.size(); i++) {
			int digit = digits.get(i);

			if (digit != 0) {
				int expandedDigit = digit * (int) Math.pow(10, i);
				expandedDigits.add(String.valueOf(expandedDigit));
			}
		}

		Collections.reverse(expandedDigits);

		return String.join(" + ", expandedDigits);
	}
}
