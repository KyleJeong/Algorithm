package queue;

import java.util.ArrayList;
import java.util.List;

public class DoubleEndedQueue {
	
	List<Integer> decue = new ArrayList<>();
	
	public void insertFront(int element){
		System.out.println("inserting at front:"+element);
		decue.add(0,element);
		System.out.println(decue);
	}
	
	public void insertRear(int element){
		System.out.println("inserting at rear:"+element);
		decue.add(element);
		System.out.println(decue);
	}
	
	public void removeFront(){
		if(decue.isEmpty()){
			System.out.println("queus is empty");
			return;
		}
		System.out.println("removing at front:"+decue.remove(0));
		System.out.println(decue);
	}
	
	public void removeRear(){
		if(decue.isEmpty()){
			System.out.println("decue is empty");
			return;
		}
		System.out.println("removing at rear:"+decue.remove(decue.size()-1));
		System.out.println(decue);
	}
	
	public int peekFront(){
		
		int element = decue.get(0);
		System.out.println("Element is front" + element);
		return element;
	}
	
	public int peekRear(){
		
		int element = decue.get(decue.size()-1);
		System.out.println("Element is front" + element);
		return element;
	}
	
	public static void main(String[]args){
		
		DoubleEndedQueue que = new DoubleEndedQueue();
		
		que.insertFront(50);
		que.insertFront(30);
		que.insertRear(10);
		que.insertRear(60);
		que.removeFront();
		que.removeRear();
		que.removeFront();
		que.removeRear();
		que.removeFront();
		
	}

}
