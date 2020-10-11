package revision;

public class SumArra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-1,-1,-1};
		System.out.println(sum(a));

	}
public static int sum(int[] arr) {
	
	int sum=0;
	for (int i = 0; i < arr.length; i++) {
		sum=sum+arr[i];
		
	}
	if (sum>0||sum<0) {
		return sum;
		
	}
	else {
		return 0;
		
	}
		
	}

}
