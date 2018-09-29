import java.util.Scanner;
public class Factorial{
	public static void main(String[] args){
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = 1;
		for (int i = 1; i < (n + 1); i++){
			s *= i;
		}
		System.out.println(s);
	}
}