package hashcode_and_equal;

import java.util.*;

class Student{
	int id;
	String name;
	public Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
//	Contract in hashing...
//	If two Objects are equal then there *hascode will be equal*
//	If two Objects hascode are equal then they may or may not be equal...

	
	
	
	@Override
	public boolean equals(Object obj)
	{
		Student that = (Student)obj;
		boolean isEqual = this.id == that.id && this.name.equals(that.name);
		return isEqual;
	}
	@Override
	public int hashCode()
	{
		return id+name.hashCode();
	}
}

public class HashCode {
	public static void main(String[] args)
	{
		Student obj = new Student(123, "arvind singh");
		Student obj1 =new Student(123, "arvind singh");
		System.out.println(obj==obj1);// see above contract
		Set<Student> set = new HashSet<>();
		set.add(obj);
		set.add(obj1);
		System.out.println(set);
		System.out.println(obj+"  "+obj1);
		System.out.println(obj);	// obj and obj1 hashcode
									// but they are not equal always.
		System.out.println(obj1);
		
	}
}
