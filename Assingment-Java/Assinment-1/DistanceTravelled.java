//Accept initial velocity,acceleration and time.Print the final velocity and the distance travelled.

import java.util.Scanner;

	public class DistanceTravelled{
		public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		double velocity,acceleration,time,finalvelocity,distance;

		System.out.println("Enter the Velocity :-");
		velocity=sc.nextDouble();
		
		System.out.println("Enter the acceleration :-");
		acceleration=sc.nextDouble();
		
		System.out.println("Enter the Time :-");
		time=sc.nextDouble();

	finalvelocity = velocity + acceleration * time;
	distance = velocity * time + 0.5 * acceleration * time * time;

		System.out.println("Final Velocity     :" + finalvelocity);
		System.out.println("Distance Travelled :" + distance);

	}

}
	