package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrintHighestOccuredCharacter {

	public static void main(String[] args) {
		String name = "ramachandran";
		char character = 0;
		int maxcount = 0;
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c: name.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		for(Entry<Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue() > maxcount)
			{
				maxcount = entry.getValue();
				character = entry.getKey();
			}
		}
		
		System.out.println(character+":"+maxcount);

	}

}
