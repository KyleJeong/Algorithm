package arraylist;

public class ArrayListImpl {
	
	public static void main(String[]args){
		ArrayList<Integer> list = new ArrayList<>();
		
		list.addLast(1);
		list.addLast(2);
		System.out.println(list);
		list.addFirst(10);
		list.addFirst(20);
		System.out.println(list);
		list.add(2, 100);
		list.add(0, 200);
		list.addLast(300);
		list.addLast(400);
		System.out.println(list);
		list.addLast(500);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.indexOf(100));
		
	}
	
}

class ArrayList<E>{
	
	private int size = 0;
	private E[] data = (E[]) new Object[2];
	
	public boolean addLast(E element){
		
		if(isArrayFull()){
			increaseArray();
			System.out.println("Increasing array");
		}
		
		data[size] = element;
		size++;
		
		return true;
	}
	
	public boolean addFirst(E element){
		
		add(0, element);
		
		return true;
	}
	
	public boolean add(int index, E element){
		
		if(isArrayFull()){
			increaseArray();
			System.out.println("Increasing array");
		}
		for(int i = size - 1; i >= index; i--){
			data[i+1] = data[i]; 
		}
		data[index] = element;
		
		size++;
		
		return true;
		
	}
	
	public E remove(int index){
		
		E dataRemoved = data[index];
		
		for(int i = index; i < size -1 ; i++){
			data[i] = data[i+1];
		}
		size--;
		
		return dataRemoved;
		
	}
	
	public E removeFirst(){
		return remove(0);
	}
	
	public E removeLast(){
		return remove(size - 1);
	}
	
	public E get(int index){
		
		return data[index];
	}
	
	public int indexOf(E element){
		
		int index = 0;
		
		for(int i = 0; i<size; i++){
			if(data[i].equals(element)){
				index = i;
			}
		}
		
		return index;
	}
	
	public void increaseArray(){
		
		E[] newArry = (E[]) new Object[data.length * 2];
		
		for(int i = 0; i<size; i++){
			newArry[i] = data[i];
		}
		
		data = newArry;
		
	}
	
	public boolean isArrayFull(){
		return(size == data.length);
	}
	
	public String toString(){
		
		String str = "[";
		
		for(int i = 0; i<size; i++){
			str += data[i];
			if(i != size-1){
				str += ",";
			}
		}
		
		str += "]";
		
		return str;
		
	}
}
