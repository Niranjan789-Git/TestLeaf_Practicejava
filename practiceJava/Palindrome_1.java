package practiceJava;

public class Palindrome_1 {

	public static void main(String[] args) {
		
		String str = "TestLeaf";
		
		StringBuffer stb = new StringBuffer(str);
		String rev = stb.reverse().toString();
		
		if(rev.equals(str)) {
			
			System.out.println("Yes, Palindrome");
		}
			else {
			
			System.out.println("No Not a Palindrome");
			
		}
		
	}

}
