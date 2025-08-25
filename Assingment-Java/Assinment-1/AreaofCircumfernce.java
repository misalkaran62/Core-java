//Area of Circumference Programe:-

import java.util.Scanner;
	
	public class AreaofCircumfernce{
		public static void main(String[] args){

		double radius,area,circumference;
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enetr the Radius :-");
			radius=sc.nextDouble();
			
			area = Math.PI * radius * radius;
			circumference = 2 * Math.PI * radius;
				
			System.out.println("Area of Cricle :"+area);
			System.out.println("Cirecumference of Cricle :"+circumference);
		
		sc.close();
	}
}