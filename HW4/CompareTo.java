import java.util.Scanner;

public class CompareTo{
	public static void main(String[] args){
		System.out.println("Enter the first word:");
		Scanner sc = new Scanner(System.in);
		String word1 = sc.nextLine();
		System.out.println("Enter the second word:");
		String word2 = sc.nextLine();
		int min;
		boolean flag = true;
		if (word1.length() > word2.length()){
			min = word2.length();
		} else {
			min = word1.length();
		}
		for (int i = 0; i < min; i++){
			char c1 = word1.charAt(i);
			char c2 = word2.charAt(i);
			if (c1 != c2){
				flag = false;
				System.out.println(c1 - c2);
				break;
			}
		}
		if (flag == true) {
			System.out.println(word1.length() - word2.length());
		}
	}
}