package CheckPerm;

import java.util.Arrays;

public class CheckPermutation {

	public static void main(String[] args) {
		String[][] w = { { "abba", "baba" }, { "paul", "brett" }, { "cbc", "ccb" } };
		for (String[] w1 : w) {
			String word1 = w1[0];
			String word2 = w1[1];
			boolean check = permutation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + check);
		}
	}

	//sort the strings into chars return string
	public static String sort(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

	//check if the strings are the same length return true/false
	public static boolean permutation(String s1, String s2) {
		return sort(s1).equals(sort(s2));
	}

}
