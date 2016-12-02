package sorting;

public class BubbleSorting {
	
	public static void bubble_sort(int arry[]){
		
		int n = arry.length;
		int k;
		//배열 크기만큼 회전을 한다
		for(int i = 0; i<n; i++){
			//배열보다 하나 작은 크기로 버블 정렬이 시작된다
			for(int l = 0; l< n-1; l++){
				k = l + 1;
				//앞뒤 요소를 비교, 앞이 크면 위치를 변경한다
				if(arry[l] > arry[k]){
					swap(l,k,arry);
				}
			}
			print(arry);
		}
	}
	
	public static void swap(int i, int k, int[]arry){
		int temp;
		
		temp = arry[i];
		arry[i] = arry[k];
		arry[k] = temp;
	}
	
	public static void print(int[]arry){
		for(int i = 0; i<arry.length; i++){
			System.out.print(arry[i]+",");
		}
		System.out.println();
	}
	
	public static void main(String[]args){
		int[] input = {4,5,1,2,7};
		bubble_sort(input);
	}

}
