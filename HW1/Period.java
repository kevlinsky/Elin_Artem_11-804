import java.util.Scanner;
public class Period {
	public static void main (String[] args){
		System.out.println("Enter the number of iterations");
		Scanner sc = new Scanner(System.in);
		int n  =  sc.nextInt();
		if (n >= 0){
			double s = 0;
			double i = 1;
			for (int k = 1; k < n; k++){
				if (k % 2 != 0) {
					s = s + (1 / (i * i));
				} else {
					s = s - (1 / (i * i));
				}
				i = i + 2;
			}
			System.out.println(s);
		} else {
			System.out.println("Please enter the positive number of iterations");
		}
	}
}