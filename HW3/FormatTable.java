public class FormatTable {
	public static void main(String[] args){
		if (args.length != 0){
			int n = Integer.parseInt(args[0]);
			String smax = n + " * 9" + " = " + (n * 9) + " ";
			int l = smax.length();
			for (int j = 1; j <= 9; j++){
				for (int i = 1; i <= n; i++){
					String s = i + " * " + j + " = " + (i * j) + " ";
					int l1 = s.length();
					int dl = l - l1;
					for (int k = 1; k <= dl; k++){
						s = s + " ";
					}
					System.out.format("%s",s);
				}
				System.out.format("%n");
			}
		} else {
			System.out.println("Please enter something");
		}
	}
}