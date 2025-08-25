//Accept the time as hour, minute and seconds and check whether the time is valid

import java.util.Scanner;
		public class TimeValidnNot{
			public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Hour Number ");
			int h = sc.nextInt();
		
			System.out.println("Enter Minute Number ");
			int m = sc.nextInt();
			
			System.out.println("Enter Secunds Number ");
			int s = sc.nextInt();
	
			if( h > 0 && h <= 23 && m > 0 && m <= 59 && s > 0 && s < 59){
				System.out.println("Valid Time : " + h + ":  " + m + ":  " + s + ":  ");
			}
			else{
				System.out.println("Time Invlid !!");
			}
	}
}