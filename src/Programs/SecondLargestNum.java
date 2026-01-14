package Programs;

public class SecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {27,84,21,83,95};
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		
		for(int num: arr)
		{
			if(num > largest)
			{
				secondlargest = largest;
				largest = num;
			}
			else if(num >secondlargest && num != largest)
			{
				secondlargest = num;
			}
		}
		
		System.out.println("Second Largest: "+secondlargest);
	}

}
