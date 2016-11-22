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
			//������ �Ŀ� dequeue�ϰ� �ٽ� enqueue �Ҷ��� ���� rear�� �ʱ�ȭ �Ѵ�
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
			//������ queue�� �� �����ϰ� �ٽ� ó������ �Էµ� ť�� �������� front �ʱ�ȭ �Ѵ�
			// �ʱ�ȭ�� front 0 ������ �Ŀ� ������ ���� �ʱ� ���� if else ó��
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
