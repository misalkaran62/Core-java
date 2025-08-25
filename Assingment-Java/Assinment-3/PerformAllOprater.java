//. Accept two numbers in variables x and y from the user and perform the following operations

import java.util.Scanner;
	public class PerformAllOprater{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter First Oparater X    :");
			int x =sc.nextInt();
		
			System.out.println("Enter Secound Oparater  Y :");
			int y =sc.nextInt();	
		
			System.out.println("~~~Choose an options~~~:");
			System.out.println("(1)Equality Check         :");
			System.out.println("(2)Less Than              :");
			System.out.println("(3)Quotient and Remainder :");
			System.out.println("(4)Range Check	       :");
			System.out.println("(5)Swapping	           :");
			System.out.println("Choice Number !!");

			int choice = sc.nextInt();
			
			switch(choice){
				case 1 :
					if(x == y)
						System.out.println("X and Y Are Equal ");
					else
						System.out.println("X and Y Not Equal ");
					break;
				case 2 :
					if(x < y)
						System.out.println("X is less than y ");
					else
						System.out.println("X is not less then y ");
					break;


				case 3 :
					if(y != 0)
					{
					int q = x / y;
					int r = x % y;
						System.out.println("Quotient = " + q + " , Remainder = " + r);
					 }
					else{
						System.out.println("Division by Zero Not Possible !!");
					}
					break;

				case 4 : 
						System.out.println("Enter another number :");
					int num = sc.nextInt();
					

					if(num >= x && num <= y)
						System.out.println("Number is in range ");
					else
						System.out.println("Number is not In Rang ");
					break;


				case 5 :
					int temp = x;
					x = y;
					y = temp;
					System.out.println("After Swap : X  = "+ x + ", Y = " + y);
					break;

				default:
						System.out.println("Invalid choice !! ");

				}
				

	}
}
						 
					
					