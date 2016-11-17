package stack;

public class DynamicStack {
	
	private int top;
	private int[] stackArray;
	private int stackSize;
	
	public DynamicStack(int size){
		this.top = -1;
		this.stackSize = size;
		this.stackArray = new int[stackSize];
	}
	
	public void push(int element)throws Exception{
		if(this.isStackFull()){
			System.out.println("Stack is full, We increase a stack size");
			this.increaseCapacity();
		}
		System.out.println("adding:"+element);
		this.stackArray[++top] = element;
	}
	
	public int pop()throws Exception{
		if(this.isStackEmpty()){
			throw new Exception("Stack is empty");
		}
		int entity = stackArray[top--];
		System.out.println("poping:"+entity);
		return entity;
	}
	
	public int peek(){
		System.out.println("peek:"+stackArray[top]);
		return stackArray[top];
	}
	
	public boolean isStackEmpty(){
		return ( top == -1);
	}
	
	public boolean isStackFull(){
		return (stackSize-1 == top);
	}
	
	public void increaseCapacity(){
		
		int[] newArray = new int[stackSize *2];
		for(int i = 0; i<stackArray.length;i++){
			newArray[i] = this.stackArray[i];
		}
		this.stackArray = newArray;
		this.stackSize = this.stackSize *2;
		
	}
	
	public static void main(String[]args){
		
		DynamicStack s1 = new DynamicStack(3);
		
		try{
			s1.push(1);
			s1.push(2);
			s1.push(3);
			s1.push(4);
			s1.push(5);
			s1.pop();
			s1.peek();
			s1.pop();
			s1.push(6);
			s1.push(7);
			s1.push(8);
			s1.push(9);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
