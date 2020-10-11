package revision;

public class Challange2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(		rps("scissors", "scissors"));
		

	}
	public static String rps(String s1,String s2) {
		String message = null;
		if (s1=="rock"&&s2=="paper") {
			 message="player 1 lose";}
		else if (s1=="paper"&&s2=="rock") {
			message="player 1 win";}
		else if (s1=="paper"&&s2=="scissors") {
			message="player 2 win";}
		else if (s1=="scissors"&&s2=="scissors") {
			message="draw";}
		else if (s1=="scissors"&&s2=="paper") {
			message="player 1 win";}
		
		return message;
		
		
	}

}
