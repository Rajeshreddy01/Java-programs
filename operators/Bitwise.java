package operators;

public class Bitwise {

	public static void main(String[] args) {
		        // Sample integers
		        int a = 5;   // 0b0101
		        int b = 3;   // 0b0011

		        // Bitwise AND (&)
		        int andResult = a & b;
		        System.out.println("a & b: " + andResult); // 1 (0b0001)

		        // Bitwise OR (|)
		        int orResult = a | b;
		        System.out.println("a | b: " + orResult); // 7 (0b0111)

		        // Bitwise XOR (^)
		        int xorResult = a ^ b;
		        System.out.println("a ^ b: " + xorResult); // 6 (0b0110)

		        // Bitwise NOT (~)
		        int notA = ~a;
		        System.out.println("~a: " + notA); // -6 (in binary: 11111111...1010)

		        // Left Shift (<<)
		        int leftShift = a << 1;
		        System.out.println("a << 1: " + leftShift); // 10 (0b1010)

		        // Right Shift (>>)
		        int rightShift = a >> 1;
		        System.out.println("a >> 1: " + rightShift); // 2 (0b0010)

		        // Unsigned Right Shift (>>>)
		        int unsignedRightShift = a >>> 1;
		        System.out.println("a >>> 1: " + unsignedRightShift); // 2 (0b0010)

		        // Additional Example
		        int x = -10; // 0b11111111...0110 (in 32-bit representation)
		        int rightShiftNegative = x >> 1;
		        System.out.println("x >> 1 (negative): " + rightShiftNegative); // -5

		        int unsignedRightShiftNegative = x >>> 1;
		        System.out.println("x >>> 1 (negative): " + unsignedRightShiftNegative); // 2147483645 (32-bit)

	}

}
