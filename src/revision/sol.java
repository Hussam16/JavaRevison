package revision;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class sol {

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	    	System.out.println("Enter number");
	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        String evenOdd = (N % 2 == 0) ? "even" : "odd";
	        switch (evenOdd) {
			case "odd":System.out.println("Weird");
				
				break;

			default:
				if (2<N&&N<5) {
					System.out.println("Not Weird");
					
				}
				else if (6<N&&N<=20) { System.out.println("Weird");
					
				}
				else if (N>20) { System.out.println("Not Weird");
					
				}
				break;
			}

	        

	        scanner.close();
	    }
	}


