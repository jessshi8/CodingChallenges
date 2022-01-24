package staging;

import java.util.regex.Pattern;

public class ValidPIN {
	
	public static boolean validate(String pin) {
		Pattern fourDigits = Pattern.compile("[0-9]{4}");
		Pattern sixDigits = Pattern.compile("[0-9]{6}");
		return fourDigits.matcher(pin).matches() || sixDigits.matcher(pin).matches();
	}
	
	public static void main(String[] args) {
		System.out.println(validate("121317")); // true
		System.out.println(validate("1234"));	// true
		System.out.println(validate("45135"));	// false
		System.out.println(validate("89abc1"));	// false
		System.out.println(validate("900876"));	// true
		System.out.println(validate(" 4983"));	// false
	}

}
