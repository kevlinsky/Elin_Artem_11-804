import java.util.Scanner;
public class Progression{
	public static void main(String[] args){
		System.out.println("Enter the first member of the progression");
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		System.out.println("Enter the second member of the progression");
		int a2 = sc.nextInt();
		System.out.println("Enter the number of wanted member of progression");
		int k = sc.nextInt();
		if (k > 0) {
			int d = a2 - a1;
			int ak = a1 + d * (k - 1);
			System.out.println("Wanted member: " + ak);
		} else {
			System.out.println("Enter the positive number of wanted member");
		}
	}
}