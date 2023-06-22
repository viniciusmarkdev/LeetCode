import java.util.ArrayList;

public class TamanhoDaUltimaPalavraErrado {
	
	public static void main(String[] args) {
		
		int a =lengthOfLastWord("Hello World a ");
		
	    System.out.println(a);
		
		
	}
	
	/*
	 * 
	 * 
	 * Treinamento
	 * 
	 * 
	 * 
	 * 
	 * */
	
	public static int lengthOfLastWord1(String s) {
		
		
	    if(s.isEmpty() || s==null) {
			
			return 0;
		}
		
		String stringSemEspaco = s.trim();
		
		int ultimaAparicaoDoIndice = stringSemEspaco.lastIndexOf(' ');
		
		
		
	
		
		if(ultimaAparicaoDoIndice ==-1) {
			
			return stringSemEspaco.length();
			
		}
		
		else {
			
			
		    return stringSemEspaco.length()-ultimaAparicaoDoIndice-1;
			
			
		}
		
	
		
		
	}
	
	
	
	
	
	
	/*
	 * 
	 * 
	 * Treinamento
	 * 
	 * 
	 * 
	 * 
	 * */
	
	
	
     public static int lengthOfLastWord(String s) {
    	 
    	
    	
    	String StringSemEspaco = s.trim();
    
    	
    	
    	ArrayList<Integer> marcador = new ArrayList<Integer>();
    
        
        int contador = 0;
            
        char[] a = " ".toCharArray();
    	    
    	char[] str = StringSemEspaco.toCharArray();
    	
    	int index=-1;
    	
    	int tam=0;
    	
    	
 
    	 
   	    if(str[StringSemEspaco.length()-1]==a[0] || s.length()==1) {
	       	    
     	   return  tam = StringSemEspaco.length();  		
     	   
     	}
   	    else {
   	    	
   	    	
   	     for(int i=0 ; i<StringSemEspaco.length() ; i++) {
   	        
         	if(str[i]==a[0]) {
         		
         		
         	    marcador.add(contador);
         	    index++;
         	    
         		
         	}else {
         		
         		contador++;
         	}
         	
         }
     	  
   	    	
   	    }
    	    
   	   
     
     	
    	return StringSemEspaco.subSequence(marcador.get(index)+1+index,  StringSemEspaco.length()).length();
    	
    		
    	
    	
    	
    	
   
    	
    }

}
