package stepByStep;

import java.util.Scanner;
/*
 * There are three integers, which integer is largest thing?
 */
public class SecondLargest {
	
	public static void main(String[]args){
		Scanner br = new Scanner(System.in);
		
		int f = br.nextInt();
		int s = br.nextInt();
		int t = br.nextInt();
		
		int scale[] = {f,s,t};
		int temp;
		
		if(scale[0] < scale[1]){
			temp = scale[0];
			scale[0] = scale[1];
			scale[1] = temp;
		}
		if(scale[1] < scale[2]){
			temp = scale[1];
			scale[1] = scale[2];
			scale[2] = temp;
		}
		if(scale[0] < scale[1]){
			temp = scale[0];
			scale[0] = scale[1];
			scale[1] = temp;
		}
		
		System.out.println(scale[1]);
		
		
	}
}
