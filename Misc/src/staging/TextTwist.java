package staging;

import java.util.HashSet;
import java.util.Set;

/*
 * In Text Twist, players try to score points by forming words using the letters from a 6-letter scrambled word. 
 * They win the round if they can successfully unscramble the 6-letter word.
 * Create a function that takes in an array of already-guessed words, the unscrambled 6-letter word and returns 
 * the total number of points the player scored in a particular round using the following rubric:
 * 	- 3-letter words are 1 pt
 * 	- 4-letter words are 2 pts
 * 	- 5-letter words are 3 pts
 * 	- 6-letter words are 4 pts + 50 pt bonus (for unscrambling the word)
 * 
 * Remember that invalid words (words that cannot be formed from the 6-letter unscrambled words) count as 0 pts.
 * Examples:
 * 		totalPoints(["cat", "create", "sat"], "caster") ➞ 2 	// Since "create" is an invalid word.
 * 		totalPoints(["trance", "recant"], "recant") ➞ 108		// Since "trance" and "recant" score 54 pts each.
 * 		totalPoints(["dote", "dotes", "toes", "set", 
 * 			"dot", "dots", "sted"], "tossed") ➞ 13				// Since 2 + 3 + 2 + 1 + 1 + 2 + 2 = 13
 * 
 * Notes: If a 6-letter word has multiple anagrams, count each 6-letter unscramble as an additional 54 pts. 
 * For example, if the word is arches, and the player guessed arches and chaser, add 108 pts for both words.
 */
public class TextTwist {

	public static int totalPoints(String[] words, String scramble) {
		int points = 0;

		for (String w : words) {
			Set<Character> letters = new HashSet<Character>();

			if (w.length() < 3 || w.length() > 6) {
				points += 0; // invalid length
			} else {
				int count = 0;
				for (char c : w.toCharArray()) {
					if (scramble.contains(c + "") && !letters.contains(c)) {
						letters.add(c);
						count++;

						if (count == w.length()) {
							switch (w.length()) {
							case 3:
								points += 1;
								break;
							case 4:
								points += 2;
								break;
							case 5:
								points += 3;
								break;
							case 6:
								points += 54;
								break;
							}
						}
					} else { // invalid word
						count = 0;
						break;
					}
				}
			}
		return points;
	}

	public static void main(String[] args) {
		System.out.println(totalPoints(new String[] { "cat", "create", "sat" }, "caster"));
		System.out.println(totalPoints(new String[] { "trance", "recant" }, "recant"));
		System.out.println(totalPoints(
				new String[] { "dote", "dotes", "toes", "set", "dot", "dots", "sted" }, "tossed"));
		System.out.println(totalPoints(new String[] { "arches", "chaser" }, "arches"));
	}

}
