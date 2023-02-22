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
		  *  letras ou palavras , para isso usamos o m�todo
		  *  append.
		  * */
		
		 
		 StringBuffer ans=new StringBuffer();
		 
		 
		    /*
		     *Se houver somente 1 elemento no vetor de Array
		     *ele ser� retornado
		     */
		    
	        if(strs.length==1)
	        {
	            return strs[0];
	        }
	        // Encontrando a menor String
	      
	        /*
	         * Iniciamos uma var�avel com a 
	         * String no indice 0.
	         * 
	         * No looping iremos comparar o tamanho  das Strings em 
	         * cada posi��o e ver se ela � menor que
	         * a String min se ela for   essa
	         * String � adicionada na Variavel min 
	         * e o Index da nova String menor que a 
	         * inicializada � adicionado na v�riavel index.
	         * 
	         * 
	         * Fazemos esse looping at� achar a menor
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
	        
	        //Posi��o da menor palavra � igual a 1
	        System.out.println(index);
	        
	        //Tamanho da palavra �  igual a 4
	        System.out.println(min);
	        
	       //COMPARAR OS CARACTERES DE TODAS AS OUTRAS STRING COM A 
	       //MENOR STRING E...
	     
	        // A String check �  a menor String no index 1
	        String check=strs[index];
	     //   <!-- System.out.println(check); -->
	        
	        //O primeiro loop define a quantidade
	        //de vezes  que o segundo loop executar�.
	        // Nesse caso, essa quantidade ser� 
	        //o tamanho da menor palavra , que tem 
	        //o tamanho 4 .
	        
	        for(int i=0;i<check.length();i++)
	        {
	        	/*
	        	 * No index 0 , pegaremos 
	        	 * a primeira letra e assim por
	        	 * diante.Nesse caso, o �ndice
	        	 * 0 ser� "f", o 1 ser� "l" , o 2 ser� 
	        	 * "o" e o 3 ser� "w" .
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
	            	 * 	Se forem iguais o loop continuar�
	            	 * at� percorrer cada letra em cada
	            	 * posi��o do array e ao final 
	            	 * far� a jun��o no da letra ch no �ndice(i).
	            	 * 
	            	 * se ele encontrar uma letra diferente ele
	            	 * retornar� o ch que provavelmete j� foi 
	            	 * concatenado v�rias vezes mais o valor nulo 
	            	 * e o looping acabr�.
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
	 
