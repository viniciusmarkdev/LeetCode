
public class PalindromeNumber {
	
	 
	public static void main(String[] args) {
		
	isPalindrome(1211);
		
	}
	public  static boolean isPalindrome(int x) {
		
		
	    String intToString = String.valueOf(x);
	    char[] separarNumero = intToString.toCharArray();
	  
	    boolean Ispalindrome = false;

	    
	    int j  =  0;
	    int k = 0;
	   
	  for( int i  = 0 ; i<=intToString.length()-1 ; i++) {
			
	   
		j++;
		System.out.print(separarNumero[intToString.length()-j]);
		
        System.out.println(separarNumero[i]);
       
       
        if(separarNumero[intToString.length()-3]==separarNumero[2]) {
        	
        	k++;
        	
        	
        	
        }
        
        
       
	    }
	    
	  if(k==intToString.length()) {
		  
		  System.out.println("É palindromo");
		  
	  }
	  
	  else {
		  
		  System.out.println("Não é  palindromo");
	  }
	 
	    
	   
	    System.out.println(Ispalindrome);
	    
	    
	
	    
		return Ispalindrome;
}
	
	
	
}