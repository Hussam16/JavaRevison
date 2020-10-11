package revision;

public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPerfect(33550336));

	}
public static boolean checkPerfect(int num) {
	int sum=0;
	boolean cond;
	for (int i = 1; i <= num; i++) {
		if (i==num) {break;}
        if (num % i==0) {sum=sum+i;}
			
		else if (i==0) {sum=0;}
			
		}
	

	boolean x = (sum==num)?  true: false;
	return x;
		
	}

}
