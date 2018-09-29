import java.util.Scanner;
public class Triangle{
	public static void main(String[] args){
		System.out.println("Enter the length of the base of the triangle:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n >= 0){
			if (n % 2 != 0){
				int k = 1;
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < (n + 1) / 2; i++){
					for (int j = 0; j < k; j++){
						sb.append("*");
					}
					for (int j = 0; j < (n - k) / 2; j++){
						sb.append(" ");
						sb.insert(0, " ");
					}
					k += 2;
					System.out.println(sb.toString());
					sb.setLength(0);
				}
			} else {
				System.out.println("Program can build triangle only with odd base length");
			}
		} else {
			System.out.println("Please enter the positive length of the base");
		}
	}
}