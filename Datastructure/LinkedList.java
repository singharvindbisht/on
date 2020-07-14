package Datastructure;
import Datastructure.MyLinkedList;	// Manually created Linked List

public class LinkedList {
	public static void main(String[] args) throws Exception
	{
		// Implementing Generic Linked List...
		
		MyLinkedList<String> obj = new MyLinkedList<>();
		obj.add("hello");
		obj.add("Arvind");
		obj.add("asku");
		obj.add("ajai");
		obj.add("raja");  
		System.out.println(obj.isEmpty());
		
		System.gc();	// Calling garbage collector immediately
		obj.remove(0);
		obj.printAll();
		obj.set(0, "As");
		obj.get(0);
		obj.printAll();
		
	}
}
