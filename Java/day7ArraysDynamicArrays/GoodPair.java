package day7ArraysDynamicArrays;
/*
 
 */

import java.util.ArrayList;

public class GoodPair {
	
	public int solve(ArrayList<Integer> A, int B) {
		
		for ( int i = 0; i < A.size(); i++ ) {
			for ( int j = 0; j < A.size(); j++ ) {
				if (i == j) {
					continue;
				}
				if (A.get(i) + A.get(j) == B) {
					return 1;
				}
			}
		}
		
		return 0;
	}
}
