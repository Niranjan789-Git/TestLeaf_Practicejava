package practiceJava;

public class Occurance_1 {

	public static void main(String[] args) {
	
		String occ = "You have no choice other than following me ";
		String replaceocc = occ.replaceAll("[^o]","");
		System.out.println("Occurance of O: "+replaceocc.length());
		

	}

}
