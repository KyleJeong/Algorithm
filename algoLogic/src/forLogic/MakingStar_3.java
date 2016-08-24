package forLogic;

import java.util.Scanner;
public class MakingStar_3 {
	
	public static void main(String[]args){
		
		Scanner n = new Scanner(System.in);
		
		int a = n.nextInt();
		
		for(int i = 0; i<a; i++){
			
			for(int k = 0; k<a-i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
