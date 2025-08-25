//A library charges a fine for every book returned late. Accept the number of
//days the member is late, compute and print the fine as follows:(less than five
//days Rs fine, for 6 to 10 days Rs. Fine and above 10 days Rs. fine )

import java.util.Scanner;
		public class LibraryFine{
			public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter Days to Late : ");	
				int lateday = sc.nextInt();
				
				int fine = 0;
			
				if(lateday < 5){
					fine = lateday * 2;
				}
				else if(lateday <=10){
					fine = lateday * 3;
				}
				else{
					fine = lateday * 5;
				}

			System.out.println("Total Late Fine : " + fine);
	}

}