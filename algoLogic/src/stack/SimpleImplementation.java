package stack;

public class SimpleImplementation {
	
	private int stackSize;
	private int top;
	private int[] stackArray;
	
	public SimpleImplementation(int size){
		this.stackSize = size;
		this.top = -1;
		this.stackArray= new int[stackSize]; 
	}
	
	public void push(int element) throws Exception{
		if(this.isStackFull()){
			throw new Exception("Stack is full");
		}
		System.out.println("pushing:"+element);
		this.stackArray[++top] = element;
	}
	
	public int pop() throws Exception{
		if(this.isStackEmpty()){
			throw new Exception("Stack is empty");
		}
		int element = stackArray[top--];
		System.out.println("poping:"+element);
		return element;
	}
	
	public int peek(){
		System.out.println("peek:"+stackArray[top]);
		return stackArray[top];
	}
	
	public boolean isStackEmpty(){
		if(top == -1){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isStackFull(){
		if(top == stackSize - 1){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[]args){
		SimpleImplementation stack = new SimpleImplementation(3);
		
		try{
			stack.push(1);
			stack.push(2);
			stack.push(3);
			stack.pop();
			stack.push(4);
			stack.peek();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
