package org.example.kata;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class LongestConsecutiveRepetitionTest {

	@Test
	public void exampleTests() {
		assertArrayEquals(new Object[]{"a", 4}, LongestConsecutiveRepetition.longestRepetition("aaaabb"));
		assertArrayEquals(new Object[]{"a", 4}, LongestConsecutiveRepetition.longestRepetition("bbbaaabaaaa"));
		assertArrayEquals(new Object[]{"u", 3}, LongestConsecutiveRepetition.longestRepetition("cbdeuuu900"));
		assertArrayEquals(new Object[]{"b", 5}, LongestConsecutiveRepetition.longestRepetition("abbbbb"));
		assertArrayEquals(new Object[]{"a", 2}, LongestConsecutiveRepetition.longestRepetition("aabb"));
		assertArrayEquals(new Object[]{"", 0}, LongestConsecutiveRepetition.longestRepetition(""));
	}
}
