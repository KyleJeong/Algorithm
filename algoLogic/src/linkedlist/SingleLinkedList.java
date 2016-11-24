package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class SingleLinkedList<T> {
	
	private Node<T> head;
	private Node<T> tail;
	private int size = 0;
	
	public void addLast(T element){
		
		Node<T> newNode = new Node<T>();
		newNode.setValue(element);
		System.out.println("adding:"+element);
		size++;
		
		if(head == null){
			head = newNode;
			tail = newNode;
		}else{
			//이 부분은 결국 앞 노드의 다음 노드를 가르키는 부분을 셋팅 하는 것과 같다
			tail.setNextRef(newNode);
			tail = newNode;
		}
	}
	
	public void add(T element,int index){
		
		Node<T> newNode = new Node<>();
		newNode.setValue(element);
		
		if(size == index + 1){
			addLast(element);
			
		}else if(index == 0){
			addFirst(element);
		}else{
			Node<T> temp = node(index-1);
			newNode.setNextRef(temp.getNextRef());
			temp.setNextRef(newNode);
			size++;
			
			if(newNode.getNextRef() == null){
				tail = newNode;
			}
		}
		
	}
	
	public void addFirst(T element){
		Node<T> newNode = new Node<>();
		newNode.setValue(element);
		newNode.setNextRef(head);
		head = newNode;
		size++;
		//처음 노드 일 때 
		if(head.getNextRef() == null){
			tail = newNode;
		}
	}
	
	public Node<T> node(int x){
		
		Node<T> temp = head;
		
		//인덱스 값을 바탕으로 탐색을 시작
		for(int i = 0; i<x; i++){
			temp = temp.getNextRef();
		}
		
		return temp;
	}
	
	public T get(int x){
		
		Node<T> temp = node(x);
		
		return temp.getValue();
	}
	
	public Node<T> deleteFirst(){
		
		Node<T> returnData = head;
		head = returnData.getNextRef();
		System.out.println("deleteFirst:"+returnData.getValue());
		size--;
		return returnData;
		
	}
	
	public Node<T> delete(int element){
		
		if(element == 0){
			
			return deleteFirst();
			
		}
		Node<T> temp = node(element-1);
		Node<T> deletedData = temp.getNextRef();
		temp.setNextRef(temp.getNextRef().getNextRef());
		size--;
		if(deletedData == tail){
			tail = temp;
		}
		System.out.println("delete:" +deletedData.getValue());
		return 	deletedData;
	}
	
	public Node<T> deleteLast(){
		return delete(size-1);
	}
	
	public String toString(){
		
		if(head == null){
			return "[]";
		}
		
		Node<T> temp = head;
		
		String str = "[";
		
		while(temp.getNextRef() != null){
			
			str += temp.getValue() + ",";
			temp = temp.getNextRef();
		}
		
		str += temp.getValue();
		return str+"]";
		
	}
	
	public static void main(String[]args){
		SingleLinkedList<Integer> node = new SingleLinkedList();
		node.addLast(1);
		System.out.println(node);
		node.addLast(2);
		System.out.println(node);
		node.addLast(3);
		System.out.println(node);
		node.addFirst(9);
		System.out.println(node);
		node.addFirst(10);
		System.out.println(node);
		node.deleteLast();
		System.out.println(node);
		node.deleteLast();
		System.out.println(node);
		node.add(99, 1);
		System.out.println(node);
		node.add(100, 3);
		System.out.println(node);
		node.add(1000, 0);
		System.out.println(node);
		System.out.println(node.get(2));
	}
	
}

class Node<T> {
	
	private Node<T> nextRef;
	private T value;
	
	public void setValue(T value){
		this.value = value;
	}
	
	public T getValue(){
		return value;
	}
	
	public void setNextRef(Node<T> nextRef){
		this.nextRef = nextRef;
	}
	
	public Node<T> getNextRef(){
		return nextRef;
	}
	
}
