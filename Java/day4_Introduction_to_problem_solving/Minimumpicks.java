package day4_Introduction_to_problem_solving;

import java.util.ArrayList;
/*
You are given an array of integers A of size N.
Return the difference between the maximum among all even numbers of A and the minimum among all odd numbers in A.
 */

public class Minimumpicks {
	
	public int solve(ArrayList<Integer> A) {
		
		int max_even = Integer.MIN_VALUE;
		int min_odd = Integer.MAX_VALUE;
		
		for ( Integer i : A ) {
			if (i % 2 == 0 && i > max_even) {
				max_even = i;
			} else if (i % 2 != 0 && i < min_odd) {
				min_odd = i;
			}
		}
		
		return max_even - min_odd;
		
	}
	
}
