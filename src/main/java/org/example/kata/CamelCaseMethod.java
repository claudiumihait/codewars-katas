package org.example.kata;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
	Write simple .camelCase method (camel_case function in PHP, CamelCase in C# or camelCase in Java) for strings. All words must have their first letter capitalized without spaces.

	For instance:

	camelCase("hello case"); // => "HelloCase"
	camelCase("camel case word"); // => "CamelCaseWord"
	Don't forget to rate this kata! Thanks :)
 */
public class CamelCaseMethod {

	public static String camelCase(String str) {
		return (str == null || str.isEmpty())
				? ""
				: Arrays.stream(str.trim().split("\\s+"))
				.map(word -> String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1).toLowerCase())
				.collect(Collectors.joining());
	}
}
