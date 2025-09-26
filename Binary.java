package binary;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please insert a word: ");
		String str = scan.nextLine();
		boolean result = isBinary(str);
		System.out.printf("The result is: %b", result);
	}
	
		public static boolean isBinary(String str) {
			for(int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if(c != '0' && c != '1') {
					return false;
				}
			}
				return true;
		}
}