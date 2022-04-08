package day4_Introduction_to_problem_solving;

import java.util.ArrayList;
/*
You are given an Array A of size N.

Find for how many elements, there is a strictly smaller element and a strictly greater element.
	
 */

public class SmallerAndGreater {
	
	public int solve(ArrayList<Integer> A) {
		if (A.size() < 3) {
			return 0;
		}
		
		int min_no = Integer.MAX_VALUE;
		int min_count = 0;
		int max_no = Integer.MIN_VALUE;
		int max_count = 0;
		
		for ( int i : A ) {
			if (i < min_no) {
				min_no = i;
				min_count = 1;
			} else if (i == min_no) {
				min_count++;
			}
			if (i > max_no) {
				max_no = i;
				max_count = 1;
			} else if (i == max_no) {
				max_count++;
			}
		}
		if (min_no == max_no) {
			return 0;
		}
		return A.size() - min_count - max_count;
		
	}
	
}
