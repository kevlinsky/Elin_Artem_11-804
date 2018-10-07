import java.util.Scanner;

public class MultiArr {
	public static void main(String[] args){
		System.out.println("Enter max number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n < 0){
			System.out.println("Please enter positive number");
			System.exit(1);
		}
		int[][] a = new int[n][9];
		for (int i = 0; i < n; i++){
			for (int j = 0; j < 9; j++){
				if (j == 8){
					System.out.println(a[i][j] = (i + 1) * (j + 1));
				} else {
					System.out.print((a[i][j] = (i + 1) * (j + 1)) + " \t");
				}
			}
		}
	}
}