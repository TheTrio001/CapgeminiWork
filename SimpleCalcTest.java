package com.yash.tdd_demo.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCalcTest {

	@Test
	public void test_calculate_StringReturnZero() {
		SimpleCalculator simplecalculator = new SimpleCalculator();
		int result = simplecalculator.checkValue(" ");
		assertEquals(0,result);
	}
//	@Test
	//public void test_calculate_

}
