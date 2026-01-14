package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		String name = "test";
		
		String rev = "";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			rev = rev+name.charAt(i);
		}
		
		System.out.println(rev);
				
	}
	
}
