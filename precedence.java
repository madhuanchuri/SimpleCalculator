
public class precedence {
	
	int precedence(char operator){ //method for declaring priorities
	    // higher number represents high priority and this can be changed according to user requirement
	    switch(operator){
	        case '-':return 1;
	        case '+':return 2;
	        case '*':return 3;
	        case '/':return 4;
	        default :return 0; //default value for other operators 
	    }
	}
}
