//8. Accept a lowercase character from the user and check whether the character
//is a vowel or consonant


import java.util.Scanner;
	public class LowercaseVowel{
		public static void main(String[] agrs){
			
		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.println("Enetr Character :");
		ch=sc.next().charAt(0);
		
		if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')){
			System.out.println("This Is a Vowel Character !! ");
		}
		else{
			System.out.println("This is a Not Charcter !!");
		}

	}
	
}