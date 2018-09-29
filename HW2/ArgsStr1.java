public class ArgsStr1 {
	public static void main(String[] args){
		if (args.length < 2) {
			System.out.println("Please enter 2 elements");
		} else {
			int n = Integer.parseInt(args[1]);
			if (n >= 0) {
				String s = args[0];
				int k = Integer.parseInt(args[1]);
				for (int i = 0; i < k; i++){
					System.out.println(s);
				}
			} else {
					System.out.println("Please enter positive number of lines");
			}
		}
	}
}