package stepByStep;

import java.util.Scanner;

/*
 * Enter a score
 * 90~100 is A, 80~89 is B....
 */
public class TestScore {

	public static void main(String[]args){
		
		Scanner nr = new Scanner(System.in);
		
		int a = nr.nextInt();
		
		if(a <= 100 && a >= 90){
			System.out.println("A");
		}else if(a < 90 && a >= 80){
			System.out.println("B");
		}else if(a < 80 && a >= 70){
			System.out.println("C");
		}else if(a < 70 && a >= 60){
			System.out.println("D");
		}else{
			System.out.println("F");
		}
		
	}
}
