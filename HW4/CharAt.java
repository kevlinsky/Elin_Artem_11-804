import java.util.Scanner;

public class CharAt{
	public static void main(String[] args){
		System.out.println("Enter the first line:");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println("Enter the second line:");
		String s2 = sc.nextLine();
		int max, min, l = 0, vh = 0;
		if (s1.length() > s2.length()){
			max = s1.length();
			min = s2.length();
		} else {
			max = s2.length();
			min = s1.length();
		}
		while (l != (max - min + 1)){
			for (int i = l; i < min + l; i++){
				if (s1.charAt(i) == s2.charAt(i - l)){
					vh++;
				}
			}
			if (vh == min){
				System.out.println("Result:" + l);
			}
			l++;
			vh = 0;
		}		
	}
}