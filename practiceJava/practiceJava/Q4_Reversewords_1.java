package practiceJava;
/*	2. Write a java program to do the following.
//Input: "When the world realise its own mistake, corona will dissolve automatically"
//output: "When eht world esilaer its nwo mistake, anoroc will evlossid automatically"
*/
public class Q4_Reversewords_1 {

	public static void main(String[] args) {
		String input = "When the world realise its own mistake, corona will dissolve automatically";
		String[] inpArry = input.split(" ");
		for (int i = 0; i < inpArry.length; i++) 
		{
		if(i%2!=0)
		{
		StringBuilder sb = new StringBuilder(inpArry[i]); 
		sb.reverse();
		inpArry[i] = sb.toString();
				}
					
			}
		for (String string : inpArry) {
		System.out.print(string+" ");
		
	}

}
}