package revision;

public class Challange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arrayOfMultiples(7, 5);
		int b[]=arrayOfMultiples(12, 10);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
			System.out.print(" ");
		}
		//System.out.println(Arrays.toString());		

		

	}
	public static int[] arrayOfMultiples(int num,int l){
		int[] myIntArray = new int[l];
		for (int i = 0; i < myIntArray.length; i++) {
			myIntArray[i]=(num*(i+1));
			
			
		}
		return myIntArray;

}
}
