//Accept the x and y coordinate of a point and find the quadrant in which the point lies

import java.util.Scanner;
	public class CoordinateXY{
		public static void main(String[] agrs){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter X Axis ");
			int x = sc.nextInt();
		
			System.out.println("Enter Y Axis ");
			int y = sc.nextInt();
	
			if( x == 0 && y == 0){
				System.out.println("Origin");
			}
			else if(x > 0 && y > 0)
				System.out.println("Quadrant First");
			else if(x < 0 && y > 0 )
				System.out.println("Quadrant Secound");
			else if(x < 0 && y < 0)
				System.out.println("Quadrant Third");
			else if(x > 0 && y < 0)
				System.out.println("Quadrant Four");
			else if(x == 0)
				System.out.println(" Y - Axis ");
			else if(y == 0)
				System.out.println(" X - Axis ");
			
	}
}

