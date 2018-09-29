public class ArgsStr {
	public static void main(String[] args){
		if (args.length < 2) {
			System.out.println("Please enter 2 elements");
		} else {
			int n = Integer.parseInt(args[1]);
			if (n >= 0) {
				String s = args[0];
				int k = Integer.parseInt(args[1]);
				String delimiter = ", ";
				for (int i = 0; i < k; i++){
					if (i != k - 1){
						System.out.print(s + delimiter);
					} else {
						System.out.print(s);
					}
				}
			} else {
				System.out.println("Please enter positive number of lines");
			}
		}
	}
}