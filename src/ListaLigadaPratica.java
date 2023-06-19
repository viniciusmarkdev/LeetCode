
public class ListaLigadaPratica {
	
	Elemento primeiro;
	
	Elemento ultimo;
	
	Elemento proximo;
	
	
	
	int tamanho = 0;



	public Elemento getPrimeiro() {
		return primeiro;
	}



	public void setPrimeiro(Elemento primeiro) {
		this.primeiro = primeiro;
	}



	public Elemento getUltimo() {
		return ultimo;
	}



	public void setUltimo(Elemento ultimo) {
		this.ultimo = ultimo;
	}



	public int getTamanho() {
		return tamanho;
	}



	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	
	
				 
				 
			 
			 
		 
		 

		 
		
		
		
	
	 
	
	
	public void adicionar(int novoValor) {
		
		Elemento novoElemento = new Elemento(novoValor);
		
		if(this.primeiro==null && this.ultimo==null) {
			
			this.primeiro = novoElemento;
			this.ultimo = novoElemento ;
			
		}else {
			
			ultimo.setProximo(novoElemento);
			this.ultimo = novoElemento;

			
		}
		
		this.tamanho++;
		
		
	}
	
	

	public void remover(int valorProcurado) {
		
		Elemento anterior = null;
		Elemento atual = this.primeiro;
		
		for(int i=0 ; i< this.getTamanho() ; i++) {
			
			
		 if(atual.getValor() ==(valorProcurado)) {
			 
			 if(atual == primeiro && atual == ultimo) {
				 
				 this.primeiro = null;
				 this.ultimo = null;
				 
			 }
			 
			 else if(atual==primeiro) {
				
				 this.primeiro = atual.getProximo();
				 atual.setProximo(null);
				 
			 }else if(atual==ultimo) {
				 
				 this.ultimo = anterior;
				 anterior.setProximo(atual);
				 
				
				 
				 
			 }else {
				 
					anterior.setProximo(atual.getProximo());
					atual = null;
				 
			 }
			 
			this.tamanho--;
			break;
		   
			}
		 
		 anterior = atual;
		 atual = atual.getProximo();
			
		}
		
		
		
	}
	

	
	
	public Elemento get(int posicao) {
		
		
		Elemento atual = this.primeiro;
		for(int i=0 ; i<posicao ; i++) {
			
			if(atual.getProximo()!=null) {
				
				atual = atual.getProximo();
				
			}
			
		}
		
		return atual;
	
	}
	
	
		
		
	



	@Override
	public String toString() {
		
		
		
		if(this.getTamanho()==0) {
			
			return "[ ]";
		}
		
		else {
		StringBuffer sb = new StringBuffer();
		
		
	
		
	
		sb.append("[");
		

		Elemento atual = this.primeiro;
		
		for(int i=0 ; i <=this.getTamanho() ; i++) {
		
	          if(atual.getProximo()!=null) {
				
	        	sb.append(atual.getValor()+" ");
			
	        	atual = atual.getProximo();
				
			}
			
			
		}
		
		if(this.getTamanho()>=1) {
			
			sb.append(this.ultimo.getValor());
			
		}
			
		
		
		sb.append("]");
		return sb.toString();
		
	
	}


	
	
	}

}
