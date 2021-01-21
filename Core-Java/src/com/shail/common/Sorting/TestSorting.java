package com.shail.common.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class TestSorting {

	@Test
	public void sortNotComparable() {
		final List<NotComparable> objects= new ArrayList<>();
		
		for(int i=0; i<10;i ++) {
			objects.add(new NotComparable(i));
		}
		Arrays.sort(objects.toArray());
	}
	
		
}

public  class NotComparable implements Comparator<T>{
	
	private int i;
	
	private  NotComparable( int i) {
		this.i=i;
	}

	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
