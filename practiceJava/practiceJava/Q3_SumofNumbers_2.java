package practiceJava;

public class Q3_SumofNumbers_2 {

	public static void main(String[] args) {
		
		/*1. Write a java code to find the sum of the given numbers
		//Input: "asdf1qwer9as8d7"
		//output: 1+9+8+7 = 25*/
		
		String input = "asdf1qwer9as8d7";
			char[] chrArray = input.toCharArray(); 
			int output = 0;
			
			for (char c : chrArray) {
				if(Character.toString(c).matches("[0-9]"))
					output = output+ Integer.parseInt(Character.toString(c));			
			}
			
			System.out.println("The sum of given numbers are: "+output);
		
		
		
		
		
		
	}

}
