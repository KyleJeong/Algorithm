package sorting;

public class SelectionSorting {
	
	public static void selection(int[]arry){
		
		//�迭 ũ�⸸ŭ ȸ��
		for(int i = 0;i<arry.length; i++){
			int index = i;
			//ù ��° ���� ��� ���� �˻��� �����Ѵ�
			for(int k = i+1; k<arry.length; k++){
				
				//�˻��� �ؼ� �������� ���� ã���� �ε����� ����
				if(arry[index] > arry[k]){
					index = k;
				}
			}
			//���� ���� ���� �� ���� ���� ��ȯ
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
