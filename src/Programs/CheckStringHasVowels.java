package Programs;

import java.util.Scanner;

public class CheckStringHasVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String vowel = "";
		for(int i=0; i<name.length(); i++)
		{
			if(name.charAt(i) == 'a' ||name.charAt(i) == 'e' ||name.charAt(i) == 'i' ||
				name.charAt(i) == 'o' ||name.charAt(i) == 'u' )
			{
				vowel = vowel+name.charAt(i);
			}
		}
		if(vowel != "")
		{
			System.out.println("The name contains Vowels: "+vowel);
		}
		
		else
		{
			System.out.println("No vowels present in the string");
		}
	}

}
