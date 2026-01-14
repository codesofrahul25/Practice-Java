package Programs;

public class ReversingNumber {

	public static void main(String[] args) {
		int number = 1234;
		int temp2 = number;
		int temp = 0;
		while(number > 0)
		{
			temp = temp*10+number%10;
			number = number/10;
		}
		
		System.out.println("Reversed Number: "+temp);
		
		if(temp == temp2)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
		System.out.println("Not a Palindrome Number");
		}

	}

}
