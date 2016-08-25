package stepByStep;

import java.util.Scanner;

/*
 * 1. Enter two values
 * 2. Show me result of Minus
 */
public class Minus {
	
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		int a,b ;
		a = sc.nextInt();
	    b = sc.nextInt();
		
		System.out.println(a-b);
		
	}
}
