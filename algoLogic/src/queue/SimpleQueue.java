package queue;

public class SimpleQueue {
	
	private int capacity;
	private int[] queueArr;
	int rear = -1;
	int front = 0;
	int currentSize = 0;
	
	public SimpleQueue(int queueSize){
		this.capacity = queueSize;
		this.queueArr = new int[capacity];
	}
	
	public void enQueue(int element){
		if(isQueueFull()){
			System.out.println("Queue is full");
		}else{
			rear++;
			//가득찬 후에 dequeue하고 다시 enqueue 할때를 위해 rear를 초기화 한다
			if(rear == capacity){
				rear = 0;
			}
			currentSize++;
			System.out.println("adding:"+element);
			this.queueArr[rear] = element;
		}
	}
	
	public void deQueue(){
		if(isQueueEmpty()){
			System.out.println("Queue is empty");
		}else{
			front++;
			//가든찬 queue를 다 제거하고 다시 처음부터 입력된 큐를 빼기위해 front 초기화 한다
			// 초기화된 front 0 값으로 후에 영향을 주지 않기 위해 if else 처리
			if(front == capacity){
				System.out.println(this.queueArr[front-1]);
				front = 0;
			}else{
				System.out.println(this.queueArr[front-1]);
			}
			currentSize--;
			
		}
	}
	
	public boolean isQueueEmpty(){
		return(currentSize == 0);
	}
	
	public boolean isQueueFull(){
		return(currentSize  == capacity );
	}
	
	public static void main(String[]args){
		SimpleQueue qu = new SimpleQueue(3);
		qu.enQueue(1);
		qu.enQueue(2);
		qu.enQueue(3);
		qu.enQueue(4);
		qu.enQueue(5);
		qu.deQueue();
		qu.deQueue();
		qu.deQueue();
		qu.deQueue();
		qu.enQueue(1);
	}

}
