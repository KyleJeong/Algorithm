package stack;

public class DelimiterMatching {
	
	
	public static void main(String[]args) throws Exception{
		
		boolean result;
		
		DelimiterMatching aa = new DelimiterMatching();
		
		result = aa.isDelimiterMatching("((a+b))-[a+b]");
		System.out.println(result);
	}
	
	public boolean isDelimiterMatching(String element) throws Exception{
		
		int size = element.length();
		StackImp stack = new StackImp(size);
		boolean flag = true;
		
			for(int i = 0; i<size; i++){
				char target = element.charAt(i);
				switch(target){
					case '(':
					case '[':
					case '{':
						stack.push(target);
						break;
					case ')':
					case ']':
					case '}':
						//괄호가 틀린지 맞는지 체크
						if(!stack.isStackEmpty()){
							char bb = stack.pop();
							if((bb == '(' && target != ')')|| (bb == '{' && target != '}') || (bb == '[' && target != ']')){
								flag = false;
							}
						}else{
							//오른쪽에 괄호가 더 있는지 체크한다
							flag = false;
						}
						break;
					default:
						break;
				}
				
			}
			//왼쪽에 괄호가 많은지 체크한다
			if(!stack.isStackEmpty()){
				flag = false;
			}
			
			return flag;
		
	}
	
}

class StackImp{
	
	private int top;
	private int stackSize;
	private char[] stackArr;
	
	public StackImp(int size){
		this.top = -1;
		this.stackSize = size;
		this.stackArr = new char[stackSize];
	}
	
	public void push(char element)throws Exception{
		this.stackArr[++top] = element;
	}
	
	public char pop()throws Exception{
		return this.stackArr[top--];
	}
	
	public boolean isStackEmpty(){
		return (top == -1);
	}
	
	public boolean isStackFull(){
		return(top == stackSize -1);
	}
	
}
