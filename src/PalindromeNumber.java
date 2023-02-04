
public class PalindromeNumber {
	
	 
	public static void main(String[] args) {
		
	isPalindrome(2233314);
		
	}
	public  static boolean isPalindrome(int x) {
		
		
	    String intToString = String.valueOf(x);
	    char[] separarNumero = intToString.toCharArray();
	  
	    boolean Ispalindrome = false;

	    
	    int j  =  0;
	    int k = 0;
	   
	  for( int i  = 0 ; i<=intToString.length()-1 ; i++) {
			
	   
		j++;
	
       
        if(separarNumero[intToString.length()-j]==separarNumero[i]) {
        	
        	k++;
        	
        	
        	
        }
        
        
       
	    }
	    
	  if(k==intToString.length()) {
		  
		  Ispalindrome = true ;
		  
	  }
	  
	  else {
		  
		  Ispalindrome = false;
	  }
	 
	    
	   
	  
	    
	    
	
	    
		return Ispalindrome;
}
	
	
	
}