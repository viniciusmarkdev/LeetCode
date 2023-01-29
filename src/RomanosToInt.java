import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanosToInt {
	
	
	public static void main(String[] args) {
		
		romanToInt("XIV");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static int romanToInt(String s) {
		
			/*
			 * Tenho que converter um número romano paa inteiro
			 * */
		
		
		
		
	
		int soma = 0;
		int somaL = 0;
		int somaV = 0;
		int somaX = 0;
		int somaC = 0;
		int somaD = 0;
		int somaM = 0;
	
		Map< Character , Integer> complementos = new HashMap();
        
		char[] separar = s.toCharArray();
		for(int i = 0;i<s.length();i++) {
			
         if(separar[i]=='I' && separar[i+1]=='V' ) {
        	 
        	 complementos.put('I',4);
        	 complementos.put('V', 0);
        	 
       
        	
        	 
        	 
         }
         
         else if(separar[i+1]=='I' && separar[i]=='V'   ) {
    		 
        	 complementos.put('I',1);
        	 complementos.put('V', 5);
    	 }
         
         
           if(separar[i]=='I' && separar[i+1]=='X' ) {
        	 
        	 complementos.put('I',9);
        	 complementos.put('X',0);
        	 
       
        	
        	 
        	 
         }
         
      else if (separar[i]=='X' && separar[i+1]=='I' &&
    		   
    		  ) {
          	 
          	 complementos.put('X',10);
          	 complementos.put('I',1);
          	 
          	
          	 
         
          	
          	 
          	 
           }
           
       
         
       
      
         
     
    	   
	
		System.out.println(complementos);
		
		
		int somaTotal = complementos.get('I')+
				complementos.get('V')+complementos.get("X");
				
		
		 System.out.println(somaTotal);
	
		
		
	}
		
		
		
		return 1;
	
	}
	
	
}