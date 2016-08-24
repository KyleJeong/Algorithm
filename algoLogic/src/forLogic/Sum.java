package forLogic;

import java.util.Scanner;

/*
 * 1) Enter a number N
 * 2) Add the numbers From 1 to N 
 */
public class Sum {

	public static void main(String[]args){
		
		Scanner ab = new Scanner(System.in);
		
		int a = ab.nextInt();
		int sum = 0;
		
		for(int i = 1; i<a+1; i++){
			sum = sum + i;
		}
		
		System.out.println(sum);
		
	}
}
