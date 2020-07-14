package Sorting;

import java.util.*;

public class Sortingobject {
	public static void main(String args[])
	{
		List<Student> list = new ArrayList<>();
		list.add(new Student("arvind", 32));
		list.add(new Student("rajat", 12));
		list.add(new Student("akhil", 82));
		list.add(new Student("akhil", 73));
		Collections.sort(list, (o1, o2) ->
				{return o1.name.compareTo(o2.name);}
			
		);
		
		// This is lambda Expression of above comparator ..use it
//		Collections.sort(list, (o1, o2) ->
//			{
//				if(o1.name.equals(o2.name))
//					return o1.marks-o2.marks;
//				return o1.name.compareTo(o2.name);
//			});
//		
				
		
		System.out.println(list);
//		list.get(0).set("pretti", 92);
//		list.get(0).get();
		System.out.println();
		System.out.println(list);
	}
}

//class SortbyName implements Comparator<Student>{
//	
//}