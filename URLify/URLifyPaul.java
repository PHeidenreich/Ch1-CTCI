package URLify;

import java.util.Scanner;

public class URLifyPaul {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String with spaces: ");
		String str = input.nextLine();
		
		str = str.trim();
		str = str.replaceAll("\\s", "%20");
		System.out.println("URLify: " + str);
	}
}
