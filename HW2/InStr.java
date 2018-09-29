public class InStr {
	public static void main(String[] args){
		if (args.length == 2){
			String s1 = args[0];
			String s2 = args[1];
			if (s1.length() - s2.length() < 0){
				System.out.println("There are no entry indexes");
			} else {
				int l1 = s1.length();
				int l2 = s2.length();
				for (int i = 0; i <= (l1 - l2); i++){
					String s = s1.substring(i, i + l2);
					if (s.equals(s2)) {
						System.out.println(i);
						//break;
					}
				}
			}
		} else {
			System.out.println("Please enter 2 elements");
		}
	}
}