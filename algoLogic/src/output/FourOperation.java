package output;

import java.util.Scanner;

/*
 * 1. Enter two values
 * 2. Show me result of the four fundamental arithmetic operations
 */
public class FourOperation {
	
	public static void main(String[]args){
		
		Scanner r = new Scanner(System.in);
		
		int a = r.nextInt();
		int b = r.nextInt();
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		
	}
	
}
