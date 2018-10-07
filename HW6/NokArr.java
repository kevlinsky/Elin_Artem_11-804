import java.util.Scanner;

public class NokArr{
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
		int[] arr = new int[max];
		int count = 0;
		for (int i = max; i <= (a * b); i++){
			if ((i % a == 0) && (i % b == 0)){
				arr[count] = i;
				count++;
			}
		}
		int nok = a * b;
		for (int i = 0; i < count; i++){
			if (arr[i] < nok){
				nok = arr[i];
			}
		}
		System.out.println("Least common multiple: " + nok);		
	}
}