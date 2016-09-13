package stepByStep;

import java.util.Scanner;

public class ArithmeticalSequence {
	
	void count(int a){
		
		int count = 0;
		
		if(a <= 1000){
			
			for(int i = 1; i<=a; i++){
				
				int hundredDigit = i/100%10;
				int tenDigit = i/10%10;
				int unitDigit = i%10;
				int temp = hundredDigit - tenDigit;
				int temp1 = tenDigit - unitDigit;
				
				if(99<i){
					if( temp == temp1){
						count = count + 1;
					}
					
				}else{
					count = count + 1;
				}
			}
			
		}
		System.out.println(count);
	}
	
	public static void main(String[]args){
		ArithmeticalSequence cc = new ArithmeticalSequence();
		
		Scanner aa = new Scanner(System.in);
		int b = aa.nextInt();
		cc.count(b);
		aa.close();
		
	}

}
