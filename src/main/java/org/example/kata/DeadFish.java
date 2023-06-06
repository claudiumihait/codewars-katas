package org.example.kata;

import java.util.ArrayList;
import java.util.List;

/*
	Write a simple parser that will parse and run Deadfish.

	Deadfish has 4 commands, each 1 character long:

	i increments the value (initially 0)
	d decrements the value
	s squares the value
	o outputs the value into the return array
	Invalid characters should be ignored.

	Deadfish.parse("iiisdoso") =- new int[] {8, 64};
 */
public class DeadFish {

	public static int[] parse(String data) {
		int n = 0;
		List<Integer> result = new ArrayList<>();
		for (char c : data.toCharArray()) {
			switch (c) {
				case 'i' -> n++;
				case 'd' -> n--;
				case 's' -> n *= n;
				case 'o' -> result.add(n);
			}
		}
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
}
