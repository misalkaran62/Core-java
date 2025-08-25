//Write a program to accept quantity and rate for three items, compute the
//total sales amount, Also compute and print the discount as follows: (amount > –
//20% discount, amount between to – 15% discount, amount between – to -- 8 %
//discount)

import java.util.Scanner;
	public class DiscountAmtquantity{
			public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter First Quentity ");
				int q1 = sc.nextInt();
				
				System.out.println("Enter First Rate Quentity ");
				int r1= sc.nextInt();

				
				System.out.println("Enter Secound Quentity ");
				int q2 = sc.nextInt();

				System.out.println("Enter Secound Rate Quentity ");
				int r2 = sc.nextInt();

				System.out.println("Enter third Quentity ");
				int q3 = sc.nextInt();

				System.out.println("Enter Third Rate Quentity ");
				int r3 = sc.nextInt();


				float total = (q1 * r1) + (q2 * r2) + (q3 * r3);
				System.out.println("Total :" + total);
				
				double discount;
				if(total > 10000){
					discount = total * 0.20;
				}
				else if(total >= 5000){
					discount = total * 0.15;
				}
				else if(total >=2000){
					discount = total * 0.08;
				}
				else {
					discount = 0;
				}
				
				double finalAmount = total - discount;
				

				System.out.println("Total Amount : " + total);
				System.out.println("Discount     : " + discount);
				System.out.println("Final Amount : " + finalAmount);
	}

}


		