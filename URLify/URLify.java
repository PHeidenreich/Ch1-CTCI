package URLify;

import java.util.Scanner;

public class URLify {

	public static String replaceSpaces(String str) {

		str = str.trim();
		int trueLength = str.length();

		if (str.contains(" ")) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') {
					trueLength = trueLength + 2;
				}
			}
		}
		char[] originalArr = str.toCharArray();
		char[] newArr = new char[trueLength];
		int j = 0;
		for (int i = 0; i < str.length(); i++) {
			if (originalArr[i] == ' ') {
				newArr[j] = '%';
				newArr[j + 1] = '2';
				newArr[j + 2] = '0';
				j += 3;
			} else {
				newArr[j] = originalArr[i];
				j++;
			}
		}
		str = new String(newArr, 0, trueLength);

		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter String with spaces: ");
		String str = input.nextLine();

		System.out.println("URLify: " + replaceSpaces(str));

	}

}
