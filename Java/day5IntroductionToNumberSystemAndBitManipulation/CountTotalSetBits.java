package day5IntroductionToNumberSystemAndBitManipulation;
/*
 Given a positive integer A, the task is to count the total number of set bits in the binary representation of all the numbers from 1 to A.

Return the count modulo 109 + 7.
 */

public class CountTotalSetBits {
	
	public int solve(int A) {
		long N = A + 1;
		long mod = 1000000007;
		long ans = 0;
		long pow2 = 1;
		for ( int i = 0; i < 32; i++ ) {
			ans += ((N / (pow2 << 1)) * pow2) % mod + Math.max(0, N % (pow2 << 1) - pow2);
			ans %= mod;
			pow2 <<= 1;
		}
		return (int) ans;
	}
}
