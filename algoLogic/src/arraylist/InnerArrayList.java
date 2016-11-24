package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class InnerArrayList {
	
	public static void main(String[] args){
		
		ArrayList<Integer> list = new ArrayList<>();
		
		//추가
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		
		//특정 위치 추가
		list.add(1,6);
		
		System.out.println(list);
		
		//삭제
		list.remove(2);
		
		System.out.println(list);
		
		//가져오기
		System.out.println(list.get(3));
		
		//탐색(iterator)
		Iterator it = list.iterator();
		while(it.hasNext()){
			int value = (int)it.next();
			if(value == 3){
				it.remove();
			}
		}
		System.out.println(list);
		
		//탐색(for each)
		for(int value : list){
			System.out.println(value);
		}
		
		//탐색(for)
		for(int i = 0 ; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
	}

}
