package practiceJava;

public class Q3_SumofNumbers {

	public static void main(String[] args) {
		//*1. Write a java code to find the sum of the given numbers
		//Input: "asdf1qwer9as8d7"
		//output: 1+9+8+7 = 25*/
		
			
			String input = "asdf1qwer9as8d7";
			input = input.replaceAll("\\D", "");
			int output = 0;
			System.out.println(input);	
			for(int i=0;i<input.length();i++)
				output = output + Integer.parseInt(Character.toString(input.charAt(i)));
				
				System.out.println(output);
		

	}

}
