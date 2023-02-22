public class ValidParentheses {
	
	
	public static void main(String[] args) {
		
		isValid("[]{}()[]");
	}
	
	 public  static boolean isValid(String s) {
		
		 
		 boolean StringValida = false ;
		 
		 if( s.length()%2 == 1 ||
				 s.charAt(0)==s.charAt(1) ||  s.charAt(0)!=s.charAt(1)) {
			 
			 StringValida= false;
			 
		 }
		 else {
		 
		 for(int i=0; i<s.length();i++) {
			 
			 
			    
			 char [] ch = s.toCharArray();
			
			 
	      for(int j=i+1; j<s.length();j++) {
	    	  
	    	  
	    	  if(ch[i]=='['  && ch[j]==']'  
	    			  || ch[i]=='{'  && ch[j]=='}'
	    			  
	    			  || ch[i]=='('  && ch[j]==')') {
	    		  
	    		  StringValida= true;
	    		
	    		
	  			
				i = i+2; 
				
				 }
	    	  else {
	    		  
	    		  StringValida= false;
	    		 
	    	  }
	    	  
	    	  j=j+1;
	    	  
	    	
	      }
	      
			 
		 }
		
		 }
		 
		
	
		 
		 return StringValida;
		
	        
	        
	    }

	 
     
}
