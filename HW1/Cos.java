import java.util.Scanner;
public class Cos{
	public static void main(String[] args){
		System.out.println("Enter \"X\":");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Enter the number of iterations");
		int n = sc.nextInt();
		if (n >= 0){
			double s=0;
			for (int i=1; i<n; i++){
				s = Math.cos(Math.toRadians(s + x));
			}
			System.out.println(s);
		} else {
			System.out.println("Enter the positive number of iterations");
		}
	}
}