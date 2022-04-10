package day7ArraysDynamicArrays;
/*
 
 */

import java.util.ArrayList;

public class OddEvenSubsequences {
	
	public int solve(ArrayList<Integer> A) {
		int result = 1;
		int flag = A.get(0) & 1;
		for ( int i : A ) {
			if ((i & 1) != flag) {
				result++;
				flag ^= 1;
			}
		}
		return result;
	}
	
}
