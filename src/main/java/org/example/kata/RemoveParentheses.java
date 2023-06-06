package org.example.kata;

/*
   Remove the parentheses

   In this kata, you are given a string, for example:

   "example(unwanted thing)example"

   Your task is to remove everything inside the parentheses as well as the parentheses themselves.

   The example above would return:

   "exampleexample"

   Notes:
   - Other than parentheses, only letters and spaces can occur in the string.
   - Don't worry about other brackets like "[]" and "{}" as these will never appear.
   - There can be multiple parentheses.
   - The parentheses can be nested.
*/
public class RemoveParentheses {

	public static String removeParentheses(final String str) {
		StringBuilder sb = new StringBuilder();
		int parenthesesCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				parenthesesCount++;
			} else if (str.charAt(i) == ')') {
				parenthesesCount--;
			} else if (parenthesesCount == 0) {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
}
