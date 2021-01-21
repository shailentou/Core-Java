package com.shail.common;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;


public class TestJunit {

	@Test
	public void testa() {
		
	}
	@Test
	public void testSort() {
		
		final int[] numbers=  {1,-2,-9, 0, 2};
		
		final int[] expected= {-9,-2,0, 1, 2};
		Arrays.sort(numbers);
		assertArrayEquals(numbers,expected);
	}
	
	
}
