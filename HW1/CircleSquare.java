import java.util.Scanner;
public class CircleSquare {
	public static void main(String[] args){
		System.out.println("Enter the radius of circle");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		if (r < 0) {
			System.out.println("Enter the positive number of radius");
		} else {
			double s = r * r * Math.PI;
			double l = 2 * Math.PI * r;
			System.out.println("Square of circle: " + s);
			System.out.println("Circumference: " + l);
		}
	}
}