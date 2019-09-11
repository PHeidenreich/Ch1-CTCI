package StringCompression;

public class StrCompression {
	
	public static void compressStr(String str) {
		StringBuilder compressed = new StringBuilder();
		int countLetters = 0;
		
		for(int i = 0; i < str.length(); i++) {
			countLetters++;
			
			if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)){
				compressed.append(str.charAt(i));
				compressed.append(countLetters);
				countLetters = 0;
			}
		}
		if(compressed.length() < str.length()) {
			
			System.out.println("Compressed phrase: " + compressed.toString());
		}else
			System.out.println("Compressed phrase is not shorter than original: " + str);
	}
	
	public static void main(String[] args) {
		String str = "abbccc";
		compressStr(str);
		
		String str2 = "abbcccddddeeeee";
		compressStr(str2);
		
		String str3 = "abc";
		compressStr(str3);
	}
}
