//A cashier has currency notes of denomination 1, 5 and 10. Accept the amount to
//be withdrawn from the user and print the total number of currency notes of each
//denomination the cashier will have to give.

import java.util.Scanner;
	public class CashierCurrency{
		public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int amount,oneNote,fiveNote,tenNote;	
		
		System.out.println("Enter the Amount : ");
		amount=sc.nextInt();
		
		tenNote = amount / 10;
		amount = amount % 10;

		fiveNote = amount / 5;
		amount = amount % 5;
		
		oneNote = amount;

	System.out.println("Ten Notes : " + tenNote);
	System.out.println("Five Notes : " + fiveNote);
	System.out.println("one Notes  : " + oneNote);

}

}
