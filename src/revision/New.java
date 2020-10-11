package revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = { "Arizona", "CA", "NY", "Nevada" };
		String type = "full";
		//System.out.println(filterStateNames(cars, type));
		String nawf[]=(filterStateNames(cars, type));
		for (int i = 0; i < nawf.length; i++) {
			System.out.println(nawf[i]);
			
		}
		

	}
	public static String [] filterStateNames(String[] arr, String type) {
				List modifiableList = new ArrayList(Arrays.asList(arr));
		// TODO Auto-generated method stub
		switch (type) {
		case "abb":
			for (int i = 0; i < modifiableList.size(); i++) {
				if (((String) modifiableList.get(i)).length() > 3) {
					modifiableList.remove(i);
				}
			}
			break;

		case "full":
			for (int i = 0; i < modifiableList.size(); i++) {
				if (((String) modifiableList.get(i)).length() < 3) {
					modifiableList.remove(i);
				}
			}
			break;

		}
		String[] myArray = (String[]) modifiableList.toArray(new String[modifiableList.size()]);
	return	myArray;
	
		
			
		}

}
