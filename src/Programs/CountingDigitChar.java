package Programs;

import java.util.Scanner;

public class CountingDigitChar {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String name = sc.nextLine();
		int charCount = 0;
		int intCount = 0;
		int specialCount = 0;
		
		for(int i=0; i<name.length(); i++)
		{
			if(name.charAt(i) >= '0' && name.charAt(i) <= '9')
			{
				intCount++;
			}
			
			if(name.charAt(i) >= 'a' && name.charAt(i) <= 'z')
			{
				charCount++;
			}
			
			if(name.charAt(i)=='!' ||name.charAt(i)=='@' || name.charAt(i)=='#' ||
				name.charAt(i)=='$'||name.charAt(i)=='%'||name.charAt(i)=='^'||
				name.charAt(i)=='&'||name.charAt(i)=='*')
			{
				specialCount++;
			}
		}
		
		System.out.println("Total Characters: "+charCount);
		System.out.println("Total Digits: "+intCount);
		System.out.println("Total Special characters: "+specialCount);
	}
}
