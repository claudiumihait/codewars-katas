package org.example.kata;

import static java.lang.Math.ceil;
import static java.lang.Math.min;

/*
	Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').

	Examples:

	* 'abc' =>  ['ab', 'c_']
	* 'abcdef' => ['ab', 'cd', 'ef']
 */
public class SplitStrings {

	public static String[] stringSplit(String s) {
		String[] result = new String[(int) ceil(s.length() / 2.0)];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < result.length; i++) {
			int start = i * 2;
			int end = min(start + 2, s.length());
			sb.append(s, start, end);
			if (sb.length() < 2) {
				sb.append("_");
			}
			result[i] = sb.toString();
			sb.setLength(0);
		}

		return result;
	}
}
