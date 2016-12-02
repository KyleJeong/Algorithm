package sorting;

public class SelectionSorting {
	
	public static void selection(int[]arry){
		
		//배열 크기만큼 회전
		for(int i = 0;i<arry.length; i++){
			int index = i;
			//첫 번째 다음 요소 부터 검색을 시작한다
			for(int k = i+1; k<arry.length; k++){
				
				//검색을 해서 가장작은 값을 찾으면 인덱스를 저장
				if(arry[index] > arry[k]){
					index = k;
				}
			}
			//가장 작은 값과 맨 앞의 값을 교환
			swap(i,index,arry);
			print(arry);
		}
	}
	
	public static void swap(int i, int k, int[]arry){
		int temp;
		temp = arry[k];
		arry[k] = arry[i];
		arry[i] = temp;
	}
	
	public static void print(int[]arry){
		
		for(int i = 0; i<arry.length; i++){
			System.out.print(arry[i]+",");
		}
		System.out.println();
	}
	
	public static void main(String[]args){
		int[] input = {2,3,10,1,-5};
		selection(input);
	}

}
