

public class PalindromeNumberFast {
	
	
	
	public static void main(String[] args) {
	
		int x = 121;
		System.out.println(121%10);
		System.out.println(121/10);
		System.out.println(12/10);
		System.out.println(11/10
				
				);
	}
	
    public boolean isPalindrome(int x) {
    
    /*Solu��o mais rapida 
     * 
     * Aqui � descoberto que todo resto de um n�mero palindromo divido
     * por 10  � diferente de 0 .Todo n�mero palindromo � 
     * maior que 0 e diferente de 0.
     * */
    if(x<0 || x%10==0 && x!=0) return false;
    int c=0;
    while (x>c){
        c=c*10+x%10;
        x=x/10;
        
    }

     if(x==c)return true ;
     if(c/10==x) return true; 

return false;
}
}
