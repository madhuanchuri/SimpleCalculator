
import java.util.*;

public class validate {
	int m;
	ArrayList<String> values = new ArrayList<String>();

	validate(){
	for(int i=0;i<10;i++)
	{
		values.add(String.valueOf(i));	
	}
	values.add("+");
	values.add("-");
	values.add("*");
	values.add("/");
}	
	
	private int listvalidate(char[] s){
		char[] ex = s;
		int j=0;
		for(int i=0;i<ex.length;i++){
			if(values.contains(String.valueOf(ex[i]))){
				j=1;
			}else{
				j=2;
			break;
			}
	}
		
		return j;
	}
	
	public boolean validateexpression(String s){
		char[] ex = s.toCharArray();
		
		validate v = new validate();
		int k = v.listvalidate(ex);
		//System.out.println(k);
		if(k==1){
		for (int i=0;i<=ex.length-1;i++){
					if(!(ex[0]>='0' && ex[0]<='9')){
						System.out.println("please enter valid expression");
						m=2;
						break;
					}else if(!(ex[i]>='0' && ex[i]<='9')){
						if(!(ex[i+1]>='0' && ex[i+1]<='9')){
							System.out.println("please enter valid expression");
							m=2;
							break;
							}
					}
		}
			if(m==2){
				return false;
				}
			else{
				return true;
			}
	}	else{
		System.out.println("Please enter valid expression with operators +,-,*,/");
			return false;
		}
	}
		
		
		
}
	
	
	

