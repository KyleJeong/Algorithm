package forLogic;

import java.util.Scanner;

/*
 * 2007/01/01 is Monday
 * 2007/x/y, What day is this?
 */
public class Whatday {
	
	public static void main(String[]args){
		
		int monthsday[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		Scanner r = new Scanner(System.in);
		
		int month = r.nextInt();
		int day = r.nextInt();
		int sumday = 0;
		
		for(int i = 0; i < month - 1; i++){
			sumday = sumday + monthsday[i];
		}
		
		switch((sumday+day)%7){
			case 1 : System.out.println("MON"); break;
			case 2 : System.out.println("TUE"); break;
			case 3 : System.out.println("WED"); break;
			case 4 : System.out.println("THU"); break;
			case 5 : System.out.println("FRI"); break;
			case 6 : System.out.println("SAT"); break;
			default: System.out.println("SUN"); break;
		}
		
	}

}
