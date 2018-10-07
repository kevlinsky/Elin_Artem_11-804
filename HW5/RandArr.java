import java.util.Scanner;

public class RandArr {
	public static void main(String[] args){
		System.out.println("Enter the length of array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n < 0) {
			System.out.println("Incorrect length");
			System.exit(1);
		}
		int[] a = new int[n];
		for (int i=0; i < n; i++) {
			a[i] = (int) (Math.random() * 100); 
		}
		for (int i=0; i < n; i++) {
			if (i == n-1){
				System.out.println(a[i]);
			} else {
				System.out.print(a[i]+ " ");
			}
		} 
	}
}