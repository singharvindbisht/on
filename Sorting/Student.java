package Sorting;

public class Student{// implements Comparable<Student>{
	String name;
	int marks;
	
	public Student(String name, int marks)
	{
		this.name = name;
		this.marks = marks;
	}
	public void get()
	{
		System.out.println("Name "+name+" "+"Marks "+marks);
	}
	public void set(String name, int marks)
	{
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString()
	{
		return ("\nStudent "+name+" Marks "+marks);
	}
//	@Override
//	public int compareTo(Student o) {
//		if(this.marks!=o.marks)
//		{
//			if(this.marks>o.marks)	return -1;	// return 1 for increasing order
//			else if(this.marks<o.marks) return +1;	// return -1 for decreasing order
//			else
//				return 0;
//		}
//		else
//			return this.name.compareTo(o.name);
//	}
}
