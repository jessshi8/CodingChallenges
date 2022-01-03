package staging;

public class Practice {
	/*
	 * WEEK 1:
	 * ----------
	 * JavaScript
	 * ----------
	 * (1) A boomerang is a V-shaped sequence that is either upright or upside down. 
	 * Specifically, a boomerang can be defined as: sub-array of length 3, with the 
	 * first and last digits being the same and the middle digit being different.
	 * 
	 * Some boomerang examples: [3, 7, 3], [1, -1, 1], [5, 6, 5]
	 * 
	 * Create a function that returns the total number of boomerangs in an array.
	 * 
	 * To illustrate: [3, 7, 3, 2, 1, 5, 1, 2, 2, -2, 2] 
	 * => 3 boomerangs in this sequence: [3, 7, 3], [1, 5, 1], [2, -2, 2]
	 * Be aware that boomerangs can overlap, like so: [1, 7, 1, 7, 1, 7, 1]
	 * => 5 boomerangs (from left to right): [1, 7, 1], [7, 1, 7], [1, 7, 1], 
	 * [7, 1, 7], and [1, 7, 1]
	 * Notes: [5, 5, 5] (triple identical digits) is NOT considered a boomerang 
	 * because the middle digit is identical to the first and last.
	 */
	public static int countBoomerangs(int arr[]) {
		return 0;
	}
	
	/*
	 * (2) Create a function which counts how many lone 1s appear in a given number. 
	 * Lone means the number doesn't appear twice or more in a row.
	 */
	public static int countLoneOnes(int num) {
		return 0;
	}
	
	/*
	 * ------
	 * PYTHON
	 * ------
	 * (1) A number is said to be Disarium if the sum of its digits raised to their 
	 * respective positions is the number itself. Create a function that determines 
	 * whether a number is a Disarium or not.
	 * 
	 * Note: Position of the digit is 1-indexed.
	 */
	public static boolean isDisarium(int num) {
		return false;
	}
	
	/*
	 * (2) The Atbash cipher is an encryption method in which each letter of a word 
	 * is replaced with its "mirror" letter in the alphabet: A <=> Z; B <=> Y; C <=> X; etc.
	 * Create a function that takes a string and applies the Atbash cipher to it.
	 * 
	 * Notes: 
	 * - Capitalization should be retained.
	 * - Non-alphabetic characters should not be altered.
	 */
	public static String atBash(String arg) {
		return "";
	}
	
	/*
	 * -------
	 * C#/.NET
	 * -------
	 * (1) This number sequence can start with any positive integer n. 
	 * s is the sum of the individual digits in n. 
	 * If s divides into n evenly then the next term of the series is n/s. 
	 * Otherwise the next term is n*s. Eventually the series will reach a 
	 * dead end with two numbers alternating: 
	 * 58, 754, 12064, 928, 17632, 928, 17632. 
	 * This series has a length of 5 with 17632 as the last term.
	 * 
	 * Compose a function that takes a positive integer and returns its 
	 * series length and its last term.
	 * 
	 * Note: All numbers in the sequence will be integers within the range 0 < n <= MAX VALUE
	 */
	public static int[] deadEnd(int num) {
		int[] result = {0, 0};
		return result;
	}
	
	public static void main(String[] args) {
		// countBoomerangs 
		int arr1[] = {9, 5, 9, 5, 1, 1, 1};
		int arr2[] = {5, 6, 6, 7, 6, 3, 9};
		int arr3[] = {4, 4, 4, 9, 9, 9, 9};
		System.out.println(countBoomerangs(arr1)); // 2
		System.out.println(countBoomerangs(arr2)); // 1
		System.out.println(countBoomerangs(arr3)); // 0
		System.out.println("==========================");
		// countLoneOnes
		System.out.println(countLoneOnes(101)); 	// 2
		System.out.println(countLoneOnes(1191));	// 1
		System.out.println(countLoneOnes(1111)); 	// 0
		System.out.println(countLoneOnes(462));  	// 0
		System.out.println("==========================");
		// isDisarium
		System.out.println(isDisarium(75));  // false
		System.out.println(isDisarium(135)); // true
		System.out.println(isDisarium(544)); // false
		System.out.println(isDisarium(518)); // true
		System.out.println(isDisarium(466)); // false
		System.out.println(isDisarium(8));   // true
		System.out.println("==========================");
		// atBash
		System.out.println(atBash("apple")); 		// zkkov
		System.out.println(atBash("Hello world!")); // Svool dlliow!
		System.out.println(atBash("Christmas is the 25th of December")); // Xsirhgnzh rh gsv 25gs lu Wvxvnyvi
		System.out.println("==========================");
		// deadEnd
		System.out.println(deadEnd(5));  // [2, 1]
		System.out.println(deadEnd(11)); // [7, 11440]
		System.out.println(deadEnd(123456789)); // [2, 5555555505]
		System.out.println(deadEnd(101)); // [9, 136804096]
		System.out.println("==========================");
	}
	
	
}
