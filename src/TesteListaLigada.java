
public class TesteListaLigada {
	
	public static void main(String[] args) {
		
		ListaLigadaPratica list = new ListaLigadaPratica();
		list.adicionar("SP");
		list.adicionar("RJ");
		list.adicionar("DF");
		list.adicionar("AC");
		list.adicionar("AM");
		
		System.out.println("O tamanho da lista � " + list.getTamanho());
		
		System.out.println("O primeiro elemento �  : "+list.getPrimeiro().getValor());
		System.out.println("O ultimo elemento � : " +list.getUltimo().getValor());
	
		
		System.out.println("");
		
		for(int i=0 ; i<list.getTamanho() ; i++) {
			
			System.out.println(list.get(i).getValor());
		}
		
	

		System.out.println("Mostrar lista : " + list.toString());
		
		
	
		
	
		
		System.out.println("O tamanho da lista � " + list.getTamanho());
		
		
		System.out.println("Removendo itens");
		
	
		list.remover("SP");
		list.remover("RJ");
		list.remover("DF");
		list.remover("AC");
	
		
		
		System.out.println("Mostrar lista : " + list.toString());
		System.out.println("O tamanho da lista � " + list.getTamanho());
		
		System.out.println("O primeiro item da lista e :" + list.getPrimeiro().getValor());
		
		System.out.println("O ultimo item da lista � : " + list.getUltimo().getValor());
		
		
		
		
	}

}
