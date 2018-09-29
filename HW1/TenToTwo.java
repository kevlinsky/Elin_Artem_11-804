import java.util.Scanner;
public class TenToTwo{
	public static void main(String[] args){
		System.out.println("Enter your number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1, a = 0, s = 0;
		if (n > 1023) {
			System.out.println("Program can`t convert this number. Please enter number less than 1024");
		} else {
			while (n != 0){
				a = n % 2;
				s = s + a * i;
				i = i * 10;
				n = n / 2; 
			}
			System.out.println("Binary number: " + s);
		}
	}
}