package stepByStep;

import java.util.Scanner;
/*
 * 1) You have a number N
 * 2) Print out numbers backwards from N to 1
 */
public class CountBackward {
	
	public static void main(String[]args){
		
		Scanner c = new Scanner(System.in);
		
		int a = c.nextInt();
		
		for(int i = a; i>0; i-- ){
			System.out.println(i);
		}
		
	}

}
