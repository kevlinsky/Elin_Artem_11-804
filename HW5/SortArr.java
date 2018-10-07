import java.util.Scanner;

public class SortArr{
	public static void main(String[] args){
		System.out.println("Enter the length of array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n < 0){
			System.out.println("Incorrect length");
			System.exit(1);
		}
		int a[] = new int[n];
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
		boolean sorted = false;
		for (int i = 0; i < n - 1 && !sorted; i++){
			sorted = true;
			for (int j = i + 1; j < n; j++){
				if (a[i] > a[j]){
					sorted = false;
					int c = a[i];
					a[i] = a[j];
					a[j] = c;
				}
			}
		}
		System.out.println("Result: ");
		for (int i=0; i < n; i++) {
			if (i == n-1){
				System.out.println(a[i]);
			} else {
				System.out.print(a[i]+ " ");
			}
		}
	}
}