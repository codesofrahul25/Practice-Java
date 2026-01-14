package Programs;

import java.util.Scanner;

public class ReversingString {

	public static void main(String[] args) {
		String name = "madam";
		String revName="";
		for(int i=name.length()-1; i>=0; i--)
		{
			revName = revName+name.charAt(i);
		}
		
		System.out.println("Reversed String: "+revName);
		
		if(revName.equals(name))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
		/*String name = "Rahul";
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		System.out.println(sb.reverse());*/

	}}
