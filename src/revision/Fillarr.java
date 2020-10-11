package revision;
import java.util.Arrays; 


public class Fillarr {

	
	    public static void main(String[] args) 
	    { 
	    	squarePatch(5);
	       
	     
	        System.out.println(Arrays.deepToString(squarePatch(5))); 
	        
	    } 
	    public static int[][] squarePatch(int n) {
	    	 int [][]ar = new int [n][n]; 
	    	 for (int[] row : ar) 
		            Arrays.fill(row, n);
	    	 return ar;
	    	 
	    	
			
		}
	} 
