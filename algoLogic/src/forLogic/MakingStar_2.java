package forLogic;

import java.util.Scanner;
/*
1) Enter a Number N
2) You should make a tier star top
3) First layer line has a star, Second has two.....and Last layer has N star 
4) Layer size must be N
5) The shape of layer is right alignment
 */
public class MakingStar_2 {
	
	public static void main(String[]args){
		
		Scanner n = new Scanner(System.in);
		
		int a = n.nextInt();
		int temp = a;
		
		for(int i = 0; i<a; i++){
			for(int h = 1; h< temp; h++){
				System.out.print(" ");
			}
			temp--;
			
			for(int k = 0; k<i+1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
