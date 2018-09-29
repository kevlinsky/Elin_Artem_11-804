import java.util.Scanner;
public class Perevod1{
	public static void main(String[] args){
		System.out.println("Enter the notation");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		if (k > 0) {
			System.out.println("Enter your number");
			int n = sc.nextInt();
			if (n >= 0) {
				StringBuilder sb = new StringBuilder();
				int sum = 0;
				while (n != 0){
					int ost = n % k;
					if (ost < 10 ){
						sb.append(ost);
						sum += ost;
					} else {
						switch (ost){
							case 10: sb.append("A");
									 break;
							case 11: sb.append("B");
									 break;
							case 12: sb.append("C");
									 break;
							case 13: sb.append("D");
									 break;
							case 14: sb.append("E");
									 break;
							case 15: sb.append("F");
									 break;
							case 16: sb.append("G");
									 break;
							case 17: sb.append("H");
									 break;
							case 18: sb.append("I");
									 break;
							case 19: sb.append("J");
									 break;
							case 20: sb.append("K");
									 break;
							case 21: sb.append("L");
									 break;
							case 22: sb.append("M");
									 break;
							case 23: sb.append("N");
									 break;
							case 24: sb.append("O");
									 break;
							case 25: sb.append("P");
									 break;
							case 26: sb.append("Q");
									 break;
							case 27: sb.append("R");
									 break;
							case 28: sb.append("S");
									 break;
							case 29: sb.append("T");
									 break;
							case 30: sb.append("U");
									 break;
							case 31: sb.append("V");
									 break;
							case 32: sb.append("W");
									 break;
							case 33: sb.append("X");
									 break;
							case 34: sb.append("Y");
									 break;
							case 35: sb.append("Z");
									 break;
						}
					}
					n = n / k;
				}
				sb.reverse();
				System.out.println("Result: " + sb.toString());
				System.out.println("Sum of numbers: " + sum);
			} else {
				System.out.println("Program can work only with positive numbers");
			}
		} else {
			System.out.println("Please enter the positive notation");
		}
	}
}