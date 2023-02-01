
public class PalindromeNumber {
	
	 
	public static void main(String[] args) {
		
	isPalindrome(1236);
		
	}
	public  static boolean isPalindrome(int x) {
		
		
	    String intToString = String.valueOf(x);
	    char[] separarNumero = intToString.toCharArray();
		int k = 0;
		int l = 0;
	    for(int i  = intToString.length()-1; i >=0 ; i--) {
			
			
	         System.out.println(separarNumero[i]);
	          
			 
		}
	    
	    
	    for(int j = 0 ; j < intToString.length(); j++) {
		
		
	    	 System.out.println(separarNumero[j]);
	    	 
			
		}
		
	    
	    if(separarNumero[l]==separarNumero[k]) {
		
		return true;
	}  
	    else {
	    	
	    	return false;
	    }

}
	
}
