
public class TwoSun {
	
	

	
	  public static int[] twoSum(int[] nums, int target) {
	        
	      
		
	    
		/*
		 *Loops aninhados para percorrer o array
		 *e somar todos o valores.
		 *
		 *Por exemplo : 
		 *
		 *No valor do indice 0 será somado o valor do 
		 *indice 1 , 2 , 3 e assim por diante.
		 *
		 *  
		 * */
		for(int i=0; i < nums.length; i++) {
			
			
		for ( int j = i+1 ; j < nums.length ; j++) {
				
				/*
				 *Caso a soma de dois dos valores 
				 *seja igual target retornaremos o
				 *indice desses dois valores.
				 *
				 * */
				if (nums[i]+nums[j]== target) {
					
					return new int[] {i , j};
					
					
					
				}
				
				
	
			}
				
	    	  
	      
		
	    			
	    		}
	    				
	    	
	    	   
	    		
	    	
	    		
	    	  
	      
	      return nums;
				
	        
	   
	}
	  
}
