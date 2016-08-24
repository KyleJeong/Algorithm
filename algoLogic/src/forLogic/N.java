package forLogic;

import java.util.Scanner;

/*
 * If you have a number N, you will display from 1 to N
 */
public class N {
	
	public static void main(String[]args){
		
		Scanner c = new Scanner(System.in);
		
		int a = c.nextInt();
		
		for(int i = 1; i<a+1; i++){
			System.out.println(i);
		}
		
	}
	
}
