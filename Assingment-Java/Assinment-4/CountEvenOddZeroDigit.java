//Write a program to accept an integer and count the number of even digits, odd and zero digits in given number

import java.util.Scanner;
	public class CountEvenOddZeroDigit{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter Number :");
			int num = sc.nextInt();

			int evenCount = 0 , oddCount = 0 ,zeroCount = 0;

			while(num > 0){
				int digit = num % 10;
		
			if(digit == 0 )
				zeroCount++;
				else if(digit % 2 == 0)
				evenCount++;
				else
					oddCount++;
				num = num /10;
			}
		System.out.println("Even Number :" + evenCount);
		System.out.println("Odd Number  :" + oddCount);
		System.out.println("Zero Number :" + zeroCount);

	}

}