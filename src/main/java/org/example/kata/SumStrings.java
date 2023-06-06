package org.example.kata;

/*
	Given the string representations of two integers, return the string representation of the sum of those integers.

	For example:

	sumStrings('1','2') // => '3'
	A string representation of an integer will contain no characters besides the ten numerals "0" to "9".

 */
public class SumStrings {

	public static String add(String a, String b) {
		StringBuilder reversedNum1 = new StringBuilder(a).reverse();
		StringBuilder reversedNum2 = new StringBuilder(b).reverse();
		String smallestNum = a.length() < b.length() ? a : b;
		String largestNum = a.length() > b.length() ? a : b;
		String remainingFromLargest = largestNum.substring(0, largestNum.length() - smallestNum.length());
		StringBuilder result = new StringBuilder();
		int carry = 0;

		for (int i = 0; i < smallestNum.length(); i++) {
			int digit1 = reversedNum1.charAt(i) - '0';
			int digit2 = reversedNum2.charAt(i) - '0';
			int sum = digit1 + digit2 + carry;
			result.insert(0, sum % 10);
			carry = sum / 10;
		}

		for (int i = remainingFromLargest.length() - 1; i >= 0; i--) {
			int digit = remainingFromLargest.charAt(i) - '0';
			int sum = digit + carry;
			result.insert(0, sum % 10);
			carry = sum / 10;
		}

		if (carry != 0) {
			result.insert(0, carry);
		}

		while (result.length() > 1 && result.charAt(0) == '0') {
			result.deleteCharAt(0);
		}

		return result.toString();
	}
}
