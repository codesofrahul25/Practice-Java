package Programs;

public class CheckStringContainsDigit {

	public static void main(String[] args) {
		String name = "Ram1234";
		boolean hasDigit = false;
		for(char c: name.toCharArray())
		{
			if(Character.isDigit(c))
			{
				hasDigit = true;
				System.out.print(c+" ");
			}
		}
		
		if(hasDigit != true)
		{
			System.out.println("No Digit");
		}

	}

}
