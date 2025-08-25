public class CMD{
	public static void main(String[] args){
		
	if(args.length < 2)
		System.out.println("INVALID ARGUMENT !! ");
	else {
	float a = Float.parseFloat(args[0]);
	float b = Float.parseFloat(args[1]);

	System.out.println("Addition is : " + (a+b));
}

}

}
