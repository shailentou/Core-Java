package com.shail.common.Sorting;

import java.util.Comparator;

public   class ReverseSorting<T> implements Comparator<NotComparable>{
	
	

	@Override
	public  int compare(NotComparable o1, NotComparable o2) {
		
		return  o2.i - o1.i;
	}


}
