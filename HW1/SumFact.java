public class SumFact {
	public static void main(String[] args){
		int s = 0;
		for (int m = 1; m < 20; m++){
			s += (factorial(m - 1) * factorial(m - 1))/(factorial(2 * m));
		}
		System.out.println(s);
	}
}