package stepByStep;

import java.util.Scanner;

public class SmallerThanX {
	
	public static void main(String[]args){
		
		Scanner ab = new Scanner(System.in);
		
		int A = ab.nextInt();
		int X = ab.nextInt();
		
		int size[] = new int[A];
		
		for(int i = 0; i<A ; i++){
			
			int a = ab.nextInt();
			size[i] = a;
		}
		
		for(int k = 0; k< size.length; k++){
			if(X> size[k]){
				System.out.print(size[k]+" ");
			}
		}
		
	}
}
