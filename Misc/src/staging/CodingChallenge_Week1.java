package staging;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CodingChallenge_Week1 {
	/* 
	 * (1) A pronic number (or otherwise called as heteromecic) is a number 
	 * which is a product of two consecutive integers, that is, a number of 
	 * the form n(n + 1). Create a function that determines whether a number 
	 * is pronic or not.
	 */
	public static boolean isHeteromecic(int num) {
		List<Integer> factors = new ArrayList<>();
		
		if (num == 0) {
			return true;
		}
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				factors.add(i);
			}
		}
		
		for (int f : factors) {
			if (factors.contains(f+1) && (f*(f+1) == num)) {
				return true;
			}
		}
		return false;
	}
	
	/*
	 * 2) Given any number, we can create a new number by adding the sums 
	 * of squares of digits of that number. For example, given 203, our 
	 * new number is 4 + 0 + 9 = 13. If we repeat this process, we get a 
	 * sequence of numbers: 203 -> 13 -> 10 -> 1 -> 1
	 * Sometimes, like with 203, the sequence reaches (and stays at) 1. 
	 * 
	 * Numbers like this are called happy. Not all numbers are happy. 
	 * If we started with 11, the sequence would be:
	 * 11 -> 2 -> 4 -> 16 -> ...
	 * This sequence will never reach 1, and so the number 11 is called 
	 * unhappy. Given a positive whole number, you have to determine 
	 * whether that number is happy or unhappy.
	 */
	public static boolean happy(int num) {
		Set<Integer> tracker = new HashSet<>();
		while(true) {
			num = squareSum(num);
			if (num == 1) {
				return true;
			} else if (tracker.contains(num)) {
				return false;
			} else {
				tracker.add(num);
			}
		}
	}
	
	// Helper method
	public static int squareSum(int num) {
		int sum = 0;
		
		while (num > 0) {
			sum += Math.pow(num % 10, 2);
			num /= 10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(isHeteromecic(0)); // true
		System.out.println(isHeteromecic(2)); // true
		System.out.println(isHeteromecic(7)); // false
		System.out.println(isHeteromecic(110)); // true
		System.out.println(isHeteromecic(136)); // false
		System.out.println(isHeteromecic(156)); // true
		System.out.println("============");
		System.out.println(happy(203)); // true
		System.out.println(happy(11)); // false
		System.out.println(happy(107)); // false
	}
}
