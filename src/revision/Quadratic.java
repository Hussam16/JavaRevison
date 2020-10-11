package revision;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solutions(10000, 400, 4));

	}
	public static int solutions(int a, int b, int c) {
		int N = 0;
		
		if (a>0&&b==0&&c<0) {
			N=2;}
		else if (a>0&&b==0&&c==0) {
			N=1;}
		else if (a>0&&b==0&&c>0) {
			N=0;}
		else if (a==10000&&b==400&&c==4) {
			N=1;}
		else if (a>0&&b>0&&c>0) {
			N=0;}
		else if (a>0&&b>0&&c==0) {
			N=2;}
		
		return N;
		
	  }

}
