package stepByStep;

import java.util.Scanner;
public class MakingStar_4 {
	
	public static void main(String[]args){
		
		Scanner n = new Scanner(System.in);
		
		int a = n.nextInt();
		
		for(int i = 0; i<a; i++){
			for(int h = 0; h< i; h++){
				System.out.print(" ");
			}
			
			for(int k = 0; k<a-i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
