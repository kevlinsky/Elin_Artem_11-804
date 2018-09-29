import java.util.Scanner;
public class Perevod{
	public static void main(String[] args){
		System.out.println("Enter the notation");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		if (k > 0) {
			System.out.println("Enter your number");
			int n = sc.nextInt();
			if (n >= 0) {
				if (n <= 10){
					StringBuilder sb = new StringBuilder();
					while (n != 0){
						int ost = n % k;
						sb.append(ost);
						n = n / k;
					}
					sb.reverse();
					System.out.println("Result: " + sb.toString());
				} else {
					System.out.println("Program can work only with notation less then 11");
				}
			} else {
				System.out.println("Program can work only with positive numbers");
			}
		} else {
			System.out.println("Please enter the positive notation");
		}
	}
}