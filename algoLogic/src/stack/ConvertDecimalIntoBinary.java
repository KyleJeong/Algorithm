package stack;

public class ConvertDecimalIntoBinary {
	
	public String converter(int element) throws Exception{
		
		DynamicStackImp stack = new DynamicStackImp(5);
		StringBuilder add = new StringBuilder();
		
		int remainder = 0;
		int quotient = element;
		boolean flag = true;
		
		
		while(flag){
			remainder = quotient%2;
			quotient = quotient/2;
			stack.push(remainder);
			
			if(quotient == 0 || quotient == 1){
				stack.push(quotient);
				flag = false;
			}
		}
		
		while(!stack.isStackEmpty()){
			add.append(stack.pop());
		}
		
		return add.toString();
		
	}
	
	public static void main(String[]args) throws Exception{
		
		ConvertDecimalIntoBinary convert = new ConvertDecimalIntoBinary();
		
		System.out.println(convert.converter(41));
		
	}
	
}

class DynamicStackImp{
	
	private int top;
	private int stackSize;
	private int[] stackArr;
	
	public DynamicStackImp(int size){
		this.top = -1;
		this.stackSize = size;
		this.stackArr = new int[stackSize];
	}
	
	public void push(int element){
		if(this.isStackFull()){
			System.out.println("Stack is full");
			this.increaseCapacity();
		}
		stackArr[++top] = element;
	}
	
	public int pop()throws Exception{
		if(this.isStackEmpty()){
			throw new Exception("Stack is empty");
		}
		return stackArr[top--];
	}
	
	public boolean isStackEmpty(){
		return(top == -1);
	}
	
	public boolean isStackFull(){
		return(top == stackSize -1);
	}
	
	public void increaseCapacity(){
		
		int[] newArry = new int[stackSize * 2];
		
		for(int i = 0; i<stackSize; i++){
			newArry[i] = stackArr[i];
		}
		System.out.println("Stack size is extended");
		this.stackArr = newArry;
		this.stackSize = stackSize *2;
	}
	
}
