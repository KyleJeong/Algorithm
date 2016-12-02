package sorting;

public class InsertionSorting {
	
	public void insert(int[] arry){
		print(arry);
		//�迭�� ũ���� -1 ��ŭ ȸ��
		for(int i = 1; i<arry.length; i++){
			//i�� ���� ���� �� �񱳸� ���� �ϱ� ������ --�� ���� 
			for(int j = i; j>0; j--){
				if(arry[j] < arry[j-1]){
					swap(arry,j);
				}
			}
			System.out.print("-"+i+" ");
			print(arry);
		}
	}
	
	public void swap(int[] arry,  int j){
		int temp = 0;
		temp = arry[j];
		arry[j] = arry[j-1];
		arry[j-1] = temp;
	}
	
	public void print(int[] arry){
		for(int b : arry){
			System.out.print(b+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		InsertionSorting aa = new InsertionSorting();
		int[] bb= {1,10,5,2,30,0,-5};
		
		aa.insert(bb);
	}
}
