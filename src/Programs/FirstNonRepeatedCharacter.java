package Programs;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String name = "swiss";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c: name.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(char c: name.toCharArray())
		{
			if(map.get(c)==1)
			{
				System.out.println("First Non Repeated Character: "+c);
				break;
			}
		}
    }
}
