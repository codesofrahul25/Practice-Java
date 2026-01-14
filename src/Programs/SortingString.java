package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class SortingString {

	public static void main(String[] args) {
		//method:1
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String name = sc.nextLine();
		char arr[] = name.toCharArray();
		Arrays.sort(arr);
		System.out.println("Sorted String: "+String.valueOf(arr)); */
		
		//methpd:2
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String name = sc.nextLine();
		char arr[] = name.toCharArray();
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted String: "+String.valueOf(arr));
		
	}

}
