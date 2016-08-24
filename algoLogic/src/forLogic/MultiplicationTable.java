package forLogic;

import java.util.Scanner;

/*
 * To print out from N*1 to N*9
 */
public class MultiplicationTable {
	
	public static void main(String[]args){
		
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int c;
		
		for(int i = 1; i<10; i++){
			c = b * i;
			System.out.println(b+" * "+i+" = "+ c);
		}
	}
}
