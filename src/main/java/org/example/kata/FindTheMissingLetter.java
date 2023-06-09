package org.example.kata;

/*
	Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.

	You will always get a valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
	The array will always contain letters in only one case.

	Example:

	['a','b','c','d','f'] -> 'e'
	['O','Q','R','S'] -> 'P'
	(Use the English alphabet with 26 letters!)
 */
public class FindTheMissingLetter {

	public static char findMissingLetter(char[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] != array[i + 1] - 1) {
				return (char) (array[i] + 1);
			}
		}
		return 0;
	}
}
