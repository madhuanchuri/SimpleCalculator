import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class expressionToPostfix extends precedence {
	
	
	
	List<Object> expressionToPostfix1(String s) { 
		List<Object> postfixExpression = new LinkedList<Object>(); 
		Stack<Character> symbols = new Stack<Character>(); 
		int numbBuff = 0; 
		boolean bufferOperand = false;
		
		for (char c : s.toCharArray()) { 
			if (c >= '0' && c <= '9') { 
				
				numbBuff = numbBuff * 10 + c - '0'; //dec value of '0' is 48
				
				bufferOperand = true;
			} else {
				if(bufferOperand)
					postfixExpression.add(numbBuff); 
				numbBuff = 0;
				bufferOperand = false;
				
				if (c == ' '|| c == '\t')
					continue;
				
				else { // operator
					while (!(symbols.isEmpty()) && precedence(c) <= precedence(symbols.peek())){
						postfixExpression.add(symbols.pop());
					}
					symbols.push(c);
				}
			}
		
		}

		
			
		
		if (bufferOperand)
			postfixExpression.add(numbBuff);

		while (!symbols.isEmpty())
			postfixExpression.add(symbols.pop());
//System.out.println(postfixExpression);
		return postfixExpression;
	
		
		
}
}
