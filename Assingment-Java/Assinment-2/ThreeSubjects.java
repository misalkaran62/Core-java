//Write a program to accept marks for three subjects and find the total marks
//secured , average and also display the class obtained. (Class I – above %, class
//II – % to %, pass class – % to % and fail otherwise)

import java.util.Scanner;
		public class ThreeSubjects{
			public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter First Marks : ");
				float m1 = sc.nextFloat();
		
				System.out.println("Enter Secound Marks : ");
				float m2 = sc.nextFloat();
			
				System.out.println("Enter third Marks : ");
				float m3 = sc.nextFloat();
		
				double total = m1 + m2 + m3;
				double avg = total / 3;
					
				System.out.println("Total Marks !! " + total);
				System.out.println("Avg Marks !! " + avg);

				if (avg >= 60){
					System.out.println("First Class A ");
				}else if(avg >= 50){
					System.out.println("Secound Class B ");
				}else if(avg >= 40){
					System.out.println("Third Class C ");
				}
				else{
					System.out.println(" Fail ");

				}

	}

}
				
					


				