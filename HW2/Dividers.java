import java.util.Scanner;
public class Dividers {
	public static void main(String[] args){
		System.out.println("Enter your number");
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		if (n >= 0) {
			int k = 0;
			for (int i = 1; i <= Math.round(Math.sqrt(n)); i++){
				if (n % i == 0){
					if (i != n/i){
						System.out.print(i +" " + (n / i) +" ");
						k = k + 2;
					} else {
						System.out.print(i +" ");
						k++;
					}
				}
			}
			System.out.println("Number of dividers: " + k);
		} else {
			System.out.println("The program can work only with positive numbers");
		}
	}
}