package stack;

import java.util.Scanner;

public class ReverseAword {
	
	public String reverseWord(String word) throws Exception{
		
		StringBuilder sb = new StringBuilder();
		int size = word.length();
		Stack st = new Stack(size);
		for(int i = 0; i<size; i++){
			st.push(word.charAt(i));
		}
		while(!st.isStackEmpty()){
			sb.append(st.pop());
		}
		return sb.toString();
	}
	
	public static void main(String[]args) throws Exception{
		
		ReverseAword aaa=new ReverseAword();
		
		Scanner word = new Scanner(System.in);
		String a = word.next();
		System.out.println(a+">>>>>"+aaa.reverseWord(a));
		word.close();
		
	}
	
}

class Stack{
	
	private int top;
	private int stackSize;
	private char[] stackArr;
	
	public Stack(int size){
		this.top = -1;
		this.stackSize = size;
		this.stackArr = new char[stackSize];
	}
	
	public void push(char element)throws Exception{
		if(this.isStackFull()){
			throw new Exception("Stack is full");
		}
		this.stackArr[++top] = element;
	}
	
	public char pop()throws Exception{
		if(this.isStackEmpty()){
			throw new Exception("Stack is empty");
		}
		return stackArr[top--];
	}
	
	public boolean isStackEmpty(){
		return (top == -1);
	}
	
	public boolean isStackFull(){
		return(top == stackSize -1);
	}
	
}