package stepByStep;
public class SelfNumber {

	   int calc (int number) {

	      int sum = 0;

	      if (number < 10000){

	         int a = number / 1000;
	         int b = number / 100 % 10;
	         int c = number / 10 % 10;
	         int d = number % 10;

	         sum    =    a + b + c + d + number;

	      }
	      return sum;
	   }

	   public static void main (String[] args) {

	      SelfNumber    aa       =    new SelfNumber();
	      int       arr[]    =   new int[10000];
	      int       number    =    1;

	      for(int i = 0; i < 10000; i++, number++) {

	         if (aa.calc(number) < 10000) {
	            arr[aa.calc(number)] = aa.calc(number);
	         }
	      }

	      for (int k = 1; k < arr.length; k++) {
	         if(arr[k] == 0) {
	            System.out.println(k);
	         }
	      }
	   }
	}


