package sorting;

public class BubbleSorting {
	
	public static void bubble_sort(int arry[]){
		
		int n = arry.length;
		int k;
		//�迭 ũ�⸸ŭ ȸ���� �Ѵ�
		for(int i = 0; i<n; i++){
			//�迭���� �ϳ� ���� ũ��� ���� ������ ���۵ȴ�
			for(int l = 0; l< n-1; l++){
				k = l + 1;
				//�յ� ��Ҹ� ��, ���� ũ�� ��ġ�� �����Ѵ�
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
