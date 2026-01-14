package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrintingDuplicates {

	public static void main(String[] args) {
		String name = "ramachandran";
		
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		
		for(char c: name.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(Entry<Character, Integer> entry: map.entrySet())
		{
			if(entry.getValue() > 1)
			{
				System.out.println("Duplicate Character: "+entry.getKey()+" Duplicate Count: "+entry.getValue());
			}
		}
		
		

	}

}
