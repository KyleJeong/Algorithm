package output;

import java.util.Scanner;
/*
 * 1. You enter two int values
 * 2. Two values result of division will be displayed in console
 * 3. But you have to calculate down to nine places of decimals
 */

public class Division {
	
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println( (double)a/ (double)b);
		
		
	}
}
