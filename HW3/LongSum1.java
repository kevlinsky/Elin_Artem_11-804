import java.util.Scanner;
public class LongSum1{
	public static void main(String[] args){
		System.out.println("Enter the first number:");
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		System.out.println("Enter the second number:");
		String y = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder(x);
		StringBuilder sb2 = new StringBuilder(y);
		int a, b, ost = 0, rd;
		if (x.length() < y.length()){ 
			rd = y.length() - x.length();
			for (int k = 0; k < rd; k++){
				sb1.insert(0, "0");
			}
			x = sb1.toString();
			for (int i =y.length() - 1; i >= 0; i--){
				a = Character.digit(x.charAt(i), 10);
				b = Character.digit(y.charAt(i), 10);
				sb.append((a + b + ost) % 10);
				ost = (a + b + ost) / 10;
			}
			sb.reverse();
			System.out.println(sb.toString());
		} else {
			rd = x.length() - y.length();
			for (int k = 0; k < rd; k++){
				sb2.insert(0, "0");
			}
			y = sb2.toString();
			for (int i =x.length() - 1; i >= 0; i--){
				rd = y.length() - x.length();
				a = Character.digit(x.charAt(i), 10);
				b = Character.digit(y.charAt(i), 10);
				sb.append((a + b + ost) % 10);
				ost = (a + b + ost) / 10;
			}
			sb.reverse();
			System.out.println(sb.toString());
		}
	}
}