import java.util.Scanner;
public class OnePeriod{
	public static void main(String[] args){
		System.out.println("Enter your number:");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if (n >= 0) {
				int kmax = 0;
				int k = 0;
				StringBuilder sb = new StringBuilder();
				while (n != 0){
					int ost = n % 2;
					if (ost == 1) {
						k++;
						if (k > kmax){
							kmax = k;
						} 
					} else {
						k = 0;
					}
					sb.append(ost);
					n /= 2;
				}
				sb.reverse();
				System.out.println("Binary number: " + sb.toString());
				System.out.println("Max period: " + kmax);
			} else {
				System.out.println("Program can work only with positive numbers");
			}
	}
}