
public class Elemento {
	
	public static void main(String[] args) {
		
		
		  Elemento l1 = new Elemento(1);
	      l1.proximo= new Elemento(3);
	      l1.proximo.proximo = new Elemento(5);
	  
	  
	      Elemento l2 = new Elemento(2);
	      l2.proximo= new Elemento(4);
	      l2.proximo.proximo = new Elemento(6); 
	      
	      Elemento l3 = new Elemento();
	      
	      Elemento mergedList = mergeLists(l1, l2);
	        
	        // Imprimir a lista mesclada
	        while (mergedList != null) {
	            System.out.print(mergedList.valor + " ");
	            mergedList = mergedList.proximo;
	        }
	  
	}
	
	
   int  valor;
	
   public Elemento proximo;
	
   public Elemento() {
	   
	   
   }
   
   public Elemento(int valor , Elemento proximo) {
	   
	   this.valor = valor;
	   
	   this.proximo = proximo;
   }
	
	
	public Elemento(int valor) {
		
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Elemento getProximo() {
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}
	
	public  static Elemento mergeLists(Elemento l1 , Elemento l2) {
		
		Elemento dummy = new Elemento(0);
		Elemento current = dummy;
		
		while(l1!=null && l2!=null) {
			
			if(l1.valor<=l2.valor) {
				
				current.proximo = l1;
			}else {
				
				current.proximo = l2;
				l2 = l2.proximo;
				
			}
			
			current = current.proximo;
			
			
		}
		
		if(l1!=null) {
			
			current.proximo = l1;
		}
		
       if(l2!=null) {
			
			current.proximo = l1;
		}
		
		return dummy.proximo;
	}
	
	
 
}
