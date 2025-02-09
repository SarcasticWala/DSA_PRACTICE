
import java.util.Collections;
import java.util.LinkedList;


// Class
public class ArrayToLinkedList {

	// Main driver method
	public static void main(String[] args)
	{

		// Create an Array
		// here string type
		String[] strArr = { "G", "E", "E", "K", "S" };

		// Create an empty LinkedList
		LinkedList<String> linkedList
			= new LinkedList<String>();

		// Append all elements of array to linked list
		// using Collections.addAll() method
		Collections.addAll(linkedList, strArr);

		// Print the above LinkedList received
		System.out.println("Converted LinkedList : "+linkedList);
	}
}
