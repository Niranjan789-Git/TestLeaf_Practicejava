package practiceJava;

public class Palindrome {

	public static void main(String[] args) {
		
		String str = "malayalam";
		
		StringBuffer stb = new StringBuffer(str);
		StringBuffer reverse = stb.reverse();
		String rev = reverse.toString();
		
		if(rev.equals(str)) {
			
			System.out.println("Yes, Palindrome");
		}
			else {
			
			System.out.println("No Not a Palindrome");
			
		}
		
	}

}
