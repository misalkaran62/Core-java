//Consider a room having one door and two windows both of the same size. Accept dimensions of the room, door and window. Print the area to be painted
//(interior walls) and area to be whitewashed (roof)

import java.util.Scanner;

	public class DimensionsRoom{
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		double l,h,w,ld,hd,lw,hw,totalWallArea,doorarea,windowarea,paintArea,roofArea;
		
		System.out.println("Enetr Room Lenght :");
		l=sc.nextDouble();

		System.out.println("Enetr Room Height :");
		h=sc.nextDouble();
		
		System.out.println("Enetr Room Width :");
		w=sc.nextDouble();
			
		System.out.println("Enter Door lenght :");
		ld=sc.nextDouble();
		
		System.out.println("Enter Door Height :");
		hd=sc.nextDouble();
		
		System.out.println("Enter Window Lenght :");
		lw=sc.nextDouble();
		
		System.out.println("Enter Window Height :");
		hw=sc.nextDouble();

		totalWallArea = 2 *(l * h + w * h);
		doorarea = ld * hd;
		windowarea = 2 * (lw * hw);

		paintArea = totalWallArea-doorarea-windowarea;
		roofArea = l * w;


	System.out.println("Painted Walls : " + paintArea );
	System.out.println("whitewashed Roof : " + roofArea );
   }
}
