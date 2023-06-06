package org.example.kata;

import static java.lang.Math.ceil;

/*
	Return the century of the input year. The input will always be a 4 digit string, so there is no need for validation.

	Examples
	"1999" --> "20th"
	"2011" --> "21st"
	"2154" --> "22nd"
	"2259" --> "23rd"
	"1124" --> "12th"
	"2000" --> "20th"
 */
public class WhatCentury {

	public static String whatCentury(int year) {
		String century = String.valueOf((int) ceil(year / 100.0));
		String suffix;

		if (century.endsWith("11") || century.endsWith("12") || century.endsWith("13")) {
			suffix = "th";
		} else {
			switch (century.charAt(century.length() - 1)) {
				case '1' -> suffix = "st";
				case '2' -> suffix = "nd";
				case '3' -> suffix = "rd";
				default -> suffix = "th";
			}
		}

		return century + suffix;
	}
}
