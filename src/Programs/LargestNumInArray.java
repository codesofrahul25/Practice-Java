package Programs;

public class LargestNumInArray {

	public static void main(String[] args) {
		int arr[] = {74,26,95,18,74,100};
		int large = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] > large)
			{
				large = arr[i];
			}
		}
		
		System.out.println("Largest Number in the array: "+large);

	}

}
