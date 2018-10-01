import java.util.Scanner;

public class MinMaxArr {
	public static void main(String[] args){
		System.out.println("Enter the length of array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] a = new double[n];
		double min, max;
		for (int i = 0; i < n; i++){
			a[i] = Math.random();
			System.out.format("%.2f / ", a[i]);
			if (i == n - 1){
				System.out.format("%.2f \n",a[i]);
			}
		}
		min = a[0];
		max = a[0];
		for (int i = 0; i < n; i++){
			if (a[i] > max){
				max = a[i];
			}
			if (a[i] < min){
				min = a[i];
			}
		}
		System.out.format("Max: %.2f\n", max);
		System.out.format("Min: %.2f", min);
	}
}