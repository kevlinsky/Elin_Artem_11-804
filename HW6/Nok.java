import java.util.Scanner;

public class Nok{
	public static void main(String[] args){
		System.out.println("Enter two numbers:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == 0 | b == 0){
			System.out.println("Incorrect number");
			System.exit(1);
		}
		int max;
		if (a > b){
			max = a;
		} else {
			max = b;
		}
		int nok = a * b;
		for (int i = max; i <= (a * b); i++){
			if ((i % a == 0) && (i % b == 0)){
				if (i < nok){
					nok = i;
				}
			}
		}
		System.out.println("Least common multiple: " + nok);
	}
}