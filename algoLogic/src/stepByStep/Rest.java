package stepByStep;

import java.util.Scanner;

/*
 * 1. Enter three values
 * 2. Show me result of rest 
 */
public class Rest {
	
	public static void main(String[]args){
		
		Scanner br = new Scanner(System.in);
		
		int a = br.nextInt();
		int b = br.nextInt();
		int c = br.nextInt();
		
		System.out.println((a+b)%c);
		System.out.println((a%c + b%c)%c);
		System.out.println((a*b)%c);
		System.out.println((a%c * b%c)%c);
		
	}
}
