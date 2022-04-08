package day4_Introduction_to_problem_solving;

import java.util.ArrayList;
import java.util.Collections;

/*
Print a Pattern According to The Given Value of A.
Example: For A = 3 pattern looks like:

1 0 0
1 2 0
1 2 3
 */
public class PatternPrinting1 {
	
	public ArrayList<ArrayList<Integer>> solve(int A) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		for ( int i = 1; i <= A; i++ ) {
			ArrayList<Integer> temp = new ArrayList<>();
			for ( int j = 1; j <= i; j++ ) {
				temp.add(j);
			}
			temp.addAll(Collections.nCopies(A - i, 0));
			result.add(temp);
		}
		
		return result;
	}
}
