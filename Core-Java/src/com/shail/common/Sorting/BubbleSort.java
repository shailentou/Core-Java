package com.shail.common.Sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BubbleSort {

	public static void main(String[] args) {

		boolean switchNeeded = true;
		int[] unsorted = { 9, 3, 1, 5, 2, 6 };

		do {
			switchNeeded = false;
			for (int i = 0; i < unsorted.length - 1; i++) {

				if (unsorted[i] > unsorted[i + 1]) {
					System.out.println(unsorted[i] + " switching needed" + unsorted[i + 1]);
					int temp = unsorted[i];
					unsorted[i] = unsorted[i + 1];
					unsorted[i + 1] = temp;
					switchNeeded = true;
				}

			}
		} while (switchNeeded);
		
		List<Integer> number=Arrays.stream(unsorted).boxed().collect(Collectors.toList());
		number.forEach( System.out::print);
	}
	
	//unsorted

}
