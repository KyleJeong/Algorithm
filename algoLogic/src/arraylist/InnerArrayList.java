package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class InnerArrayList {
	
	public static void main(String[] args){
		
		ArrayList<Integer> list = new ArrayList<>();
		
		//�߰�
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		
		//Ư�� ��ġ �߰�
		list.add(1,6);
		
		System.out.println(list);
		
		//����
		list.remove(2);
		
		System.out.println(list);
		
		//��������
		System.out.println(list.get(3));
		
		//Ž��(iterator)
		Iterator it = list.iterator();
		while(it.hasNext()){
			int value = (int)it.next();
			if(value == 3){
				it.remove();
			}
		}
		System.out.println(list);
		
		//Ž��(for each)
		for(int value : list){
			System.out.println(value);
		}
		
		//Ž��(for)
		for(int i = 0 ; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
	}

}
