import java.util.Scanner;

public class RandArr {
	public static void main(String[] args){
		System.out.println("Enter the length of array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] a = new double[n];
		for (int i = 0; i < n; i++){
			a[i] = Math.random();
			System.out.format("%.2f / ", a[i]);
			if (i == n){
				System.out.format("%.2f /n",a[i]);
			}
		} 
	}
}