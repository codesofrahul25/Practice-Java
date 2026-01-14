package Programs;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String name = "aabbccddee";
		
		Set set = new HashSet();
		
		for(char c: name.toCharArray())
		{
			set.add(c);
		}
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.append(set));
	}

}
