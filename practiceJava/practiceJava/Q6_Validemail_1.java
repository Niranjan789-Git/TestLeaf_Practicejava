package practiceJava;

import java.util.regex.Pattern;

public class Q6_Validemail_1 {

	public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
  
    /* driver function to check */
    public static void main(String[] args) 
    { 
        String email = "naveen e@tl.com"; 
        if (isValid(email)) 
            System.out.print("true"); 
        else
            System.out.print("false");
	}

}
