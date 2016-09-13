package stepByStep;

import java.util.Scanner;

public class ArithmeticalSequence {
	
	void count(int a){
		
		int count = 0;
		
		if(a <= 1000){
			
			for(int i = 1; i<=a; i++){
				
				int thousandsDigit = i/1000;
				int hundredDigit = i/100%10;
				int tenDigit = i/10%10;
				int unitDigit = i%10;
				int temp0 = thousandsDigit - hundredDigit;
				int temp = hundredDigit - tenDigit;
				int temp1 = tenDigit - unitDigit;
				
				if(thousandsDigit != 0){
					if(temp0 == temp && temp==temp1){
						count = count + 1;
					}
				}else{
					if(hundredDigit != 0){
						if(99<i){
							if( temp == temp1){
								count = count + 1;
							}
							
						}
					}else{
						count = count + 1;
					}
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

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ArithmeticalSequence {

   public static void main(String[] args) throws IOException {
      
      BufferedReader    br             = new BufferedReader(new InputStreamReader(System.in));
      int          naturalNumber    = Integer.parseInt(br.readLine().trim());
      int            thousandsDigit   = 0;      // 1000의 자리 값
      int            hundredsDigit   = 0;      // 100의 자리 값
      int            tensDigit      = 0;      // 10의 자리 값
      int            numberOneSpot   = 0;      // 1의 자리 값
      
      int            resultCount      = 0;      // 출력 결과
      
      if (naturalNumber < 0 || naturalNumber > 1001) {
         return;
      }
      
      for (int i = 1; i <= naturalNumber; i++) {
         thousandsDigit         = i / 1000;
         hundredsDigit         = i / 100 % 10;
         tensDigit            = i / 10 % 10;
         numberOneSpot         = i % 10;

         if (thousandsDigit != 0) {
            if (thousandsDigit - hundredsDigit == hundredsDigit - tensDigit && hundredsDigit - tensDigit == tensDigit - numberOneSpot) {
               resultCount++;
            }
         }
         else {
            if (hundredsDigit != 0) {
               if (hundredsDigit - tensDigit == tensDigit - numberOneSpot) {
                  resultCount++;
               }
            }
            else {
               resultCount++;
            }
         }
      }
      System.out.println(resultCount);
   }
}
*/