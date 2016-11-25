package linkedlist;

public class DoubleLinkedList<E> {
	
	private Node<E> head;
	private Node<E> tail;
	private int size = 0;
	
	private class Node<E>{
		
		private E data;
		private Node<E> pre;
		private Node<E> next;
		
		public Node(E data, Node pre, Node next){
			this.data = data;
			this.pre = pre;
			this.next = next;
		}
		
	}
	
	public void addFirst(E element){
		
		Node<E> newNode = new Node(element, head, null);
		
		if(head != null){
			head.pre = newNode;
		}
		
		newNode.next = head;
		size++;
		head = newNode;
		if(head.next == null){
			tail = head;
		}
	}
	
	public void add(int x, E element){
		
		Node<E> newNode = new Node(element,head,tail);
		
		if(x == 0){
			addFirst(element);
		}else if(x == size){
			addLast(element);
		}else{
			
			Node<E> temp = node(x-1);
			Node<E> temp2 = temp.next;
			
			temp.next = newNode;
			newNode.next = temp2;
			if(temp2 != null){
				temp2.pre = newNode;
			}
			newNode.pre = temp;
			size++;
			
			if(newNode.next == null){
				tail = newNode;
			}
		}
		
	}
	
	public void addLast(E element){
		
		Node<E> newNode = new Node(element, head, null);
		
		
		if(size == 0){
			addFirst(element);
		}else{
			tail.next = newNode;
			newNode.pre = tail;
			tail = newNode;
			size++;
		}
	}
	
	public E deleteLast()throws Exception{
		if(isNullCheck()){
			throw new Exception("List is empty");
		}else{
			
			Node<E> temp = tail;
			E returnObject = temp.data;
			
			tail = temp.pre;
			
			temp = null;
			size--;
			if(tail != null){
				tail.next = null;
			}
			return returnObject;
			
		}
	}
	
	public E delete(int x)throws Exception{
		
		E returnObject = null;
		
		if(isNullCheck()){
			throw new Exception("List is empty");
		}else{
			
			if(x == 0){
				deleteFirst();
			}else if(x == size - 1){
				deleteLast();
			}else{
				Node<E> temp = node(x-1);
				Node<E> deleted = temp.next;
				returnObject = deleted.data;
				
				temp.next = deleted.next;
				
				deleted.next.pre = temp;
				deleted = null;
				size--;
				
			}
			return returnObject;
			
		}
	}
	
	public E deleteFirst()throws Exception{
		
		if(isNullCheck()){
			throw new Exception("List is empty");
		}else{
			Node<E> temp = head;
			
			head = temp.next;
			E returnObject = temp.data;
			temp = null;
			
			if(head != null){
				head.pre = null;
			}
			size--;
			
			return returnObject;
		}
	}
	
	public E get(int x){
		
		Node<E> temp = node(x);
		
		return temp.data;
		
	}
	
	public int indexOf(E element){
		
		Node<E> temp = head;
		int index = 0;
		
		while(temp.data != element){
			
			index++;
			temp = temp.next;
			
			if(temp == null){
				index = -1;
			}
			
		}
		
		return index;
	}
	
	public Node<E> node(int index){
		
		if(index <= size/2){
			
			Node<E> temp = head;
			
			for(int i = 0; i<index; i++){
				temp = temp.next;
			}
			
			return temp;
			
		}else{
			
			Node<E> temp = tail;
			
			for(int i = size - 1; i > index; i--){
				temp = temp.pre;
			}
			
			return temp;
			
		}
	}
	
	public boolean isNullCheck(){
		return (head == null);
	}
	
	public String toString(){
		
		String str = "{";
		
		Node<E> temp = head;
		
		if(temp != null){
			while(temp.next != null){
				str += temp.data +",";
				temp = temp.next;
			}
			
			str += temp.data;
		}
		
		return str + "}";
		
	}
	
	public static void main(String[]args){
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
		try{
			
			list.addLast(5);
			list.addLast(6);
			list.addLast(7);
			list.addLast(8);
			System.out.println(list.get(1));
			System.out.println(list.indexOf(8));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println(list);
		
	}
	
}

