package revision;

public class Kaprekar {

	public static void main(String[] args) {
		
		int n=6;
		int sum=0;
		int power=(int) Math.pow(n, 2);
		String str3 = String.valueOf(power);
		int size=str3.length();
		boolean isKaprekar=false;
		if (size==1||size<1) {
			isKaprekar =(n==power) ? true : false;
		
			}

		else if (size>1) {
			for (int i = 0; i < size; i++) {
				sum=sum+(int)str3.charAt(i);
				isKaprekar =(sum==9) ? true : false;
				
				}
			System.out.println(isKaprekar);
			
		}
	

	}
	public static boolean isKaprekar(int n) {
		
		int power=(int) Math.pow(n, 2);
		return false;
		
	  }

}
