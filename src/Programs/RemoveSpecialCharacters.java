package Programs;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "I# L#ove J#ava";
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<sentence.length(); i++)
		{
			char ch = sentence.charAt(i);
			if(Character.isLetterOrDigit(ch) || Character.isWhitespace(ch))
			{
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}

}
