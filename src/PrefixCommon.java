import java.util.ArrayList;
import java.util.List;

public class PrefixCommon {
	
	public static void main(String[] args) {
		
		
		String [] a = {"flower" , "flow" , "flight"};
		longestCommonPrefix(a);
	}
	
	
	
	 public static String longestCommonPrefix(String[] strs) {
		 
		 /*
		  *  A classe StringBuffer serve para concatenarmos
		  *  letras ou palavras , para isso usamos o método
		  *  append.
		  * */
		
		 
		 StringBuffer ans=new StringBuffer();
		 
		 
		    /*
		     *Se houver somente 1 elemento no vetor de Array
		     *ele será retornado
		     */
		    
	        if(strs.length==1)
	        {
	            return strs[0];
	        }
	        // Encontrando a menor String
	      
	        /*
	         * Iniciamos uma varíavel com a 
	         * String no indice 0.
	         * 
	         * No looping iremos comparar o tamanho  das Strings em 
	         * cada posição e ver se ela é menor que
	         * a String min se ela for   essa
	         * String é adicionada na Variavel min 
	         * e o Index da nova String menor que a 
	         * inicializada é adicionado na váriavel index.
	         * 
	         * 
	         * Fazemos esse looping até achar a menor
	         * 
	         */
	       
	        int min=strs[0].length();
	  
	        int index=0;
	        for(int i=0;i<strs.length;i++)
	        {
	            if(strs[i].length()<min)
	            {
	                min=strs[i].length();
	                index=i;
	                
	            }
	        }   
	        
	        //Posição da menor palavra é igual a 1
	        System.out.println(index);
	        
	        //Tamanho da palavra é  igual a 4
	        System.out.println(min);
	        
	       //COMPARAR OS CARACTERES DE TODAS AS OUTRAS STRING COM A 
	       //MENOR STRING E...
	     
	        // A String check é  a menor String no index 1
	        String check=strs[index];
	     //   <!-- System.out.println(check); -->
	        
	        //O primeiro loop define a quantidade
	        //de vezes  que o segundo loop executará.
	        // Nesse caso, essa quantidade será 
	        //o tamanho da menor palavra , que tem 
	        //o tamanho 4 .
	        
	        for(int i=0;i<check.length();i++)
	        {
	        	/*
	        	 * No index 0 , pegaremos 
	        	 * a primeira letra e assim por
	        	 * diante.Nesse caso, o índice
	        	 * 0 será "f", o 1 será "l" , o 2 será 
	        	 * "o" e o 3 será "w" .
	        	 * */
	            char ch= check.charAt(i);
	            
	            /*
	             * No indice 0 do primeiro loop
	             * compararemos as primeiras letras
	             * das outras strings com a 
	             * primeira letra de flow. 
	             * E assim por diante..
	             * 
	             * */
	            
	         
	           
	            
	            
	            
	            
	            
	            
	            for(int j=0;j<strs.length;j++)
	            {
	            	
	            	/*
	            	 * Se  as letras forem diferentes
	            	 * retornaremos ans sem nada , null.
	            	 * 	Se forem iguais o loop continuará
	            	 * até percorrer cada letra em cada
	            	 * posição do array e ao final 
	            	 * fará a junção no da letra ch no índice(i).
	            	 * 
	            	 * se ele encontrar uma letra diferente ele
	            	 * retornará o ch que provavelmete já foi 
	            	 * concatenado várias vezes mais o valor nulo 
	            	 * e o looping acabrá.
	            	 * 
	            	 * */
	                if(strs[j].charAt(i)!=ch)
	                {
	     
	            
	                    return ans+"";
	                }
	                
	            }
	            ans.append(ch);
	            
	            
	        }
	      
	        
	      
	        return ans+"";
	     	 
}
	 
}
	 
