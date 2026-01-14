package Programs;

public class RemovingCharacterFromString {

	public static void main(String[] args) {
		String name = "Programming";
		char remove = 'm';
		System.out.println("After removing: "+name.replace(String.valueOf(remove), ""));

	}

}
