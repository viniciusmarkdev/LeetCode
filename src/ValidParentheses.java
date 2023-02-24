public class ValidParentheses {
	
	
	public static void main(String[] args) {
		
		isValid("(([]){})");
	}

	 public  static boolean isValid(String s) {
		 int l= 0;
	     int m =0;
		 
          boolean StringValida = false ;
		 
		 if( s.length()%2 == 1 ||
           s.charAt(0)==s.charAt(1)) {
			 
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
	    		
	    		
	  			
				
				
				 }
	    	  else {
	    		
	    		  StringValida= false;

	    		 
	    		
	    	  }
	    	  i = i+2; 
	    	  j=j+1;
	    	  
	    	
	      }
	      
			 
		 }
		
		 
		
		 }
		
		 int j = 0;
		 if(StringValida==false && s.length()%2 !=1) {
				
			
			 
		     int k =0;
		    
	
		     for(int i=0; i<s.length()-k;i++) {
				 
				 char [] ch = s.toCharArray();
					
				
			    
	   if(ch[i]=='[' && ch[s.length()-1-j]==']' ||  
	    ch[i]=='(' && ch[s.length()-1-j]==')' ||
	   ch[i]=='{' && ch[s.length()-1-j]=='}' 
			
			) {
			    	
		           
		        StringValida = true;
		        j++;
		        l++;
			    	
			    
			    }
	   else {
		  
		   
		   StringValida = false;
		   j++;
		   m++;
		 

	   }
	   
	   k++;
	  
	   
	   
	  
			
			 }
		     
		     
		     if(m>l) {
		    	  StringValida = false;
		     }
		     
		     if(m<l && m%2==1) {
				   
				   StringValida = false;
				   
			   }
			   
			   if(l>m  && m%2==0 ) {
				   
				   
				   StringValida = true;
				   
			   }
			   
                 if(l==m ) {
				   
				   
				   StringValida = false;
				   
			   }
			   
			   
		    
			 
			
		 }
		
			
		
	    
		
	    
		 System.out.println(StringValida);
		 return StringValida;

	 
	 }
}
