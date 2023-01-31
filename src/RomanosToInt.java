import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanosToInt {
	
	
	public static void main(String[] args) {
		
		romanToInt("MMMXLV");
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
		
		int sub = 0;
		
	     int totalCharacters = 0;
	
		Map< Character , Integer> complementos = new HashMap();
        
		char[] separar = s.toCharArray();
		for(int i = 0;i<s.length();i++) {
			
        s.toUpperCase();
       if(separar[i]=='I') {
    	   
    	   complementos.put('I', 1);
    	   soma = soma+1;
    	   
       }
       else if(separar[i]=='V') {
    	   
    	   complementos.put('V', 5);
    	   somaV = somaV+5;
    	  
       }
       
       else if(separar[i]=='X') {
    	   
    	   complementos.put('X', 10);
    	   somaX = somaX+10;
       }
       
       else if(separar[i]=='L') {
    	   
    	   complementos.put('L', 50);
    	   somaL = somaL+50;
       }
       else if(separar[i]=='C') {
    	   
    	   complementos.put('C', 100);
    	   somaC = somaC+100;
       }
       else if(separar[i]=='D') {
    	   
    	   complementos.put('D', 500);
    	   
    	   somaD = somaD+500;
       }
       else if(separar[i]=='M') {
    	   
    	   complementos.put('M', 1000);
    	   somaM= somaM+1000;
       }

       
     
      
       
	      }
      
     
    	   
	
		System.out.println(complementos);
		
		 Map< String , Integer> strings = new HashMap();
		   
	       for(int j =0 ; j<s.length();j++) {
	    	   
	    	   System.out.println(strings);
	    	   s.toUpperCase();
	           
	    	   if(s.contains("IV")==true) {
	    		   
	    		   strings.put("IV" , 2);
	    	   }
	    	   
	    	   else {
	    		   strings.put("IV" , 0);
	    	   }
	    	   
               if(s.contains("IX")==true) {
	    		   
	    		   strings.put("IX" , 2);
	    	   }
	    	   
	    	   else {
	    		   strings.put("IX" , 0);
	    	   }
	    	   
	    	   
             
	    	   if(s.contains("XC")==true) {
	    		   
	    		   strings.put("XC" , 20);
	    	   }
	    	   
	    	   else {
	    		   strings.put("XC" , 0);
	    	   }
	    
          if(s.contains("CM")==true) {
   		   
   		   strings.put("CM" , 200);
   	       }
          
          else {
   		   strings.put("CM", 0);
   	      }
          
          if(s.contains("CD")==true) {
      		   
      		   strings.put("CD" , 200);
      	       }
             
             else {
      		   strings.put("CD", 0);
      	      }
          
          if(s.contains("XL")==true) {
     		   
     		   strings.put("XL" , 20);
     	       }
            
            else {
     		   strings.put("XL", 0);
     	      }

             
          
   	   

	     
	    	 
	    	  
	   		
	   		
	   

	       }
	      
		
       
	       int somaTotal = soma+somaV+somaX+somaL+somaD+somaC+
	   				somaM-sub - strings.get("IV")- 
	   				strings.get("XC")-strings.get("CM")
	   				-strings.get("IX")
		            -strings.get("CD")-strings.get("XL");


		      
		
		
	
		return somaTotal;
	
	}
	
	
}