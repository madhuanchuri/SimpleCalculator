//import java.util.LinkedList;
//import java.util.List;
//import java.util.Scanner;
//import java.util.Stack;
import java.util.*;

public class ExpressionCalculator extends evaluatePostfix {

	
	
	
	public int calculate(String s) {
		return evaluatePostfix1(s);
	}


	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the expression to evaluate with operators +,-,*,/:");
		Scanner scan = new Scanner(System.in);
		String expression = scan.nextLine(); //take input from command line
		ExpressionCalculator sol = new ExpressionCalculator(); //creation object for solution class
		validate val = new validate();
		boolean validate = val.validateexpression(expression);
		
		if(validate){
		int ans = sol.calculate(expression); //sending expression to calculate method to evaluate and storing the return value in ans
		System.out.println(ans);//printing final result
		}
		
		}

	
}
