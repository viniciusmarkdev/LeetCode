
public class TamanhoDaUltimaPalavra {
	
	
	public static void main(String[] args) {
		
		int a = lengthOfLastWord("Hello World");
	}
	
	
    public static int lengthOfLastWord(String s) {

		 if (s == null || s.isEmpty()) {
			 
            return 0;
        }

        String trimmedString = s.trim();
        int lastSpaceIndex = trimmedString.lastIndexOf(' ');

        if (lastSpaceIndex == -1) {
        	
            return trimmedString.length();
            
        } else {
        	
            return trimmedString.length() - lastSpaceIndex - 1;
        }

			
    	
        
    }


}
