import java.util.*;

public class ArrayMaps{
	public static void main(String[] args){
	
		// Primitive array
		int[] primeNumbers = {2,3,5,7,11,13};
		
		System.out.println("Length of primitive array : " + primeNumbers.length);
		
		
		// List array
		List list = new ArrayList();
		list.add(2);
		list.add(3);

		System.out.println("The element at index 1 : " + list.get(1)); // Get a specific list item
		System.out.println("Length of List array : " + list.size()); // Get size of list
		System.out.println("The list is : " + list.toString()); // Display whole list
		
	
		// Maps
		Map relation = new HashMap();
		
		relation.put("Father","Ronald");
		relation.put("Mother","Nancy");
		
		System.out.println("The father is " + relation.get("Father")); // Get father's name
		System.out.println("The relation map is " + relation.toString()); // Display Map
	}
}