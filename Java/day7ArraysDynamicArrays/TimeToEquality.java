package day7ArraysDynamicArrays;
/*
 
 */

import java.util.ArrayList;
import java.util.Collections;

public class TimeToEquality {
	
	public int solve(ArrayList<Integer> A) {
		int result = 0;
		int max = Collections.max(A);
		for ( int i :
			A ) {
			result += max - i;
		}
		return result;
	}
	
}
