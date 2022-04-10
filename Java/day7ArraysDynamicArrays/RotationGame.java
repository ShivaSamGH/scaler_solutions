package day7ArraysDynamicArrays;
/*
 
 */

import java.util.Arrays;
import java.util.Scanner;

public class RotationGame {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		a = Arrays.copyOfRange(a, 1, a.length);
		int b = sc.nextInt() % a.length;
		int[] result = new int[a.length];
		System.out.println(Arrays.toString(a));
		if (b >= 0) {
			System.arraycopy(a, a.length - b, result, 0, b);
		}
		if (a.length - b >= 0) {
			System.arraycopy(a, 0, result, b, a.length - b);
		}
		for ( int i :
			result ) {
			System.out.print(i + " ");
		}
	}
	
}
