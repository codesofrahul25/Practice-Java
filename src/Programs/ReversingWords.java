package Programs;

public class ReversingWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "I Love Java";
		String reverse = "";
		String[] words = sentence.split(" ");
		for(int i=words.length-1; i>=0; i--)
		{
			reverse = reverse+words[i]+" ";
		}
		System.out.println("Reversed sentence: "+reverse);
	}

}
