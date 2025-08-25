//Accept three dimensions length (l), breadth(b) and height(h) of a cuboid and
//print surface area and volume.

import java.util.Scanner;
	
	public class DimensionsCuboid{
		public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		float l , b , h , surfacearea , volume;
		System.out.println("Enter the length :");
		l = sc.nextFloat();
		
		System.out.println("Enter the Breadth :");
		b=sc.nextFloat();
			
		System.out.println("Enter the Height :");
		h=sc.nextFloat();

		volume = l * b * h;
		surfacearea = 2 * (l * b + b * h + h * l);
		
		System.out.println("Coudoid is     : " + volume);
		System.out.println("surfacearea is : " + surfacearea);
	}
}
		

	