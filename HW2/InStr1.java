public class InStr1 {
	public static void main(String[] args){
		String s1 = args[0];
		String s2 = args[1];
		for (int i = 0; i < s1.length(); i++){
			char c1 = s1.charAt(i);
			for (int j = 0; j < s2.length(); j++){ 
				char c2 = s2.charAt(j);
				if (c2 == c1) {
					System.out.print(i + " ");
				}
			}
		}
	}
}