package com.shail.common.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class TestSorting {

	@Test
	public void sortNotComparable() {
		final List<NotComparable> objects= new ArrayList<>();
		
		for(int i=0; i<10;i ++) {
			objects.add(new NotComparable(i));
		}
		Collections.sort(objects, new ReverseSorting());
		
		System.out.println(objects);
	}
	
	
}

