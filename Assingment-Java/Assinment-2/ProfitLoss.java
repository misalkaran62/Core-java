//. Accept the cost price and selling price from the keyboard. Find out if the
//seller has made a profit or loss and display how much profit or loss has been
//made?

import java.util.Scanner;
	public class ProfitLoss{
		public static void main(String args[]){
			
			Scanner sc = new Scanner(System.in);
			int SP,CP;
		
			System.out.println("Enetr the Selling Price : ");
			SP=sc.nextInt();
			
			System.out.println("Enetr the Cost Price :");
			CP=sc.nextInt();
			
			if(SP > CP){
				System.out.println("Profit is =" + (SP - CP));
			}
			else if (SP < CP){
				System.out.println("Loss is = " + (CP - SP));
			}
			else{
				System.out.println("No Profit && No Loss ");
			}
	}
}
			