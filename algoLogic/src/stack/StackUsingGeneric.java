package stack;

public class StackUsingGeneric <T extends Object>{
	
	private int stackSize;
	private int top;
	private T[] stackArr;
	
	public StackUsingGeneric(int size){
		this.stackSize = size;
		this.top = -1;
		this.stackArr = (T[]) new Object[stackSize];
	}
	
	public void push(T element){
		if(this.isStackFull()){
			System.out.println("Stack is full");
			this.increaseCapacity();
		}
		System.out.println("adding:"+element);
		this.stackArr[++top] = element; 
	}
	
	public T pop()throws Exception{
		if(this.isStackEmpty()){
			throw new Exception("Stack is empty");
		}
		System.out.println("removing:"+stackArr[top]);
		return stackArr[top--];
		
	}
	
	public T peek(){
		System.out.println("peeking:"+this.stackArr[top]);
		return this.stackArr[top];
	}
	
	public boolean isStackEmpty(){
		return(top == -1);
	}
	
	public boolean isStackFull(){
		return (this.stackSize -1 == top);
	}
	
	public void increaseCapacity(){
		 
		T[] newArr = (T[]) new Object[stackSize * 2];
		for(int i = 0; i<stackSize; i++){
			newArr[i] = stackArr[i];
		}
		this.stackArr = newArr;
		this.stackSize = this.stackSize *2;
	}
	
	public static void main(String[]args){
		StackUsingGeneric<Integer> a1 = new StackUsingGeneric(2);
		try{
			a1.push(1);
			a1.push(2);
			a1.peek();
			a1.push(3);
			a1.pop();
			
		}catch(Exception e){
			System.out.print(e.getMessage());
		}
		
		StackUsingGeneric<String> a2 = new StackUsingGeneric(2);
		try{
			a2.push("a");
			a2.push("b");
			a2.peek();
			a2.push("c");
			a2.pop();
			
		}catch(Exception e){
			System.out.print(e.getMessage());
		}
	}

}
