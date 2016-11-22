package queue;

public class DynamicQueue {

	int rear = -1;
	int front = 0;
	int currentSize = 0;
	private int[] queueArr;
	private int capacity = 2;
	
	public DynamicQueue(){
		this.queueArr = new int[capacity];
	}
	
	public void enqueue(int element){
		if(isQueueFull()){
			System.out.println("Queue is full");
			increaseCapacity();
		}
		rear++;
		if(rear == capacity){
			rear = 0;
		}
		currentSize++;
		this.queueArr[rear] = element;
		System.out.println("adding:"+element);
		
		System.out.println("rear:"+rear);
		
	}
	
	public void dequeue(){
		if(isQueueEmpty()){
			System.out.println("Queue is empty");
		}else{
			front++;
			if(front > queueArr.length-1){
				System.out.println("dequeue:"+this.queueArr[front-1]);
				front = 0;
			}else{
				System.out.println("dequeue:"+this.queueArr[front-1]);
			}
			currentSize--;
			
			System.out.println("front:"+front);
		}
	}
	
	public void increaseCapacity(){
		
		this.capacity = capacity * 2;
		int[] newArry = new int[capacity];
		
		for(int i = 0; i<currentSize; i++){
			newArry[i] = queueArr[i];
		}
		this.queueArr = newArry;
		
		System.out.println("increase Size: "+this.queueArr.length);
		this.rear = currentSize-1;
	}
	
	public boolean isQueueEmpty(){
		return(currentSize == 0);
	}
	
	public boolean isQueueFull(){
		return(currentSize == capacity);
	}
	
	public static void main(String[]args){
		
		DynamicQueue qq = new DynamicQueue();
			qq.enqueue(1);
			qq.enqueue(2);
			qq.enqueue(3);
			qq.dequeue();
			qq.dequeue();
			qq.dequeue();
			qq.enqueue(4);
			qq.dequeue();
			qq.enqueue(5);
			qq.enqueue(6);
		
	}
}
