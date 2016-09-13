package stepByStep;

public class MakingStar_5 {
	
	void makeStar(){
		
		int max = 3;
		
		for(int i = 1; i<4;i++){
			for(int k = 0; k<max-i; k++){
				System.out.print(" ");
			}
			
			if(i == 1){
				System.out.print("*");
			}else if(i == 2){
				for(int j = 0; j<3; j++){
					if(j == 1){
						System.out.print(" ");
					}else{
						System.out.print("*");
					}
				}
			}else{
				for(int l = 0; l<5; l++){
					System.out.print("*");
				}
			}
			if(i != 3){
				System.out.println();
			}
		}
	}
	
	
	public static void main(String[]args){
		
		MakingStar_5 aa = new MakingStar_5();
		int star = 6;
		int layer = star/3;
		int sumStar = 3;
		
		for(int i = 1 ; i<layer+1; i++){
			aa.makeStar();
		}
		
	}

}
