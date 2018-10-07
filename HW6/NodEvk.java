import java.util.Scanner;

public class NodEvk{
	public static void main(String[] args){
		System.out.println("Enter two nubmers: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		while (a != b){
			if (a > b){
				a -= b;
			} else {
				b -=a;
			}
		}
		System.out.println("Greatest common divisor: " + a);
	}
}