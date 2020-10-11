package revision;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StateNames {

	public static void main(String[] args) {
		String[] cars = {"Arizona", "CA", "NY", "Nevada"};
		String type="abb";
		List<String>filter = filterStateNames(cars, type);
		
		// TODO Auto-generated method stub
	//	ArrayList<String> list = new ArrayList<>(Arrays.asList("Arizona", "CA", "NY", "Nevada"));
		//for (int i = 0; i < list.size(); i++) {
			//if (list.get(i).length()>3) {
				//list.remove(i);}}
		//for (int i = 0; i < list.size(); i++) {
		  //  System.out.println(list.get(i));}
		

	}
public static List<String> filterStateNames(String[] arr, String type) {
	List<String> list = Arrays.asList(arr);
	switch (type) {
	case "abb":
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length()>3) {
				list.remove(i);}}
		         break;
		         
		         case "full":
		     		for (int i = 0; i < list.size(); i++) {
		     			if (list.get(i).length()<3) {
		     				list.remove(i);}}
		     		         break;

	
	}
	return list;
		
	}

}
