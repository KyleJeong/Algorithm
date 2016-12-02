package sorting;

public class InsertionSorting {
	
	public void insert(int[] arry){
		print(arry);
		//배열의 크기의 -1 만큼 회전
		for(int i = 1; i<arry.length; i++){
			//i의 값에 따라 값 비교를 시작 하기 때문에 --로 진행 
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
