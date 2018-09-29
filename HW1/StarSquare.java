public class StarSquare {
	public static void main(String[] args){
		int n = 7;
		for (int i = 0; i < n; i++){
			if (i != n - 1) {
			System.out.print("*");
			} else {
			System.out.println("*");
			}
		}
		for (int i = 0; i < (n - 2); i++){
			for (int j = 0; j < n; j++) {
				if (j == 0) {System.out.print("*");}
				if ((j > 0)||(i < (n - 1))) {System.out.print(" ");}
				if (j == (n - 1)) {System.out.println("*");}
			}
		}
		for (int i = 0; i < n; i++){
			if (i != n - 1) {
			System.out.print("*");
			} else {
			System.out.println("*");
			}
		}
	}
}