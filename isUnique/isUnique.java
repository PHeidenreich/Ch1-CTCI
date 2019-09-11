package isUnique;

public class isUnique {

	public static void main(String[] args) {

		String[] w = { "Paul", "Brett", "Art", "Cate", "Bill" };

		for (String w1 : w) {
			System.out.println(w1 + " is " + isUniqueChar(w1));
		}

	}

	public static boolean isUniqueChar(String str) {

		int val;
		boolean[] charSet = new boolean[128];

		for (int i = 0; i < str.length(); i++) {
			val = str.charAt(i);
			if (charSet[val])
				return false;
			charSet[val] = true;
		}
		return true;
	}

}
