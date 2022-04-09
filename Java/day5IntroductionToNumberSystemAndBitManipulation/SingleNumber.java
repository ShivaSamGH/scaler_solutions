package day5IntroductionToNumberSystemAndBitManipulation;

import java.util.List;

/*
Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.

NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class SingleNumber {
	
	public int singleNumber(final List<Integer> A) {
		int result = 0;
		for ( int i : A ) {
			result ^= i;
		}
		return result;
	}
	
}
