
public class TesteListaLigada {
	
	public static void main(String[] args) {
		
	 
		
	  
	   
	
	 
	  
		
		ListaLigadaPratica list = new ListaLigadaPratica();
		
		list.adicionar(1);
		list.adicionar(2);
		list.adicionar(4);
	
		
		System.out.println("O tamanho da lista é " + list.getTamanho());
		
		System.out.println("O primeiro elemento é  : "+list.getPrimeiro().getValor());
		System.out.println("O ultimo elemento é : " +list.getUltimo().getValor());
	
		
		System.out.println("");
		
		for(int i=0 ; i<list.getTamanho() ; i++) {
			
			System.out.println(list.get(i).getValor());
		}
		
	

		System.out.println("Mostrar lista : " + list.toString());
		
		
	
		
	
		
		System.out.println("O tamanho da lista é " + list.getTamanho());
		
		
		System.out.println("Removendo itens");
		
	
	
		
		
		System.out.println("Mostrar lista : " + list.toString());
		System.out.println("O tamanho da lista é " + list.getTamanho());
		
		System.out.println("O primeiro item da lista e :" + list.getPrimeiro().getValor());
		
		System.out.println("O ultimo item da lista é : " + list.getUltimo().getValor());
		
		
		
		
		System.out.println(list);
		
		
		
		;
		
	}

}
