public class MultiTable{
	public static void main(String[] args){
		for (int i = 1; i < 10; i++){
			for (int j = 1; j < 11; j++){
				if (j != 10) {
					System.out.print(i + " * " + j + " = " + i*j + " ");
				} else {
					System.out.println(i + " * " + j + " = " + i*j + " ");
				}
			}
		}
	}
}