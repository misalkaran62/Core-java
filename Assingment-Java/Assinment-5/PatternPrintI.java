//Write list of programs to print various pattern.

//01010
//01010
//01010
//01010
//01010

public class PatternPrintI{
	public static void main(String[] args){
		
		for(int i = 1;i <=5; i++){
			for(int j = 1;j <= 5; j++){
				if(j % 2 == 0)
					System.out.print("1");
				else
					System.out.print("0");
			}
			
		System.out.println();
		}
		
	}

}