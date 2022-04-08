package day4_Introduction_to_problem_solving;

import java.util.ArrayList;
import java.util.Arrays;

/*
You are given an array of distinct integers A, you have to find and return all elements in array which have at-least two greater elements than themselves.

NOTE: The result should have the order in which they are present in the original array.
 */

public class ElementsWhichHaveAtleastTwoGreaterElements {
	
	public static void main(String[] args) {
		System.out.println(new ElementsWhichHaveAtleastTwoGreaterElements()
							   .solve(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 5, 5)))
							   .toString());
	}
	
	public ArrayList<Integer> solve(ArrayList<Integer> A) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for ( Integer i : A ) {
			if (i > max2) {
				if (i > max1) {
					max2 = max1;
					max1 = i;
				} else if (i < max1) {
					max2 = i;
				}
			}
		}
		
		ArrayList<Integer> elementsToRemove = new ArrayList<>();
		for ( Integer i : A ) {
			if (i == max1 || i == max2) {
				elementsToRemove.add(i);
			}
		}
		A.removeAll(elementsToRemove);
		
		return A;
	}
	
}
