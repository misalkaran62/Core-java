//Accept any year as input through the keyboard. Write a program to check whether the year isa leap year or not.

import java.util.Scanner;
	public class LeapYear{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			int year;
		
			System.out.println("Enter the Year :");
			year=sc.nextInt();
		
			if(year % 400 ==0){
				System.out.println("This is Leap year");
			}
			else if( year % 100 == 0){
				System.out.println("This is Not Leap Year");
			}
			else if(year % 4 == 0){
				System.out.println("This is Leap year");
			}
			else {
				System.out.println("This is not leap year");
			}
	}
	
}