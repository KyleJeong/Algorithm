package sorting;

public class QuickSorting {
	
	private int[] arry;
	private int length;
	
	public void sort(int[] arry){
		this.arry = arry;
		this.length = arry.length;
		
		quickSort(0, length-1);
	}
	
	private void quickSort(int lowIndex, int highIndex){
		
		int pivot = arry[(lowIndex+(highIndex - lowIndex)/2)];
		int low = lowIndex;
		int high = highIndex;
		
		while(low <= high){
			while(pivot > arry[low]){
				low++;
			}
			while(pivot < arry[high]){
				high--;
			}
			if(low <= high){
				exchange(low,high);
				low++;
				high--;
			}
		}
		
		print();
		
		if(lowIndex < high){
			quickSort(lowIndex, high);
		}
		if(low < highIndex){
			quickSort(low, highIndex);
		}
		
	}
	
	public void exchange(int low, int high){
		int temp = arry[low];
		arry[low] = arry[high];
		arry[high] = temp;
	}
	
	public void print(){
		for(int i = 0; i< length; i++){
			System.out.print(arry[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[]args){
		QuickSorting aa = new QuickSorting();
		int bb[] = {10,2,3,99,1,7,-1,100};
		
		for(int a: bb){
			System.out.print(a+" ");
		}
		System.out.println();
		
		aa.sort(bb);
	}

}
