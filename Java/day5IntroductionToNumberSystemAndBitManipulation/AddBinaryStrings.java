package day5IntroductionToNumberSystemAndBitManipulation;
/*
 Given two binary strings, return their sum (also a binary string).
 */

public class AddBinaryStrings {
	
	public String addBinary(String A, String B) {
		if (A.length() > B.length()) {
			B = new String(new char[A.length() - B.length()]).replace('\0', '0') + B;
		} else if (A.length() < B.length()) {
			A = new String(new char[B.length() - A.length()]).replace('\0', '0') + A;
		}
		StringBuilder result = new StringBuilder();
		char carry = '0';
		for ( int i = A.length() - 1; i >= 0; i-- )
			switch ("" + carry + A.charAt(i) + B.charAt(i)) {
				case ("000") -> {
					result.insert(0, "0");
					carry = '0';
				}
				case ("001"), ("010"), ("100") -> {
					result.insert(0, "1");
					carry = '0';
				}
				case ("011"), ("101"), ("110") -> {
					result.insert(0, "0");
					carry = '1';
				}
				case ("111") -> {
					result.insert(0, "1");
					carry = '1';
				}
			}
		if (carry == '1') {
			result.insert(0, "1");
		}
		
		return result.toString();
	}
	
	
}
