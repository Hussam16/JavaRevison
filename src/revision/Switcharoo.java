package revision;

public class Switcharoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="3agl";
		System.out.println(flipEndChars(name));}
	
	// fuc that switch the last char & the first char
public static String flipEndChars(String s) {
	int lastIndex=s.length()-1;
	String message="";
	if (s.length()<2) {message="Incompatible.";}
	else {message=s.charAt(lastIndex)+s.substring(1, lastIndex)+s.charAt(0);}
	return message;}

}
