import java.util.Stack;

public class ValidParenthesesFast {

	public static void main(String[] args) {

		
		System.out.println(isValid("(([]){})"));
	}

	public static boolean isValid(String s) {

		//Cria uma pilha para armazenar os personagens
        Stack<Character> stack = new Stack<>();
     

     //converte string em um array de char e acessa os caracteres
     //usando for each loop.
        for(char ch: s.toCharArray())
        {
            // verifica ch
            switch (ch)
            {
        // abre o colchete e empurreo-o na pilha
        // fecha o colchete, abre o item e compara
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    System.out.println(stack);
                    break;
                case ')':
                System.out.println(stack);
               if(stack.isEmpty() || stack.pop() != '(')

      
     // se a pilha estiver vazia, significa que a string n�o 
     // tem colchetes abertos
     // portanto � inv�lido
                    {
                        return false;
                    }
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{')
                    {
                        return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[')
                    {
                        return false;
                    }
                    break;
            }
        }


        // Ap�s o loop temos que verificar mais uma condi��o
        // retorna verdadeiro somente se a pilha estiver vazia
        // se a pilha n�o estiver vazia, isso significa que temos
        //colchetes n�o utilizados
    
        return stack.isEmpty();
       
    }
}