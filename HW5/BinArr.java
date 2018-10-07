import java.util.Scanner;
import java.util.*;

public class BinArr {
	public static void main(String[] args){
		boolean f = false;
		System.out.println("Enter the length of array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n < 0){
			System.out.println("Incorrect length");
			System.exit(1);
		}
		int[] a = new int[n];
		System.out.println("Enter the elements of array: ");
		for (int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Enter the element you are looking for:");
		int k = sc.nextInt();
		int mid = Math.round(a.length / 2);
		int b = 0, e = (n - 1);
		System.out.println("Sorted array:");
		for (int i = 0; i < n; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
		while (f == false){
			if (k > a[mid]){
				b = mid;
				mid = (e - b) / 2;
			}
			if (k < a[mid]){
				e = mid;
				mid = (e - b) / 2;
			}
			if (k == a[mid]){
				System.out.println("Index: " + mid);
				f = true;
			}
		}
		if (f == false){
			System.out.println("Element is not found");
		}
	}
}