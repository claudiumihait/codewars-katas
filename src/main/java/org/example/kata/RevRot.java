package org.example.kata;

import java.util.ArrayList;
import java.util.List;

/*
	The input is a string str of digits. Cut the string into chunks (a chunk here is a substring of the initial string) of size sz (ignore the last chunk if its size is less than sz).

	If a chunk represents an integer such as the sum of the cubes of its digits is divisible by 2, reverse that chunk; otherwise rotate it to the left by one position. Put together these modified chunks and return the result as a string.

	If

	sz is <= 0 or if str is empty return ""
	sz is greater (>) than the length of str it is impossible to take a chunk of size sz hence return "".
	Examples:
	revrot("123456987654", 6) --> "234561876549"
	revrot("123456987653", 6) --> "234561356789"
	revrot("66443875", 4) --> "44668753"
	revrot("66443875", 8) --> "64438756"
	revrot("664438769", 8) --> "67834466"
	revrot("123456779", 8) --> "23456771"
	revrot("", 8) --> ""
	revrot("123456779", 0) --> ""
	revrot("563000655734469485", 4) --> "0365065073456944"
	Example of a string rotated to the left by one position:
	s = "123456" gives "234561".
 */
public class RevRot {
	public static String revRot(String strng, int sz) {
		if (sz <= 0 || strng.isEmpty() || sz > strng.length()) {
			return "";
		}

		List<String> chunks = new ArrayList<>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0, j = 0; i < strng.length(); i++) {
			if (j < sz) {
				sb.append(strng.charAt(i));
				j++;
			} else {
				j = 0;
				chunks.add(sb.toString());
				sb.setLength(0);
				sb.append(strng.charAt(i));
				j++;
			}
		}

		chunks.add(sb.toString());

		if (chunks.get(chunks.size() - 1).length() < sz) {
			chunks.remove(chunks.size() - 1);
		}

		List<String> updatedChunks = new ArrayList<>();

		for (String chunk : chunks) {
			int sum = 0;
			for (int j = 0; j < chunk.length(); j++) {
				sum += Math.pow(Integer.parseInt(String.valueOf(chunk.charAt(j))), 3);
			}

			if (sum % 2 == 0) {
				StringBuilder sb2 = new StringBuilder(chunk);
				sb2.reverse();
				updatedChunks.add(sb2.toString());
			} else {
				String first = String.valueOf(chunk.charAt(0));
				String remaining = chunk.substring(1);
				String toAdd = remaining + first;
				updatedChunks.add(toAdd);
			}
		}

		return String.join("", updatedChunks);
	}
}
