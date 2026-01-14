package Programs;

import java.util.HashMap;
import java.util.Map;

public class LastNonRepeatedCharacter {

	public static void main(String[] args) {
		String name ="swiss";
		Map <Character, Integer> map = new HashMap <Character, Integer>();
		
		for(char c: name.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(int i=name.length()-1; i>=0; i--)
		{
			if(map.get(name.charAt(i)) == 1)
			{
			System.out.println("Last Non Repeated Character: "+name.charAt(i));
			break;
			}
		}
	}

}
