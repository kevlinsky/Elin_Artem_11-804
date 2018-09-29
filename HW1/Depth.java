import java.util.Scanner;
public class Depth {
	public static void main(String[] args){
		System.out.println("Enter time of falling");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		if (t < 0){
			System.out.println("Please enter the positive number of time");
		} else {
			double g = 9.8;
			double s = (g * t * t) / 2;
			System.out.println("Depth = " + s + " meters");
		}
	}
}