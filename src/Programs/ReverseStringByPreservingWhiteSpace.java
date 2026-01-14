package Programs;

import java.util.Scanner;

public class ReverseStringByPreservingWhiteSpace {
	public static void main(String args[]) {
		// String name = "R A M A";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();
		char arr[] = name.toCharArray();
		char res[] = new char[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ') {
				res[i] = ' ';
			}
		}

		int j = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				while (j >= 0 && res[j] == ' ') {
					j--;
				}
				res[j] = arr[i];
				j--;
			}
		}

		System.out.println("Original name: " + name);
		System.out.println("Reversed name by preserving white space: " + String.valueOf(res));

		if (String.valueOf(res).equals(name)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}
}
