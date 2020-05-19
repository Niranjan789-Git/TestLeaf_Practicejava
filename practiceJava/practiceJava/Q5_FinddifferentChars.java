package practiceJava;

public class Q5_FinddifferentChars {

	public static void main(String[] args) {
		/*
		3. Write a java program to find the number of Uppercase, lowercase, numbers and spaces in the following String.
		Input: "1. It is Work from Home  not Work for Home"
			*/
			
			String input = "1. It is Work from Home  not Work for Home";
			char[] inputChar = input.toCharArray();
			int numCnt=0, lowerCharCnt=0, upprCharCnt=0 , spaceCnt = 0;
					
			for (Character char1 : inputChar) {
				
				if(Character.toString(char1).matches("[A-Z]"))
					upprCharCnt++;
				else if(Character.toString(char1).matches("[a-z]"))
					lowerCharCnt++;
				else if(Character.toString(char1).matches("[0-9]"))
					numCnt++;
				else if(Character.toString(char1).matches("\\s"))
					spaceCnt++;
				
			}	
			System.out.println("The number of Upper Characters are: "+upprCharCnt);
			System.out.println("The number of Lower Characters are: "+lowerCharCnt);
			System.out.println("The number of Numbers are: "+numCnt);
			System.out.println("The number of Spaces are: "+spaceCnt);
			


	}

}
