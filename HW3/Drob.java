import java.util.Scanner;
public class Drob{
	public static void main(String[] args){
		System.out.println("Enter \"X\":");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Enter the number of iterations:");
		int i = sc.nextInt();
		if (i >= 0){
			double s;
			s = x + i;
			while (i != 1){
				s = x / s;
				i--;
				s = s + i;
			}
			System.out.format("%.2f",s);
		} else {
			System.out.println("Please enter the positive number of iterations");
		}		
	}
}