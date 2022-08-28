package Program;

public class StringPalindrome {
	public static void main(String[] args) {
		String s="malayalam";
		String rev="";
		for (int i = s.length()-1; i >=0; i--) {
			char c = s.charAt(i);
			rev=c+rev;
			
		}
		
		if (rev.equals(s)) {
			System.out.println("palindrome");
			
		}
		else {
			System.out.println("not");
		}
	}

}
