package queue;

public class DoubleLinkedListDeque<T> {

	Node<T> front;
	Node<T> rear;
	int size = 0;
	
	public void addFront(T element){
		
		Node<T> newNode = new Node<>();
		
		newNode.setData(element);
		newNode.setNext(front);
		
		if(front != null){
			front.setPre(newNode);
		}
		if(front == null){
			rear = newNode;
		}
		
		front = newNode;
		size++;
	}
	
	public void addLast(T element){
		
		Node<T> newNode = new Node<>();
		newNode.setPre(rear);
		newNode.setData(element);
		
		if(rear != null){
			rear.setNext(newNode);
		}
		if(rear == null){
			front = newNode;
		}
		rear = newNode;
		size++;
	}
	
	public void removeLast()throws Exception{
		if(isNullCheck()){
			throw new Exception("List is null");
		}else{
			Node<T> temp = rear.getPre();
			
			if(temp != null){
				temp.setNext(null);
			}
			if(temp == null){
				front = null;
			}
			rear = temp;
			
			temp = null;
			
			size--;
		}
	}
	
	public void removeFront()throws Exception{
		
		if(isNullCheck()){
			throw new Exception("List is null");
		}{
			Node<T> temp = front.getNext();
			if(temp != null){
				temp.setPre(null);
			}
			if(temp == null){
				rear = null;
			}
			front = temp;
			
			temp = null;
			
			size--;
			
		}
	}
	
	public boolean isNullCheck(){
		return(size == 0);
	}
	
	public String toString(){
		
		Node<T> temp = front;
		String str = "{";
		
		if(temp != null){
			for(int i = 0; i<size-1; i++){
				str += temp.getData()+",";
				temp = temp.getNext();
				
			}
			str += temp.getData();
		}
		
		str += "}";
		return str;
		
	}
	
	public static void main(String[]args){
		DoubleLinkedListDeque<Integer> list = new DoubleLinkedListDeque<>();
		
		try{
			list.addFront(1);
			list.addFront(2);
			list.addFront(3);
			list.addLast(4);
			list.addLast(5);
			list.removeFront();
			list.removeLast();
			list.removeLast();
			list.removeLast();
			list.removeLast();
			System.out.println(list);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}

class Node<T>{
	
	private T data;
	private Node<T> next;
	private Node<T> pre;
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public Node<T> getPre() {
		return pre;
	}
	public void setPre(Node<T> pre) {
		this.pre = pre;
	}
	
}
