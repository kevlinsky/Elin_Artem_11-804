import java.util.Scanner;
public class Circle{
	public static void main(String[] args){
		System.out.println("Enter the radius of circle");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		if (r >=0) {
			System.out.println("Enter the 'x' coordinate of circle");
			int x0 = sc.nextInt();
			System.out.println("Enter the 'y' coordinate of circle");
			int y0 = sc.nextInt();
			System.out.println("Enter the 'x' coordinate of dot");
			int x = sc.nextInt();
			System.out.println("Enter the 'y' coordinate of dot");
			int y = sc.nextInt();
			if ((((y - y0) * (y - y0)) + ((x - x0) * (x - x0)))<=(r * r)) {
				System.out.println("Dot is in circle");
			} else {
				System.out.println("Dot is out of circle");
			}
		} else {
			System.out.println("Please enter the positive number of radius");
		}
	}
}