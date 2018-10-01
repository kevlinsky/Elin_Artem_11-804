import java.util.Scanner;

public class Emil {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two words: ");
		String word1 = in.nextLine();
		String word2 = in.nextLine();
		int c = word1.length() > word2.length() ? word1.length() : word2.length(); //Длина самой большой строки
		int b = word1.length() < word2.length() ? word1.length() : word2.length(); //Длина самой маленькой строки
		int length = 0, lengthword2 = 0;
		while (length != c - b + 1) { 
			for(int i = length; i < b + length; i++) {
				if (word1.charAt(i) == word2.charAt(i - length)) {
					lengthword2++;
				}
			}
			if (lengthword2 == b){
				System.out.println("Index: " + length + " ");
			} 
			length++;
			lengthword2 = 0;
		}
	}
}