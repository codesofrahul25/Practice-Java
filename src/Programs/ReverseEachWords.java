package Programs;

public class ReverseEachWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "I love Java";
		String[] words = sentence.split(" ");
		StringBuilder result = new StringBuilder();
		
		for(String word: words)
		{
			StringBuilder sb = new StringBuilder(word);
			result.append(sb.reverse().append(" "));
		}
		
		System.out.println(result);
	}

}
