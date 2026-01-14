package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountOfOccurence {

	public static void main(String[] args) {
		String name = "ramachandran";
		
		Map<Character, Integer>map = new HashMap<Character, Integer>();
		
		for(char c: name.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) 
		{
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

	}

}
