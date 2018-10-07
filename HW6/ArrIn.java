import java.util.Scanner;

public class ArrIn{
	public static void main(String[] args){
		System.out.println("Enter the length of array 1:");
		Scanner sc = new Scanner(System.in);
		int l1 = sc.nextInt();
		System.out.println("Enter the length of array 2:");
		int l2 = sc.nextInt();
		System.out.println("Enter the elements of array 1:");
		int[] a1 = new int[l1]; 
		for (int i = 0; i < l1; i++){
			a1[i] = sc.nextInt();
		}
		System.out.println("Enter the elements of array 2:");
		int[] a2 = new int[l2];
		for (int i = 0; i < l2; i++){
			a2[i] = sc.nextInt();
		}
		int max, min, l = 0, vh = 0;
		if (l2 > l1){
			max = l2;
			min = l1;
		} else {
			max = l1;
			min = l2;
		}
		while (l != (max - min + 1)){
			for (int i = l; i < min + l; i++){
				if (a1[i] == a2[i - l]){
					vh++;
				}
			}
			if (vh == min){
				System.out.println("Result:" + l);
			}
			l++;
			vh = 0;
		}
	}
}