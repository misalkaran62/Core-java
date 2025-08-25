//.Accept the x and y coordinates of two points and compute the distance between the two points.

import java.util.Scanner;

	public class DistanceBetween{
		public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		double x1,x2,y1,y2,distance;
		
		System.out.println("Enter X1 :");
		x1=sc.nextDouble();
		
		System.out.println("Enter Y1 :");
		y1=sc.nextDouble();
		
		System.out.println("Enter X2 :");
		x2=sc.nextDouble();
		
		System.out.println("Enter Y2 :");
		y2=sc.nextDouble();

		distance=Math.sqrt(( x2 - x1) * ( x2 - x1 ) + ( y2 - y1 ) * ( y2 - y1 ));

		System.out.println("Distance = " + distance);
	}
}