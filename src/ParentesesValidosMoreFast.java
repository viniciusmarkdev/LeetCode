
public class ParentesesValidosMoreFast {
	
	public static void main(String[] args) {
		
		System.out.println(isValid("(([][{})"));
		
		System.out.println("()".length());
		System.out.println("()".length()+1);
	}

	public static boolean isValid(String s) {
		
		    int n = s.length();
	        int[] index = new int[n + 1];
	        int top = 0;

	        for (int i = 0; i < n; i++) {
	            char c = s.charAt(i);
	            if (c == '(' || c == '[' || c == '{') {
	                top++;
	                index[top] = c;
	            } else if (c == ')') {
	                if (top == 0 || index[top] != '(') {
	                    return false;
	                }
	                top--;
	            } else if (c == ']') {
	                if (top == 0 || index[top] != '[') {
	                    return false;
	                }
	                top--;
	            } else if (c == '}') {
	                if (top == 0 || index[top] != '{') {
	                    return false;
	                }
	                top--;
	            }
	        }
	        return top == 0;

	}
}
