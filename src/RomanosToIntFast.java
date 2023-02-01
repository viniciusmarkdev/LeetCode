
public class RomanosToIntFast {
	
	
	public static void main(String[] args) {
		
		romanToInt("III");
	}
	
	 public static int romanToInt(String s) {
		 
		 
	 /*
	  * Iniciando as v�riaveis
	  * */
	 int ans = 0, num = 0;
	 
	 /*Iterando a string come�ando pelo seu indice final
	  * e decrescendo at� o indice 0
	  * */
	 for (int i = s.length()-1; i >= 0; i--) {
		 
		 /*
		  * switch case que recebe como parametro o char 
		  * e seu indice
		  * */
		 switch(s.charAt(i)) {
		 /*Caso o indice seja I num que foi inicializado com
		  * 0 ser� 1 e assim por diante*/
		 case 'I': num = 1; break;
		 case 'V': num = 5; break;
		 case 'X': num = 10;break;
		 case 'L': num = 50;break;
		 case 'C': num = 100;break;
		 case 'D': num = 500;break;
		 case 'M': num = 1000;break;
		 
				 
		 }
		

		 /*
		  * Se o num for menor que ans , que � igual 
		  * a 0 , subtraia ans - num; 
		  * 
		  * Caso ao contratirio soma num +ans;
		  * 
		  * Exemplo :
		  * 
		  * se a string for IV , o fluxo ir� para o bloco
		  * else , pois num= 1 e ans = 5 .
		  * 
		  *  no Bloco  Else eu somarei 5 na variavel ans , que 
		  *  antes era 0.
		  *  
		  *  O pr�ximo valor de num � 1 e ans � maior que 
		  *  1 . Ent�o eu subtraio 1 de que  5 . O valor
		  *  final � 4 .
		  *  
		  *  Se eu colocar uma string , por exemplo , VI 
		  *   eu irei passar pelo bloco else duas vezes
		  *  e somarei os valores sem fazer a subtra��o.O 
		  *  valor ser� 5.
		  * */
		 if(4*num<ans) {
			
			
			 ans-=num;
			
		 }
		 else {
			
			 ans+=num;
		
		 }


		
	
	 }
	
	 System.out.println(ans);
	 return ans;

}
}
