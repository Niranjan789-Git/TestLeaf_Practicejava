package practiceJava;

public class Q4_Reversewords {

	public static void main(String[] args) {
		
		String input = "When the world realise its own mistake, corona will dissolve automatically";
		String[] inpArry = input.split(" ");
		StringBuffer strBuff = new StringBuffer();
		
		 for (int i = 0; i < inpArry.length; i++) {
	        	if(i%2 == 0) {
	        		strBuff.append(inpArry[i] + " ");
	        	}
	        	//(eg : 1/2 !=0 , it will reverse the word "eht")
	        	else {
	        		strBuff.append(new StringBuffer(inpArry[i]).reverse() + " ");
				}
			}
	            System.out.println(strBuff.toString());
			
		
		
		
		
	}

}
