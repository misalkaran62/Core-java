//5
//54
//543
//5432
//54321

public class PatternPrintII{
		public static void main(String[] args){
			
			for(int i=1;i <= 5;i++){
				for(int j = 5;j >= 6 -i;j--){
					System.out.print(j);
				}
			System.out.println();
			}
	}

}