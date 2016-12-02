package queue;

public class PriorityQueue {
	
	@SuppressWarnings("rawtypes")
	private Comparable[] pQueue;
	private int index = 0;
	
	public PriorityQueue(int size){
		pQueue = new Comparable[size];
	}
	
	public void insertQueue(Comparable element){
		if(index == pQueue.length){
			System.out.println("Queue is full");
			return;
		}
		pQueue[index] = element;
		index++;
	}
	
	public Comparable remove(){
		if(index == 0){
			System.out.println("Queue is empty");
			return null;
		}
		int maxIndex = 0;
		for(int i = 1; i<index; i++){
			if(pQueue[i].compareTo(pQueue[maxIndex]) > 0){
				maxIndex = i;
			}
		}
		Comparable result = pQueue[maxIndex];
		
		System.out.println("removing:"+result);
		
		index--;
		pQueue[maxIndex] = pQueue[index];
		pQueue[index] = null;
		return result;
		
	}
	
	public String toString(){
		
		String str = "[";
		
		for(int i=0; i < pQueue.length-1; i++){
			str += pQueue[i]+",";
		}
		
		str += pQueue[pQueue.length-1] +"]";
		
		return str;
		
	}
	
	public static void  main(String[]args){
		PriorityQueue pQueue = new PriorityQueue(5);
		pQueue.insertQueue(30);
		pQueue.insertQueue(5);
		pQueue.insertQueue(10);
		pQueue.insertQueue(1);
		pQueue.insertQueue(2);
		System.out.println(pQueue);
		pQueue.remove();
		pQueue.remove();
		pQueue.remove();
		System.out.println(pQueue);
	}
	

}
