import java.util.Scanner;

public class Nod {
	public static void main(String[] args){
		System.out.println("Enter two numbers:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] arr1 = new int[a];
		int[] arr2 = new int[b];
		int count = 0;
		int n = 0, k = 0;
		for (int i = 1; i <= Math.round(Math.sqrt(a)); i++){
			if (a % i == 0){
				if (i != a / i){
					arr1[count] = i;
					count++;
					arr1[count] = a / i;
					count++;
					k += 2;
				} else {
					arr1[count] = i;
					k++;					
				}
			}
		}
		count = 0;
		for (int i = 1; i <= Math.round(Math.sqrt(b)); i++){
			if (b % i == 0){
				if (i != b / i){
					arr2[count] = i;
					count++;
					arr2[count] = b / i;
					count++;
					n += 2;
				} else {
					arr2[count] = i;
					n++;					
				}
			}
		}
		/*for (int i = 0; i < k; i++){
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < n; i++){
			System.out.print(arr2[i] + " ");
		}
		System.out.println();*/
		int max = 0;
		for (int i = 0; i < k; i++){
			for (int j = 0; j < n; j++){
				if ((arr1[i] == arr2[j]) && (arr1[i] > max)){
					max = arr1[i];
				}
			}
		}
		System.out.println("Greatest common divisor: " + max);
	}
}