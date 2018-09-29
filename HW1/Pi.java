// Method of Vallis
public class Pi {
		public static void main(String[] args) {
			double k = 2;
			double s = 1;
			for (int i=1; i<1000; i++) {
				s = s * ( (k * k) / ((k - 1) * (k + 1)));
				k = k + 2;
		    }
			System.out.println(s);
					
		}
}