import java.util.Scanner;
public class SwapVar{
	public static void main(String[] args){
		System.out.println("Enter variable \"A\":");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter variable \"B\":");
		int b = sc.nextInt();
		a = a + 2 * b;
		b = a - 2 * b;
		a = (a - b) / 2;
		System.out.println("A = " + a + " B = " + b);
	}
}