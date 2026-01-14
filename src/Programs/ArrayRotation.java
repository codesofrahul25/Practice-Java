package Programs;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int k=2;
		int n=arr.length;
		k=k%n;
		int temp[] = new int[n];
		
		//Left Rotate
		/*for(int i=0; i<n; i++)
		{
			temp[i] = arr[(i+k)%n];
		}
		
		for(int num: temp)
		{
			System.out.print(num+" ");
		}*/
		
		//Right Rotate
		for(int i=0; i<n; i++)
		{
			temp[(i+k)%n] = arr[i];
		}
		
		for(int num: temp)
		{
			System.out.print(num+" ");
		}
	}

}
