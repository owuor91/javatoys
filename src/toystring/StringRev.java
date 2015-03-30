package toystring;

public class StringRev {

	public static void main(String[] args) {
		String word = "aquarium";
		String rev= "";
		int i=word.length();
		for(i=word.length()-1; i>-1; i--){
			//System.out.println(word.charAt(i));
			rev += word.charAt(i);
		}
		System.out.println(rev);
	}

}
