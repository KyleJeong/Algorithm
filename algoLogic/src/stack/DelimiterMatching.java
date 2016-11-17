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
						//��ȣ�� Ʋ���� �´��� üũ
						if(!stack.isStackEmpty()){
							char bb = stack.pop();
							if((bb == '(' && target != ')')|| (bb == '{' && target != '}') || (bb == '[' && target != ']')){
								flag = false;
							}
						}else{
							//�����ʿ� ��ȣ�� �� �ִ��� üũ�Ѵ�
							flag = false;
						}
						break;
					default:
						break;
				}
				
			}
			//���ʿ� ��ȣ�� ������ üũ�Ѵ�
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
