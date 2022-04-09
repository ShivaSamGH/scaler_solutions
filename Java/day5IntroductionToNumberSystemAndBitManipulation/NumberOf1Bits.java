package day5IntroductionToNumberSystemAndBitManipulation;
/*
 Write a function that takes an integer and returns the number of 1 bits it has.
 */

public class NumberOf1Bits {
	
	public int numSetBits(int A) {
		int count = 0;
		while (A > 0) {
			A = A & (A - 1);
			count++;
		}
		return count;
	}
	
}
