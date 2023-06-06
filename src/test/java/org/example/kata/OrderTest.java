package org.example.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderTest {

	@Test
	public void test1() {
		assertEquals(Order.order("is2 Thi1s T4est 3a"), "Thi1s is2 3a T4est");
	}

	@Test
	public void test2() {
		assertEquals(Order.order("4of Fo1r pe6ople g3ood th5e the2"), "Fo1r the2 g3ood 4of th5e pe6ople");
	}

	@Test
	public void test3() {
		assertEquals("Empty input should return empty string", Order.order(""), "");
	}
}