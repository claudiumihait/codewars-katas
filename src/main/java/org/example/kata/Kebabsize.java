package org.example.kata;

/*
	Modify the kebabize function so that it converts a camel case string into a kebab case.

	"camelsHaveThreeHumps"  -->  "camels-have-three-humps"
	"camelsHave3Humps"  -->  "camels-have-humps"
	"CAMEL"  -->  "c-a-m-e-l"
	Notes:

	the returned string should only contain lowercase letters
 */
public class Kebabsize {

	public static String kebabize(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char character = str.charAt(i);
			if ((int) character >= 65 && (int) character <= 90) {
				sb.append("-").append(character);
			} else if ((int) character >= 97) {
				sb.append(character);
			}
		}
		return sb.toString().toLowerCase().replaceAll("^-", "");
	}
}
